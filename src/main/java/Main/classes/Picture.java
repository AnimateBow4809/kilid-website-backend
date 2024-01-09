package Main.classes;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.Type;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.Base64;

@Entity
@Data
@Table(name = "property_images")
@Builder
public class Picture {

    @EmbeddedId
    private PictureKey pictureKey;

    @Lob
    @Column(name = "photo")
    private byte[] picture;

    @Column(name = "is_primary")
    private boolean isPrimary;

    public Picture() {

    }

    public Picture(PictureKey pictureKey, byte[] picture, boolean isPrimary) {
        this.pictureKey = pictureKey;
        this.picture = picture;
        this.isPrimary = isPrimary;
    }

    public void buildImage(MultipartFile file) throws IOException {
        picture=file.getBytes();
    }
    public String generateBase64Image() {
        return Base64.getEncoder().encodeToString(this.picture);
    }

}
