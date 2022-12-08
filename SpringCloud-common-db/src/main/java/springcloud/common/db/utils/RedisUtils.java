package springcloud.common.db.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author Lambert
 * @Date 2022/12/5 0:24
 ***/
@Component
public class RedisUtils {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    public Boolean setKeyValue(Map map) {
        map.forEach((j, k) -> {
            redisTemplate.opsForValue().set((String) j, (String) k);
        });
        return true;
    }

    public Map findByKeys(String expression) {
        //获取所有的key
        Set<String> keys = redisTemplate.keys(expression);
        //创建集合
        HashMap<Object, Object> map = new HashMap<>();
        //循环
        assert keys != null;
        for (String key : keys) {
            //获取key对应的value
            Object value = redisTemplate.opsForValue().get(key);
            map.put(key, value);
            System.out.println(key);
            System.out.println(value);
        }
        return map;
    }
}
