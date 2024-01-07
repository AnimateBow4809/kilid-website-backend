package Main.controllers;

import Main.DAO.UserDAO;
import Main.classes.NormalUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class StartManuControllers {

    @Autowired
    private UserDAO userDAO;

    @GetMapping("/")
    public String getManu(Model model){
        String city="";
        model.addAttribute("city_name",city);
        return "manu";
    }

    @PostMapping("/")
    public String getManu1(Model model, @ModelAttribute String city){
        //TODO: read from the database and return a list of houses
        userDAO.addUser(new NormalUser(12l,"tffffst","aest","madddaar","kir"));
//        System.out.println(userService.getUsers());
        return "manu";
    }

    @PostMapping("/sign")
    public String getForm(Model model) {
        String parameter = "";
        model.addAttribute("parameter", parameter);
        NormalUser normalUser =new NormalUser(1L,"test","test","test","tttt");
        System.out.println(normalUser +"\n\n\n\n\\n\n\\n");
//        userService.addUser(normalUser);
        return "sign-in-page";
    }




}
