package com.itheima.reggie;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//加入这个注解，可以调用log方法，在控制台输出信息
@Slf4j
//1、创建启动类，看项目是否创建成功
//2、导入静态资源,写一个配置类来映射静态资源的访问路径
//3、后端登录功能开发
@SpringBootApplication
public class ReggieApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReggieApplication.class,args);
        log.info("项目启动成功...");
    }
}
