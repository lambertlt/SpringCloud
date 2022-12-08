package springcloud.client02.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springcloud.bean.entity.User;
import springcloud.client02.feign.UserService;

/***
 * @author lambert
 * @date 2022-08-24
 * @explain
 ***/

@Service
public class LoginServiceImpl {
    @Autowired
    UserService userService;

    public String getUserById(Integer id) {
        return "" + userService.getUserById(id);
    }

    public String getUserByName(User user) {
        return userService.getUserByName(user);
    }

    public String saveUser(User user) {
        return userService.saveUser(user);
    }
}
