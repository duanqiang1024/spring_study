package com.hillstone.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// 等价于 <bean id="user" class="com.hillstone.pojo.User"/>
@Component
@Scope("prototype")
public class User {
    public String name;
    //相当于 <property name="name" value="QIANGGE"/>
    @Value("QIANGGE")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
