package org.rohan.SimpleWebProj.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")  // for home page
    //@ResponseBody  // returns the data   // use this or simply @RestController
    public String greets() {
        return "Welcome from org.rohan";
    }

    @RequestMapping("/about")
    public String about(){
        return "This is about page !";
    }

}
