package springcloud.client01.szskj;

/***
 * @author lambert
 * @date 2022-09-20
 * @explain
 ***/

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PeopleAnnotion {
 public String say();

}