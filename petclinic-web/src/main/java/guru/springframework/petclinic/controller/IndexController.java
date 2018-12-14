package guru.springframework.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Mohamed Traore
 */
@Controller
public class IndexController {

    @GetMapping({"/", "index", "index.html"})
    public String index(Model model) {
        return "index";
    }
}
