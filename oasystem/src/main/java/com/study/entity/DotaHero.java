package com.study.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("dota_hero")
public class DotaHero{

    private static final long serialVersionUID=1L;
    @TableId(type= IdType.ID_WORKER)
    private Long heroId;

    private String cnName;

    private String enName;


}
