package de.mycourse.springboot.course.Controller;


import de.mycourse.springboot.course.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService ;


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginMessage(/*@RequestParam String name,*/ /*ModelMap model*/) {
        //model.put("name:", name);
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String showWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
        boolean isNotValid = loginService.validateUser(name, password);
        if (isNotValid) {
            return "login";
        } else {
            model.put("name:", name);
            model.put("password:", password);
            return "welcome";
        }
    }

}
