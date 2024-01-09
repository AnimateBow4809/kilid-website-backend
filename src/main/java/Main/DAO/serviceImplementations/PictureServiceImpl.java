package Main.DAO.serviceImplementations;

import Main.DAO.repos.PictureRepo;
import Main.DAO.serviceInterfaces.PictureService;
import Main.Utils.ImageUtils;
import Main.classes.Picture;
import Main.classes.PictureKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.awt.*;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.zip.DataFormatException;

@Service
@Transactional
public class PictureServiceImpl implements PictureService {
    private PictureRepo repo;

    @Autowired
    public PictureServiceImpl(PictureRepo repo) {
        this.repo = repo;
    }

    @Override
    public List<Picture> getPicturesById(Long id) {
        return repo.getPicturesById(id);
    }

    @Override
    public void addPicture(Picture picture) {
        repo.save(picture);
    }

    @Override
    public void deletePicture(Picture picture) {
        repo.delete(picture);
    }

    @Override
    public Picture findPrimary(Long id) {
        List<Picture>pictures=repo.getPicturesById(id);
        Optional<Picture> picture=pictures.stream().filter(Picture::isPrimary).findFirst();

        return picture.orElseGet(() -> pictures.get(0));
    }

    @Override
    public String uploadImage(MultipartFile imageFile,PictureKey key) throws IOException {
        var imageToSave = Picture.builder()
                .picture(ImageUtils.compressImage(imageFile.getBytes()))
                .pictureKey(key)
                .build();
        addPicture(imageToSave);
        return "completed";
    }

    @Override
    public byte[] downloadImage(Long id, Long pid) {
        Optional<Picture> dbImage = Optional.ofNullable(repo.findByPictureKey(id, pid));
        return dbImage.map(image -> {
            try {
                return ImageUtils.decompressImage(image.getPicture());
            } catch (DataFormatException | IOException exception) {
                throw new RuntimeException();
            }
        }).orElse(null);
    }
}