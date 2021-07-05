package com.study.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.study.entity.Vo.HeroInfoVO;
import com.study.mapper.DotaHeroMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Wrapper;
import java.util.List;

/**
 * <p>
 * InnoDB free: 11264 kB 前端控制器
 * </p>
 *
 * @author liangcy
 * @since 2021-07-05
 */
@RestController
@RequestMapping("/study/dotaHero")
public class DotaHeroController {
@Autowired
    DotaHeroMapper dhm;
/*
查询所有的英雄以及所属英雄类别
*/
@GetMapping
public List<HeroInfoVO> getlist(){
    return dhm.getList();
}
}

