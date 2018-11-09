package com.business.weblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.business.weblog.dao") //扫描dao层接口
@EnableAspectJAutoProxy //开启AOP,默认是JDK代理
//扫描多个包，扫描服务层包，通知类包，控制层包，会对被@Service，@Controller,@RestController,@Component修饰的类创建Bean，并加入spring容器管理
@ComponentScan("com.business.weblog")
public class LogCtrApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(LogCtrApplication.class,args);
    }
}