package Main.DAO;

import Main.classes.Picture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class PictureServiceImpl implements PictureService{
    PictureRepo repo;

    @Autowired
    public PictureServiceImpl(PictureRepo repo) {
        this.repo = repo;
    }

    @Override
    public List<Picture> getPicturesById(Long id) {
        return null;
    }
}
