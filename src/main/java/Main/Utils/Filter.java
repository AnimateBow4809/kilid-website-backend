package Main.Utils;

import Main.classes.PropertyCondition;
import Main.classes.PropertyFacility;
import jakarta.persistence.Column;
import lombok.Data;

@Data
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

}
