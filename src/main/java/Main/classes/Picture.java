package Main.classes;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "property_images")
public class Picture {
    @Id
    @Column(name = "property_id")
    private Long propertyID;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "picture_id")
    private Long pictureID;

    @Lob
    @Column(name = "photo")
    private byte[] picture;

}
