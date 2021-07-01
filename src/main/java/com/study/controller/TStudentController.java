package com.study.controller;


import com.study.entity.TStudent;
import com.study.mapper.TStudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * InnoDB free: 11264 kB 前端控制器
 * </p>
 *
 * @author liangcy
 * @since 2021-06-30
 */
@RestController
@RequestMapping("/study/tStudent")
public class TStudentController {
    @Autowired
    TStudentMapper tm;
@GetMapping
    public List<TStudent> lists(){
    return tm.selectList(null);
}
}

