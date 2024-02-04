package Main.DAO.serviceImplementations;

import Main.DAO.repos.PictureRepo;
import Main.DAO.serviceInterfaces.PictureService;
import Main.classes.Picture;
import Main.classes.PictureKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

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
    public Long findNextBiggestId(Picture picture){
       List<Picture>pictures= repo.getPicturesById(picture.getPictureKey().getPictureID());
       Long ans= Long.valueOf(1);
        for (int i = 0; i < pictures.size(); i++) {
            if (pictures.get(i).getPictureKey().getPictureID()>ans){
                ans=pictures.get(i).getPictureKey().getPictureID();
            }
        }
        return ans+1;
    }


    @Override
    public String uploadImage(String imageUrl,PictureKey key) throws IOException {
        var imageToSave = new Picture (key, imageUrl, true);
        addPicture(imageToSave);
        return "completed";
    }

    @Override
    public String downloadImage(Long id, Long pid) {
        Optional<Picture> dbImage = Optional.ofNullable(repo.findByPictureKey(id, pid));
        return dbImage.map(image -> {
            try {
                return image.getPicture();
            } catch (Exception exception) {
                throw new RuntimeException();
            }
        }).orElse(null);    }

    @Override
    public void removePictureByPictureKeyPropertyID(Long id) {
        repo.removePictureByPictureKeyPropertyID(id);
    }


}
