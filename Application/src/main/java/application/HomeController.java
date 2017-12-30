package application;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/ngena")
    public String ngena() {
        return "Yah Ngena Please";
    }
}
