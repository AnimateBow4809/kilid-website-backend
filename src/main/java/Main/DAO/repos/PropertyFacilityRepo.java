package Main.DAO.repos;

import Main.classes.PropertyFacility;
import org.springframework.data.jpa.repository.JpaRepository;
//TODO: ADD QUERY
public interface PropertyFacilityRepo extends JpaRepository<PropertyFacility,Long> {
}
