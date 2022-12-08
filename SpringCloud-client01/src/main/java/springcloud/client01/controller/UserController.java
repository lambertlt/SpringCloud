package springcloud.client01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springcloud.bean.entity.User;
import springcloud.bean.entity.annotation.MyField;
import springcloud.client01.service.UserServiceImpl;

/***
 * @author lambert
 * @date 2022-08-24
 * @explain
 ***/
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @GetMapping("version")
    @MyField(description = "getVersion")
    public String getVersion() {
        return "1.0";
    }

    @GetMapping("getRedis")
    public Object getRedis(){
        return userService.getRedis();
    }

    @GetMapping("id/{id}")
    public String getUserById(@PathVariable Integer id) {
        return "User(id: " + userService.getUserById(id) + ")";
    }

    @GetMapping("name")
    public String getUserById(User user) {
        return "User(id: " + userService.getUserByName(user) + ")";
    }

    @PostMapping("")
    public String getSex(@RequestBody User user) {
        return userService.saveUser(user);
    }
}
