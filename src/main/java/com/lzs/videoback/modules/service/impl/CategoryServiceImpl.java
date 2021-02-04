package com.lzs.videoback.modules.service.impl;

import com.lzs.videoback.modules.entity.Category;
import com.lzs.videoback.modules.mapper.CategoryMapper;
import com.lzs.videoback.modules.service.ICategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lzs
 * @since 2021-02-04
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {

    @Override
    public Integer test() {
        return baseMapper.test("a");
    }
}
