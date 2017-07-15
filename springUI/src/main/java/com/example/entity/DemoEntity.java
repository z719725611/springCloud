package com.example.entity;

import java.io.Serializable;

/**
 * Copyright © 2012-2050,dajia Co.,Ltd. All rights reserved.
 * This program is protected by copyright laws;
 * <p>
 * Program Name: demoForSpringboot
 * <p>
 * Description:
 * <p>
 * Created by zqb on 17/6/20
 *
 * @author zqb
 * @version 1.0
 */
public class DemoEntity implements Serializable {
    private Long id;

    private String name;

    private String sex;

    private String age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public DemoEntity(Long id, String name, String sex, String age) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public DemoEntity() {
    }

    @Override
    public String toString() {
        return "DemoEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
