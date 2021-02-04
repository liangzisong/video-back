package com.lzs.videoback.modules.controller;


import com.lzs.videoback.modules.entity.Category;
import com.lzs.videoback.modules.service.ICategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lzs
 * @since 2021-02-04
 */
@RestController
@RequestMapping("/modules/category")
@Slf4j
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    @GetMapping("test")
    public List<Category> test(){
        Integer count = categoryService.test();
        log.info("count="+count);
        return categoryService.list();
    }
}
