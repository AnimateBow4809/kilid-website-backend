package Main.DAO.serviceInterfaces;

import Main.classes.Property;
import Main.classes.PropertyForMortgage;
import Main.classes.PropertyForRent;
import Main.classes.PropertyForSale;

import java.util.List;

public interface PropertyService {

    public List<Property> getAllProperty();

    public List<PropertyForSale> getPropertyForSale();

    public List<PropertyForMortgage> getPropertyForMortgage();

    public List<PropertyForRent> getPropertyForRent();

    public void addProperty(Property property);

    public void deleteProperty(Property property);

    public void updateProperty(Property property);

}
