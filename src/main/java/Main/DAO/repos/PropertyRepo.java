package Main.DAO.repos;

import Main.classes.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PropertyRepo extends JpaRepository<Property, Long> {


    @Query("select p from Property p where TYPE (p)=PropertyForSale")
    public List<PropertyForSale> getPropertyForSale();

    @Query("select p from Property p where TYPE (p)=PropertyForMortgage ")
    public List<PropertyForMortgage> getPropertyForMortgage();

    @Query("select p from Property p where TYPE (p)=PropertyForRent ")
    public List<PropertyForRent> getPropertyForRent();

    @Modifying
    @Query("update PropertyForSale p set p.age=:#{#pr.age}" +
            ",p.agencyID=:#{#pr.agencyID},p.area=:#{#pr.area}" +
            ",p.city=:#{#pr.city},p.description=:#{#pr.description}," +
            "p.numberOfRoom=:#{#pr.numberOfRoom},p.sellCost=:#{#pr.sellCost}" +
            ", p.title=:#{#pr.title},p.usage=:#{#pr.usage},p.zone=:#{#pr.zone} where p.propertyId=:#{#pr.propertyId}  ")
    public void updatePropertyForSale(PropertyForSale pr);


    @Modifying
    @Query("update PropertyForMortgage p set p.age=:#{#pr.age}" +
            ",p.agencyID=:#{#pr.agencyID},p.area=:#{#pr.area}" +
            ",p.city=:#{#pr.city},p.description=:#{#pr.description}," +
            "p.numberOfRoom=:#{#pr.numberOfRoom},p.mortgageCost=:#{#pr.mortgageCost}" +
            ", p.title=:#{#pr.title},p.usage=:#{#pr.usage},p.zone=:#{#pr.zone} where p.propertyId=:#{#pr.propertyId}")
    public void updatePropertyForMortgage(PropertyForMortgage pr);


    @Modifying
    @Query("update PropertyForRent p set p.age=:#{#pr.age}" +
            ",p.agencyID=:#{#pr.agencyID},p.area=:#{#pr.area}" +
            ",p.city=:#{#pr.city},p.description=:#{#pr.description}," +
            "p.numberOfRoom=:#{#pr.numberOfRoom},p.preCost=:#{#pr.monthlyRent},p.preCost=:#{#pr.preCost} " +
            ", p.title=:#{#pr.title},p.usage=:#{#pr.usage},p.zone=:#{#pr.zone} where p.propertyId=:#{#pr.propertyId}")
    public void updatePropertyForRent(PropertyForRent pr);


    @Modifying
    @Query("SELECT p FROM Property p " +
            "JOIN PropertyCondition pc ON p.propertyId = pc.propertyId " +
            "JOIN PropertyFacility pf ON p.propertyId = pf.propertyId " +
            "WHERE " +
            "( pc.convertible = '0' OR pc.convertible = :#{#pcInput.convertible} ) " +
            "AND ( pc.presale = '0' OR pc.presale = :#{#pcInput.presale} ) " +
            "AND ( pc.buildingLocation = '0' OR pc.buildingLocation = :#{#pcInput.buildingLocation} ) " +
            "AND ( pc.loan = '0' OR pc.loan = :#{#pcInput.loan} )" +
            "AND ( pc.newlyBuilt = '0' OR pc.newlyBuilt = :#{#pcInput.newlyBuilt} ) " +
            "AND ( pc.equity = '0' OR pc.equity = :#{#pcInput.equity} ) " +
            "AND ( pc.shoppingCenter = '0' OR pc.shoppingCenter = :#{#pcInput.shoppingCenter} ) " +
            "AND ( pc.mall = '0' OR pc.mall = :#{#pcInput.mall} ) " +
            "AND ( pf.parking = '0' OR pf.parking = :#{#pfInput.parking} ) " +
            "AND ( pf.lobby = '0' OR pf.lobby = :#{#pfInput.lobby} ) " +
            "AND ( pf.elevator = '0' OR pf.elevator = :#{#pfInput.elevator} ) " +
            "AND ( pf.pool = '0' OR pf.pool = :#{#pfInput.pool} ) " +
            "AND ( pf.sauna = '0' OR pf.sauna = :#{#pfInput.sauna} ) " +
            "AND ( pf.gym = '0' OR pf.gym = :#{#pfInput.gym} ) " +
            "AND ( pf.buildingGuard = '0' OR pf.buildingGuard = :#{#pfInput.buildingGuard} ) " +
            "AND ( pf.balcony = '0' OR pf.balcony = :#{#pfInput.balcony} ) " +
            "AND ( pf.rooftopGarden = '0' OR pf.rooftopGarden = :#{#pfInput.rooftopGarden} ) " +
            "AND ( pf.airCondition = '0' OR pf.airCondition = :#{#pfInput.airCondition} ) " +
            "AND ( pf.conferenceHall = '0' OR pf.conferenceHall = :#{#pfInput.conferenceHall} ) " +
            "AND ( pf.jacuzzi = '0' OR pf.jacuzzi = :#{#pfInput.jacuzzi} ) " +
            "AND ( pf.centralAntenna = '0' OR pf.centralAntenna = :#{#pfInput.centralAntenna} ) " +
            "AND ( pf.remoteControlledDoor = '0' OR pf.remoteControlledDoor = :#{#pfInput.remoteControlledDoor} ) " +
            "AND ( pc.cooperative = '0' OR pc.cooperative = :#{#pcInput.cooperative} ) " +
            "AND ( pc.barter = '0' OR pc.barter = :#{#pcInput.barter} ) " +
            "And p.numberOfRoom >= :numberOfRooms and p.age>=:minAge and p.age<=:maxAge " +
            "and p.area>=:minArea and p.area<=:maxArea and p.usage=:usage " +
            "and p.zone like %:zone% and p.city like %:city% and type(p)=:pType ")
    List<Property> joinOnPropertyConditionAndFacilities(PropertyCondition pcInput,
                                                        PropertyFacility pfInput, Long minAge, Long maxAge
            , Long numberOfRooms, Integer minArea, Integer maxArea,
                                                        String usage, String zone, String city, Long pType);

//we will divide every type for now


}
