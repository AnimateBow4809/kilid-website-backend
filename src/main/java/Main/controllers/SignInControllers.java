package Main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sign")
public class SignInControllers {

//    @Autowired
//    private UserService userService;

//    @GetMapping("/")
//    public String getForm(Model model) {
//        System.out.println("hiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
//        String parameter = "";
//        model.addAttribute("parameter", parameter);
//        return "sign-in-page";
//    }

//    @PostMapping("/")
//    public String subForm(Model model, @ModelAttribute String parameter) {
//        TODO: make a regex to match if not send error
//        NormalUser normalUser = userDAO.getUserEmail(parameter);
//        if (normalUser == null) normalUser = userDAO.getUserPhone(parameter);
//        if (normalUser == null) {
//            normalUser = new NormalUser("karbar eziz", "", parameter);
//            userDAO.addUser(normalUser);
//        }
//        model.addAttribute("currentUser", normalUser);
//        return "profile";
//    }
}
