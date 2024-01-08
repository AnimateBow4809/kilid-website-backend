package Main.DAO;

import Main.classes.Picture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PictureRepo extends JpaRepository<Picture,Long> {
}
