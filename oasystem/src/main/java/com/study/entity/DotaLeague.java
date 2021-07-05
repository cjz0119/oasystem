package com.study.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * InnoDB free: 11264 kB
 * </p>
 *
 * @author liangcy
 * @since 2021-07-05
 */
@Data
@TableName("dota_league")
public class DotaLeague extends Model<DotaLeague> {

    private static final long serialVersionUID=1L;

    /**
     * id
     */
    private Long leagueId;

    /**
     * 联盟名称
     */
    private String leagueName;


}
