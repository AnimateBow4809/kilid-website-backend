package Main.DAO.serviceImplementations;

import Main.DAO.repos.PropertyConditionRepo;
import Main.DAO.serviceInterfaces.PropertyConditionService;
import Main.classes.PropertyCondition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

//TODO:add missing function bodies
@Service
@Transactional
public class PropertyConditionServiceImpl implements PropertyConditionService {

    private PropertyConditionRepo repo;

    @Autowired
    public PropertyConditionServiceImpl(PropertyConditionRepo repo) {
        this.repo = repo;
    }

    @Override
    public void addPropertyCondition(PropertyCondition propertyCondition) {
        repo.save(propertyCondition);
    }

    @Override
    public void deletePropertyCondition(PropertyCondition propertyCondition) {
        repo.delete(propertyCondition);
    }

    @Override
    public void updatePropertyCondition(PropertyCondition propertyCondition) {

    }

    @Override
    public List<PropertyCondition> getAllPropertyCondition() {
        return repo.findAll();
    }

    @Override
    public PropertyCondition getAllPropertyConditionById(Long id) {
        Optional<PropertyCondition> propertyCondition = repo.findById(id);
        if (propertyCondition.isPresent()) {
            return propertyCondition.get();
        } else {
            throw new RuntimeException();
        }
    }

    @Override
    public List<PropertyCondition> getMatchingPropertyCondition(PropertyCondition propertyCondition) {
        return null;
    }

    @Override
    public List<Long> getMatchingPropertyConditionId(PropertyCondition propertyCondition) {
        return null;
    }
}
