package udemy.spring.course.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Ari on 06.09.2018
 */
@RequestMapping("/vets")
@Controller
public class VetController {

    @RequestMapping({"", "/", "/index","/index.html"})
    public String listVets() {
        return "vets/index";
    }
}
