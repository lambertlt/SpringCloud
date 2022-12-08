package springcloud.client02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springcloud.bean.entity.User;
import springcloud.client02.service.LoginServiceImpl;

/***
 * @author lambert
 * @date 2022-08-24
 * @explain
 ***/
@RestController
@RequestMapping("login")
public class LoginController {

    @Autowired
    LoginServiceImpl loginService;

    @GetMapping("id/{id}")
    String getUserById(@PathVariable Integer id) {
        return loginService.getUserById(id);
    }

    @GetMapping("name")
    String getUserByName(User user) {
        return loginService.getUserByName(user);
    }

    @PostMapping("")
    String saveUser(@RequestBody User user) {
        return loginService.saveUser(user);
    }
}
