package springcloud.client01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication(scanBasePackages ={"springcloud.client01","springcloud.common.db.utils"})
//@MapperScan(basePackages = {"com.changgou.goods.dao"})
public class Client01Application {
    public static void main(String[] args) {
        SpringApplication.run(Client01Application.class);
    }
}
