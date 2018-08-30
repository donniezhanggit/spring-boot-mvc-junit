package de.mycourse.springboot.course.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {

    public boolean validateUser(String userid, String password){
        return userid.equalsIgnoreCase("something") && password.equalsIgnoreCase("dummy");
    }

}
