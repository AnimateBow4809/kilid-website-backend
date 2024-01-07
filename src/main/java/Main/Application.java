package Main;

import Main.classes.NormalUser;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("Main.classes")
public class Application {

//    @Bean("entityManagerFactory")
//    public SessionFactory getSessionFactory(){
//        return new Configuration().addAnnotatedClass(NormalUser.class).configure("hibernate.cfg.xml").buildSessionFactory();
//
//    }


//
//    @Bean(name="entityManagerFactory")
//    public SessionFactory sessionFactory() {
//         SessionFactory in Hibernate 5 example
//        Configuration config = new Configuration();
//        config.configure();
//         local SessionFactory bean created
//        SessionFactory sessionFactory = config.buildSessionFactory();
//        return sessionFactory;
//    }



    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }


}
