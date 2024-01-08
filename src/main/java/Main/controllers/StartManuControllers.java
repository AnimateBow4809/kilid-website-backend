package Main.controllers;


import Main.DAO.AgencyService;
import Main.DAO.UserService;
import Main.classes.NormalUser;
import Main.classes.RealStateAgency;
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
    private UserService userService;

    @Autowired
    private AgencyService agencyService;

    @GetMapping("/")
    public String getManu(Model model){
        String city="";
        model.addAttribute("city_name",city);
        return "manu";
    }

    @PostMapping("/")
    public String getManu1(Model model, @ModelAttribute String city){
        //TODO: read from the database and return a list of houses
//        userService.updateUserEmail(new NormalUser("adam","aest","fosffh bad"));
//        System.out.println(userService.getUsers());
        RealStateAgency agency=new RealStateAgency("updated","a","a","a","a","a");
        agency.setId(302L);
        agencyService.updateAgency(agency);
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
