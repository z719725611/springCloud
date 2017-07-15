package com.example.service;

import com.example.entity.DemoEntity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Copyright © 2012-2050,dajia Co.,Ltd. All rights reserved.
 * This program is protected by copyright laws;
 * <p>
 * Program Name: springcloud
 * <p>
 * Description:
 * <p>
 * Created by zqb on 17/7/4
 *
 * @author zqb
 * @version 1.0
 */
@Service
public class PersonHysService {

    @Autowired
    PersonService personService;

    public List<DemoEntity> findByName(String name) {
        return personService.findByName(name);
    }

}
