package com.lzs.videoback;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lzs.videoback.modules.mapper")
public class VideoBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(VideoBackApplication.class, args);
    }

}
