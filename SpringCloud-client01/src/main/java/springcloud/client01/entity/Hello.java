package springcloud.client01.entity;

import org.springframework.stereotype.Component;
import springcloud.bean.entity.annotation.MyField;

/***
 * @author lambert
 * @date 2022-09-22
 * @explain
 ***/
public enum Hello {
    @MyField(description = "你好")
    HELLO,
    @MyField(description = "嗨")
    HI,
}
