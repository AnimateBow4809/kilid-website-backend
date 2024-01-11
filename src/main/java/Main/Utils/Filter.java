package Main.Utils;

import Main.classes.PropertyCondition;
import Main.classes.PropertyFacility;
import jakarta.persistence.Column;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Filter {
    private PropertyFacility facility;
    private PropertyCondition condition;
    private String city;
    private String zone;
    private Integer minArea;
    private Integer maxArea;
    private String usage;
    private Long numberOfRoom;
    private Long minAge;
    private Long maxAge;
    private Long propertyType;
    //mortgage : ejare :2
    // rent : rahn : 3
    // sale :1



    public Filter(PropertyFacility facility, PropertyCondition condition, String city,
                  String zone, Integer minArea, Integer maxArea, String usage
            , Long numberOfRoom, Long minAge, Long maxAge, Long propertyType) {
        this.facility = facility;
        this.condition = condition;
        this.city = city;
        this.zone = zone;
        this.minArea = minArea;
        this.maxArea = maxArea;
        this.usage = usage;
        this.numberOfRoom = numberOfRoom;
        this.minAge = minAge;
        this.maxAge = maxAge;
        this.propertyType = propertyType;
    }
}
