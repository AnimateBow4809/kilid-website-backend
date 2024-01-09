package Main.DAO.serviceInterfaces;

import Main.classes.PropertyCondition;

import java.util.List;

public interface PropertyConditionService {


    public void addPropertyCondition(PropertyCondition propertyCondition);

    public void deletePropertyCondition(PropertyCondition propertyCondition);

    public void updatePropertyCondition(PropertyCondition propertyCondition);

    public List<PropertyCondition> getAllPropertyCondition();

    public PropertyCondition getAllPropertyConditionById(Long id);

    public List<PropertyCondition> getMatchingPropertyCondition(PropertyCondition propertyCondition);

    public List<Long> getMatchingPropertyConditionId(PropertyCondition propertyCondition);


}
