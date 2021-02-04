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
public class ImgInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String title;

    private String synopsis;

    private Long starCount;

    private Long seeCount;

    private String coverImg;

    private String resourceUrl;

    private String categoryId;


}
