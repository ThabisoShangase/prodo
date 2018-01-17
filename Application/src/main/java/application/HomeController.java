package application;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/ngena")
    public String ngena() {
        System.out.println("/phuma");
        return "Nah Phuma Please";
    }

    @RequestMapping("/login")
    public String login() {
        System.out.println("/login");
        return "<b>Please Login Dude</b>";
    }
}
