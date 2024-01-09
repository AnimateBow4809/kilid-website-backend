package Main.DAO.serviceImplementations;

import Main.DAO.repos.PropertyRepo;
import Main.DAO.serviceInterfaces.PropertyService;
import Main.Utils.Filter;
import Main.Utils.PropertyCombiner;
import Main.classes.Property;
import Main.classes.PropertyForMortgage;
import Main.classes.PropertyForRent;
import Main.classes.PropertyForSale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class PropertyServiceImpl implements PropertyService {

    private PropertyRepo repo;

    @Autowired
    public PropertyServiceImpl(PropertyRepo repo) {
        this.repo = repo;
    }

    @Override
    public List<Property> getAllProperty() {
        return repo.findAll();
    }

    @Override
    public List<PropertyForSale> getPropertyForSale() {
        return repo.getPropertyForSale();
    }

    @Override
    public List<PropertyForMortgage> getPropertyForMortgage() {
        return repo.getPropertyForMortgage();
    }

    @Override
    public List<PropertyForRent> getPropertyForRent() {
        return repo.getPropertyForRent();
    }

    @Override
    public void addProperty(Property property) {
        repo.save(property);
    }

    @Override
    public void deleteProperty(Property property) {
        repo.delete(property);
    }

    @Override
    public void updateProperty(Property property) {
        if (property.getClass().equals(PropertyForMortgage.class)) {
            repo.updatePropertyForMortgage((PropertyForMortgage) property);
        } else if (property.getClass().equals(PropertyForRent.class)) {
            repo.updatePropertyForRent((PropertyForRent) property);
        } else {
            repo.updatePropertyForSale((PropertyForSale) property);
        }
    }

    @Override
    public List<Property> findByFiler(Filter filter) {
        List<Property>properties=repo.joinOnPropertyConditionAndFacilities(filter.getCondition(),filter.getFacility()
                ,filter.getMinAge(),filter.getMaxAge(),
                filter.getNumberOfRoom(),filter.getMinArea(),filter.getMaxArea(),filter.getUsage()
                ,filter.getZone(),filter.getCity());
        return properties;
    }
}
