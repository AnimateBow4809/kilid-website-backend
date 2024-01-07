package Main.DAO;

import Main.classes.NormalUser;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.List;

@Repository
public class UserDAOimpl implements UserDAO {


    private EntityManager sessionFactory;

    @Autowired
    public UserDAOimpl(EntityManager sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @Transactional
    public NormalUser getUserPhone(String phoneNumber) {
        Session session = sessionFactory.unwrap(Session.class);
        List<NormalUser> normalUsers = session.createQuery("from NormalUser where phone_number=" + phoneNumber, NormalUser.class).list();
        return normalUsers.get(0);
    }

    @Override
    @Transactional
    public NormalUser getUserEmail(String email) {
        Session session = sessionFactory.unwrap(Session.class);
        Query<NormalUser>query=session.createQuery("from NormalUser where email=" + email, NormalUser.class);
        List<NormalUser> normalUsers = query.list();
        return normalUsers.get(0);
    }

    @Override
    @Transactional
    public List<NormalUser> getUsers() {
        Session session = sessionFactory.unwrap(Session.class);
        Query<NormalUser>query=session.createQuery("from NormalUser", NormalUser.class);
        List<NormalUser> normalUsers = query.list();
        return normalUsers;
    }

    @Override
    @Transactional
    public void updateUser(NormalUser normalUser) {
        Connection con = null;
        try {
            con= DriverManager.getConnection(
                    "jdbc:oracle:thin:@DESKTOP-GGUQE5R:1521:XE", "db_proj", "sirk");
            Statement stmt = con.createStatement();
            String q="update my_users set name='"+normalUser.getName()+
                    "',fname='"+ normalUser.getFname()+"',email='"+ normalUser.getEmail()+"'," +
                    "phone_number='"+normalUser.getPhoneNumber()+"' where id="+normalUser.getUserId() ;
            stmt.executeUpdate(q);

        }
        catch (Exception e) {
            System.out.println(e.getCause());
        }finally {
            try {
                con.commit();
                con.close();
            }catch (Exception e){}
        }

    }

    @Override
    @Transactional
    public void addUser(NormalUser normalUser) {
//        Connection con = null;
//        try {
//             con= DriverManager.getConnection(
//                    "jdbc:oracle:thin:@DESKTOP-GGUQE5R:1521:XE", "db_proj", "sirk");
//            Statement stmt = con.createStatement();
//            String q="insert into my_users values("+normalUser.getUserId()+",'"+normalUser.getName()+
//                    "','"+ normalUser.getFname()+"','"+ normalUser.getEmail()+"','"+normalUser.getPhoneNumber()+"')" ;
//            stmt.executeUpdate(q);
//
//        }
//        catch (Exception e) {
//            System.out.println(e.getCause());
//        }finally {
//            try {
//                con.commit();
//                con.close();
//            }catch (Exception e){}
//        }
        Session session = sessionFactory.unwrap(Session.class);
        session.save(normalUser);

    }

    @Override

    @Transactional
    public void deleteUser(NormalUser normalUser) {
        Session session = sessionFactory.unwrap(Session.class);
        session.beginTransaction();
        session.createQuery("delete from NormalUser where id=" + normalUser.getUserId()).executeUpdate();
        session.getTransaction().commit();
    }

}
