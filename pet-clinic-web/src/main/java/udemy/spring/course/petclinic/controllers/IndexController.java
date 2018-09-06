package udemy.spring.course.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Ari on 06.09.2018
 */
@Controller
public class IndexController {

    @RequestMapping({"","/","index","index.html"})
    public String index() {

        return "index";
    }
}
