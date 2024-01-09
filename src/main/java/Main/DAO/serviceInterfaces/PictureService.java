package Main.DAO.serviceInterfaces;

import Main.classes.Picture;
import Main.classes.PictureKey;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface PictureService {
    public List<Picture> getPicturesById(Long id);

    public void addPicture(Picture picture);
    public void deletePicture(Picture picture);

    public Picture findPrimary(Long id);

    public String uploadImage(MultipartFile imageFile, PictureKey pictureKey) throws IOException;

    public byte[] downloadImage(Long id,Long pid);
    public void removePictureByPictureKeyPropertyID(Long id);

}
