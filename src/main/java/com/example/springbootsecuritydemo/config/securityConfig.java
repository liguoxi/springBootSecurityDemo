package com.example.springbootsecuritydemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity  //开启WebSecurity模式
public class securityConfig extends WebSecurityConfigurerAdapter {

    // 授权规则
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // 首页所有人可以访问
        // 其他界面只有对应的角色（权限）才可以访问
        http.authorizeRequests().antMatchers("/").permitAll()
                .antMatchers("/Mycontroller/test").permitAll()
                .antMatchers("/Mycontroller/admin").hasRole("admin");
    }


}
