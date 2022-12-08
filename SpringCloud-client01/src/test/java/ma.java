import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @Author Lambert
 * @Date 2022/12/2 14:58
 ***/
@SpringBootTest
public class ma {

        @Autowired
        private RedisTemplate redisTemplate;

        @Test
        void contextLoads() {
            // 【RedisTemplate】 为操作 Redis 的工具封装类，
            // 包含 Redis 中各种数据类型的操作，和特殊数据类型的操作、事务操作等等

            // opsForValue --操作字符串，对应Redis中String类型
            // opsForList --操作list，对应Redis中List类型
            // opsForSet
            // opsForHash
            // opsForZSet
            // opsForGeo
            // opsForHyperLogLog

            //获取连接
            //RedisConnection connection = redisTemplate.getConnectionFactory().getConnection();
            //connection.flushDb();
            //connection.flushAll();

            redisTemplate.opsForValue().set("name", "zlc");
            System.out.println(redisTemplate.opsForValue().get("name"));
    }
}
