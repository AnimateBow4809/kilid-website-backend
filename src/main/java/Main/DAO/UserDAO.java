package Main.DAO;

import Main.classes.NormalUser;

import java.util.List;

public interface UserDAO {
    public NormalUser getUserPhone(String phoneNumber);

    public NormalUser getUserEmail(String email);

    public List<NormalUser> getUsers();

    public void updateUser(NormalUser normalUser);

    public void addUser(NormalUser normalUser);

    public void deleteUser(NormalUser normalUser);
}
