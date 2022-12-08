package springcloud.client02.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import springcloud.bean.entity.User;

/***
 * @author lambert
 * @date 2022-08-24
 * @explain
 ***/

// url 和 name 是两种路径解析方式
@FeignClient(name = "client01", path = "user")
public interface UserService {
    @GetMapping(value = "id/{id}")
    String getUserById(@PathVariable Integer id);

    @GetMapping(value = "name")
    String getUserByName(@SpringQueryMap User user);

    @PostMapping(value = "")
    String saveUser(@RequestBody User user);
}
