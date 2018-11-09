package com.business.permission;

import com.business.permission.pojo.SysUser;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

//这是springboot的启动类
// springboot提供了类似tomcat的中间件，web项目可以不需要web容器（tomcat）下的情况下能运行
@SpringBootApplication
@MapperScan("com.business.permission.dao")   //扫描dao层接口
//扫描服务层、表现层
@ComponentScan("com.business.permission")
public class shiroStarter {

    public static void main(String[] args){
        SpringApplication.run(shiroStarter.class,args);
    }

}