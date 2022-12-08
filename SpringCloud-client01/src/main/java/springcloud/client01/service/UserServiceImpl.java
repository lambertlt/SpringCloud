package springcloud.client01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import springcloud.bean.entity.User;

import java.util.HashMap;
import java.util.Set;

/***
 * @author lambert
 * @date 2022-08-24
 * @explain
 ***/

@Service
public class UserServiceImpl {
    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    public Object getRedis() {
//        redisTemplate.opsForValue().set("a","1");
//        redisTemplate.opsForValue().set("b","2");
//        redisTemplate.opsForValue().set("c","3");
//        redisTemplate.opsForValue().set("d","4");
//        redisTemplate.opsForValue().set("e","5");

        //获取所有的key
        Set<String> keys = redisTemplate.keys("*");
//        System.out.println(keys);
        //创建集合
        HashMap<Object, Object> map = new HashMap<>();
        //循环
        for (String key : keys){
            //获取key对应的value
            Object value = redisTemplate.opsForValue().get(key);
            map.put(key,value);
            System.out.println(key);
            System.out.println(value);
        }
        return map;
    }

    public String getUserById(Integer id) {
        return "" + id;
    }

    public String getUserByName(User user) {
        return user.toString();
    }

    public String saveUser(User user) {
        return user.toString();
    }
}
