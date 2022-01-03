package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable(); // csrはは無効 

        // 認証の設定
        http.authorizeRequests()
            .antMatchers("/login").permitAll() // login
            .anyRequest().authenticated();

        // ログイン画面
        http.formLogin() // デフォルののログイが画をを利用
            .loginPage("/login")
            .usernameParameter("user")
            .passwordParameter("password")
            .defaultSuccessUrl("/sample",true);//ログイン後の遷移先
    }
}
