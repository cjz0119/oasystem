package com.study.mapper;

import com.study.entity.DotaLeague;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * InnoDB free: 11264 kB Mapper 接口
 * </p>
 *
 * @author liangcy
 * @since 2021-07-05
 */
public interface DotaLeagueMapper extends BaseMapper<DotaLeague> {
    @Select("select * from dota_league " +
            " left join " +
            " dota_league_hero on dota_league.league_id=dota_league_hero.league_hero_league_id " +
            " where  dota_league_hero.league_hero_hero_id =#{heroId} ")
    List<DotaLeague> getListByHeroId(String heroId);
}
