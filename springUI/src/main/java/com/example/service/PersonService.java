package com.example.service;

import com.example.entity.DemoEntity;
import java.util.List;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Copyright © 2012-2050,dajia Co.,Ltd. All rights reserved.
 * This program is protected by copyright laws;
 * <p>
 * Program Name: springcloud
 * <p>
 * Description:
 * <p>
 * Created by zqb on 17/7/3
 *
 * @author zqb
 * @version 1.0
 */
@FeignClient("person")
public interface PersonService {

    @RequestMapping(method = RequestMethod.POST, value = "/findByName", produces = MediaType.APPLICATION_JSON_VALUE,
        consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody List<DemoEntity> findByName(@RequestBody String name);
}
