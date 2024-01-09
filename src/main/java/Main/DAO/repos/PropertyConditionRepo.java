package Main.DAO.repos;

import Main.classes.PropertyCondition;
import org.springframework.data.jpa.repository.JpaRepository;
//TODO: ADD QUERY
public interface PropertyConditionRepo extends JpaRepository<PropertyCondition,Long> {
}
