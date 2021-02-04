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
public class VideoInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String title;

    private String synopsis;

    private Long starCount;

    private Long seeCount;

    private String coverImg;

    /**
     * 存文件夹的名，获取文件时asc排序获取
     */
    private String resourceUrl;

    private String categoryId;


}
