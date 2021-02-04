package com.lzs.videoback.modules.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author lzs
 * @since 2021-02-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private String sort;

    private String parentId;

    private Long vipEndTime;


}
