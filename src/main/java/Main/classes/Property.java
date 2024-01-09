package Main.classes;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "property")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="property_type",
        discriminatorType = DiscriminatorType.INTEGER)
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name ="property_id" )
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "city")
    private String city;

    @Column(name = "zone")
    private String zone;

    @Column(name = "area")
    private Integer area;

    @Column(name = "usage")
    private String usage;

    @Column(name = "number_of_room")
    private String numberOfRoom;

    @Column(name = "age")
    private String age;

    @Column(name = "real_estate_id")
    private Long AgencyID;

    @Column(name = "description")
    private String description;

    public Property() {
    }

    public Property(Long id, String title, String city, String zone
            , Integer area, String usage, String numberOfRoom, String age, Long agencyID, String description) {
        this.id = id;
        this.title = title;
        this.city = city;
        this.zone = zone;
        this.area = area;
        this.usage = usage;
        this.numberOfRoom = numberOfRoom;
        this.age = age;
        AgencyID = agencyID;
        this.description = description;
    }
}
