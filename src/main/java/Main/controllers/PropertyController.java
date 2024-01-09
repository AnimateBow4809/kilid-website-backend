package Main.controllers;

import Main.DAO.serviceInterfaces.PictureService;
import Main.DAO.serviceInterfaces.PropertyConditionService;
import Main.DAO.serviceInterfaces.PropertyFacilityService;
import Main.DAO.serviceInterfaces.PropertyService;
import Main.Utils.Filter;
import Main.Utils.PropertyCombiner;
import Main.classes.Picture;
import Main.classes.Property;
import Main.classes.PropertyCondition;
import Main.classes.PropertyFacility;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/property")
public class PropertyController {

    @Autowired
    private PropertyService propertyService;

    @Autowired
    private PropertyFacilityService propertyFacilityService;

    @Autowired
    private PropertyConditionService propertyConditionService;

    @Autowired
    private PictureService pictureService;

    List<PropertyCombiner>propertyCombiners;

    @PostConstruct
    public void PropertyCombiners() {
        this.propertyCombiners = new ArrayList<>();
    }

    @GetMapping("/show")
    public List<PropertyCombiner> getLists(Filter filter) {
        List<Property> properties = propertyService.findByFiler(filter);
        for (Property property:properties) {
            propertyCombiners.add(new PropertyCombiner
                    (property, propertyFacilityService.getAllPropertyFacilityById(property.getId())
                            ,propertyConditionService.getAllPropertyConditionById(property.getId()),
                            pictureService.getPicturesById(property.getId())));
        }
        return propertyCombiners;
    }

    @PutMapping("/update")
    public PropertyCombiner updateProperty(@RequestBody PropertyCombiner propertyCombiner){
        propertyService.updateProperty(propertyCombiner.getProperty());
        propertyConditionService.updatePropertyCondition(propertyCombiner.getCondition());
        propertyFacilityService.updatePropertyFacility(propertyCombiner.getFacility());
        //TODO: setup picture support
        return propertyCombiner;
    }

    @DeleteMapping("/delete")
    public String deleteProperty(@RequestBody PropertyCombiner propertyCombiner){
        propertyFacilityService.deletePropertyFacility(propertyCombiner.getFacility());
        propertyConditionService.deletePropertyCondition(propertyCombiner.getCondition());
        propertyService.deleteProperty(propertyCombiner.getProperty());
        pictureService.removePictureByPictureKeyPropertyID(propertyCombiner.getProperty().getId());
        return "deleted";
    }

    @PostMapping("/add")
    public PropertyCombiner addProperty(@RequestBody PropertyCombiner propertyCombiner){
        propertyService.addProperty(propertyCombiner.getProperty());
        propertyFacilityService.addPropertyFacility(propertyCombiner.getFacility());
        propertyConditionService.addPropertyCondition(propertyCombiner.getCondition());
        for (Picture p: propertyCombiner.getPicture()) {
            pictureService.addPicture(p);
        }
        return propertyCombiner;
    }
}
