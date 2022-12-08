package springcloud.client01.entity;

import org.checkerframework.checker.units.qual.C;
import org.springframework.stereotype.Component;
import springcloud.bean.entity.annotation.MyField;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/***
 * @author lambert
 * @date 2022-09-22
 * @explain
 ***/
public class People {
    @MyField(description = "用户名")
    private String name;
    @MyField(description = "性别")
    private String sex;

    public static void main(String[] args) {
        People people = new People();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
