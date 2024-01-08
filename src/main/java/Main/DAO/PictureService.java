package Main.DAO;

import Main.classes.Picture;

import java.util.List;

public interface PictureService {
    public List<Picture> getPicturesById(Long id);
}
