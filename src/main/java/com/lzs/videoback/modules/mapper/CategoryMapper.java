package com.lzs.videoback.modules.mapper;

import com.lzs.videoback.modules.entity.Category;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lzs
 * @since 2021-02-04
 */
public interface CategoryMapper extends BaseMapper<Category> {


    Integer test(@Param("a") String a);
}
