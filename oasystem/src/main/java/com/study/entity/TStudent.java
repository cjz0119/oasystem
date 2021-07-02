package com.study.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * InnoDB free: 11264 kB
 * </p>
 *
 * @author liangcy
 * @since 2021-06-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TStudent implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer id;

    private String name;

    private String password;

    private Integer points;

    private String email;

    private String phone;

    private Integer num;

    private String trueName;


}
