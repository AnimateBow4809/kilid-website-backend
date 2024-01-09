package Main.DAO.repos;

import Main.classes.Property;
import Main.classes.PropertyForMortgage;
import Main.classes.PropertyForRent;
import Main.classes.PropertyForSale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PropertyRepo extends JpaRepository<Property,Long> {


    @Query("select PropertyForSale from Property p where TYPE (p)=PropertyForSale")
    public List<PropertyForSale> getPropertyForSale();

    @Query("select PropertyForMortgage from Property p where TYPE (p)=PropertyForMortgage ")
    public List<PropertyForMortgage> getPropertyForMortgage();

    @Query("select PropertyForRent from Property p where TYPE (p)=PropertyForRent ")
    public List<PropertyForRent> getPropertyForRent();

    @Modifying
    @Query("update PropertyForSale p set p.age=:#{#pr.age}" +
            ",p.AgencyID=:#{#pr.agencyID},p.area=:#{#pr.area}" +
            ",p.city=:#{#pr.city},p.description=:#{#pr.description}," +
            "p.numberOfRoom=:#{#pr.numberOfRoom},p.sellCost=:#{#pr.sellCost}" +
            ", p.title=:#{#pr.title},p.usage=:#{#pr.usage},p.zone=:#{#pr.zone}")
    public void updatePropertyForSale(PropertyForSale pr);


    @Modifying
    @Query("update PropertyForMortgage p set p.age=:#{#pr.age}" +
            ",p.AgencyID=:#{#pr.agencyID},p.area=:#{#pr.area}" +
            ",p.city=:#{#pr.city},p.description=:#{#pr.description}," +
            "p.numberOfRoom=:#{#pr.numberOfRoom},p.mortgageCost=:#{#pr.mortgageCost}" +
            ", p.title=:#{#pr.title},p.usage=:#{#pr.usage},p.zone=:#{#pr.zone}")
    public void updatePropertyForMortgage(PropertyForMortgage pr);


    @Modifying
    @Query("update PropertyForRent p set p.age=:#{#pr.age}" +
            ",p.AgencyID=:#{#pr.agencyID},p.area=:#{#pr.area}" +
            ",p.city=:#{#pr.city},p.description=:#{#pr.description}," +
            "p.numberOfRoom=:#{#pr.numberOfRoom},p.preCost=:#{#pr.monthlyRent},p.preCost=:#{#pr.preCost} "+
            ", p.title=:#{#pr.title},p.usage=:#{#pr.usage},p.zone=:#{#pr.zone}")
    public void updatePropertyForRent(PropertyForRent pr);




}
