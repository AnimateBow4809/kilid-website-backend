package Main.DAO.serviceInterfaces;

import Main.classes.PropertyFacility;

import java.util.List;

public interface PropertyFacilityService {

    public void addPropertyFacility(PropertyFacility propertyFacility);

    public void deletePropertyFacility(PropertyFacility propertyFacility);

    public void updatePropertyFacility(PropertyFacility propertyFacility);

    public List<PropertyFacility> getAllPropertyFacility();

    public PropertyFacility getAllPropertyFacilityById(Long id);

    public List<PropertyFacility> getMatchingPropertyFacility(PropertyFacility propertyFacility);

    public List<Long> getMatchingPropertyFacilityId(PropertyFacility propertyFacility);
}
