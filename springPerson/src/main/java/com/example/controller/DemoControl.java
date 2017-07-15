package com.example.controller;

import com.example.entity.DemoEntity;
import com.example.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
@RestController
public class DemoControl {

    @Autowired
    private DemoRepository demoRepository;

    @RequestMapping(value = "/findByName", method = RequestMethod.POST)
    public List<DemoEntity> findByName(@RequestBody String name){
        List<DemoEntity> demoEntities = demoRepository.findByName(name);
        return demoEntities;
    }
}
