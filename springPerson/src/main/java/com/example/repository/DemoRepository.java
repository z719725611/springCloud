package com.example.repository;

import com.example.entity.DemoEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

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

public interface DemoRepository extends JpaRepository<DemoEntity, Long>, JpaSpecificationExecutor<DemoEntity> {

    List<DemoEntity> findByName(String name);
}
