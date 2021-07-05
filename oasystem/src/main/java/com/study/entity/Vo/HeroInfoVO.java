package com.study.entity.Vo;

import com.study.entity.DotaHero;
import com.study.entity.DotaLeague;
import lombok.Data;

import java.util.List;

@Data
public class HeroInfoVO extends DotaHero {
    private List<DotaLeague> leagues;
}
