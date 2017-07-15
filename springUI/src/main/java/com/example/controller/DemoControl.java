package com.example.controller;

import com.example.entity.DemoEntity;
import com.example.service.PersonHysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
@Controller
@RequestMapping(value="/")
public class DemoControl {

    @Autowired
    private PersonHysService personHysService;

    @RequestMapping(value = "persons", method = RequestMethod.GET)
    public String findByName(ModelMap modelMap){
        String name = "曾庆宝";
        return "personDemo";
    }

    @RequestMapping(value = "personss", method = RequestMethod.GET)
    @ResponseBody
    public List<DemoEntity> findByNames(ModelMap modelMap){
        String name = "曾庆宝";
        List<DemoEntity> demoEntities = personHysService.findByName(name);
        return demoEntities;
    }
}
