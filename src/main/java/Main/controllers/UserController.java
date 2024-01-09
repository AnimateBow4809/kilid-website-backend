package Main.controllers;

import Main.DAO.serviceInterfaces.UserService;
import Main.classes.NormalUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService service;


    @GetMapping("/show")
    public NormalUser getUser(@RequestBody String emailOrPhone){
        NormalUser normalUser=service.getUserEmail(emailOrPhone);
        if (normalUser==null){
            normalUser=service.getUserPhone(emailOrPhone);
            if (normalUser==null){
                normalUser=new NormalUser();
                if (emailOrPhone.contains("@")){
                    normalUser.setEmail(emailOrPhone);
                }else {
                    normalUser.setPhoneNumber(emailOrPhone);
                }
                service.addUser(normalUser);
            }
        }
        return normalUser;
    }


    @PutMapping("/update")
    public NormalUser updateUser(@RequestBody NormalUser user){
        if (user.getEmail().equals("")){
            service.updateUserPhone(user);
        }else {
            service.updateUserEmail(user);
        }
        return user;
    }


    @DeleteMapping("/delete")
    public String deleteUser(@RequestBody NormalUser user){
        service.deleteUser(user);
        return "successfully deleted user";
    }
}
