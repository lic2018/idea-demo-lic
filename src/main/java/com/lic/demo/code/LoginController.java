package com.lic.demo.code;

import com.lic.demo.anno.Authorized;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

//    @Authorized(hasRole = "admin")
//    @Authorized
    @RequestMapping("login")
    public String t01() {
        return "hello";
    }


}
