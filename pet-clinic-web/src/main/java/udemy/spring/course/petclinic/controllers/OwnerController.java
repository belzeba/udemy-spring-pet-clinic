package udemy.spring.course.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Ari on 06.09.2018
 */
@Controller
public class OwnerController {

    @RequestMapping({"/owners","/owners/index","/owners/index.html"})
    public String listOwners() {

        return "owners/index";
    }
}
