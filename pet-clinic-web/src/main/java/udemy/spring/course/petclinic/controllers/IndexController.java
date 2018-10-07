package udemy.spring.course.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Ari on 06.09.2018
 */
@RequestMapping("/")
@Controller
public class IndexController {

    @RequestMapping({"", "index", "index.html"})
    public String index() {
        return "index";
    }

    @RequestMapping("/oups")
    public String oupsHandler(Model model) {
        model.addAttribute("siteType", "error");
        return "notimplemented";
    }
}
