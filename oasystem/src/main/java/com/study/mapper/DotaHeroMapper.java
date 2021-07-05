package com.study.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.study.entity.DotaHero;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.study.entity.Vo.HeroInfoVO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * <p>
 * InnoDB free: 11264 kB Mapper 接口
 * </p>
 *
 * @author liangcy
 * @since 2021-07-05
 */
public interface DotaHeroMapper extends BaseMapper<DotaHero> {

    @Select("select * from dota_hero")
    @Results({
            @Result(column="hero_id",property="heroId"),
            @Result(column="hero_id",property="leagues",
                    many=@Many(
                            select="com.study.mapper.DotaLeagueMapper.getListByHeroId"
                    )
            )
    })
    List<HeroInfoVO> getList();


}
