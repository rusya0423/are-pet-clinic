package are.springframework.arepetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owners")
public class OwnerController {
    @RequestMapping({"", "/owners", "index", "/index.html" })
    public String listVets(){
        return "owners/index";
    }

}
