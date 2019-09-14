package com.business.permission;

import com.business.permission.realm.FirstRealm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.filter.authc.LogoutFilter;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.DelegatingFilterProxy;

import java.util.LinkedHashMap;
import java.util.Map;

//使用springboot后，shiro的配置不再配置在springConfig.xml,这个文件被取代了，不存在了

@Configuration //只要加上这个注解，就相当于声明这个java类为spring的配置文件，可以有无数多个spring配置文件 ，本质这个配置文件就是用来创建bean实体对象的
public class shiroConfig {


        //配置一个shiro框架的过滤器工厂bean,用于创建shiro框架的过滤器
        @Bean("shiroFilter")
        public ShiroFilterFactoryBean shirFilter(DefaultWebSecurityManager securityManager) {
            ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
            // 必须设置 SecurityManager
            shiroFilterFactoryBean.setSecurityManager(securityManager);

            // 如果不设置默认会自动寻找Web工程根目录下的"/login.jsp"页面
            //访问的是后端url地址为 /login的接口
            shiroFilterFactoryBean.setLoginUrl("/syslogin.do");
            // 登录成功后要跳转的链接
            shiroFilterFactoryBean.setSuccessUrl("/index");
            // 未授权界面;
            shiroFilterFactoryBean.setUnauthorizedUrl("/403");
            // 拦截器.
            Map<String, String> filterChainDefinitionMap = new LinkedHashMap<String, String>();
            // 配置不会被拦截的链接 顺序判断
            filterChainDefinitionMap.put("/0001","anon");
            filterChainDefinitionMap.put("/static/**", "anon");
            filterChainDefinitionMap.put("/ajaxLogin", "anon");
            filterChainDefinitionMap.put("/userlogin", "anon");
            filterChainDefinitionMap.put("/syslogin.do", "anon");

            // 配置退出过滤器,其中的具体的退出代码Shiro已经替我们实现了

            filterChainDefinitionMap.put("/logout", "logout");

            //配置某个url需要某个权限码

            filterChainDefinitionMap.put("/hello", "perms[how_are_you]");

            // 过滤链定义，从上向下顺序执行，一般将 /**放在最为下边
            // <!-- authc:所有url都必须认证通过才可以访问; anon:所有url都都可以匿名访问-->
            filterChainDefinitionMap.put("/", "user");
            filterChainDefinitionMap.put("/**", "authc");
            shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
            System.out.println("Shiro拦截器工厂类注入成功");
            return shiroFilterFactoryBean;
        }

        @Bean("securityManager")
        public DefaultWebSecurityManager securityManager() {
            DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
            // 设置realm.
            securityManager.setRealm(firstRealm());
            // 自定义缓存实现 使用redis
            //securityManager.setCacheManager(cacheManager());
            // 自定义session管理 使用redis
            //securityManager.setSessionManager(sessionManager());
            return securityManager;
        }
        /**
         * 自定义realm;
         */
        @Bean("firstRealm")
        public FirstRealm firstRealm() {
            FirstRealm firstRealm = new FirstRealm();
            return firstRealm;
        }

    //配置登出过滤器
    @Bean
    public LogoutFilter logoutFilter(){
        LogoutFilter logoutFilter = new LogoutFilter();
        return logoutFilter;
    }

    //由于在java过滤器中通过User token = (User) SecurityUtils.getSubject().getPrincipal();
    // 获取当前的登录用户的信息，报UnavailableSecurityManagerException这个异常。
    //现在是spring boot框架里没有web.xml，所以解决起来直接写代码就可以了
    @Bean
    public FilterRegistrationBean delegationFilterProxy(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        DelegatingFilterProxy proxy = new DelegatingFilterProxy();
        proxy.setTargetFilterLifecycle(true);
        proxy.setTargetBeanName("shiroFilter");
        filterRegistrationBean.setFilter(proxy);
        return filterRegistrationBean;
    }


}
