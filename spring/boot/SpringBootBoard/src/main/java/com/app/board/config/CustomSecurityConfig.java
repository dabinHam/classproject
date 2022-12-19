package com.app.board.config;

import com.app.board.security.Custom403Handler;
import com.app.board.security.CustomLoginSuccessHandler;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

@Configuration
@Log4j2
public class CustomSecurityConfig {


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http.csrf().disable();

        /* 권한에 따른 접속 제한 설정  antMatchers() */
        // USER : /board/**, /reply/**, /todo/**
        // ADMIN : /admin/**
        // 나머지 요청 경로 : 모두 허가
        http.authorizeHttpRequests()
                .antMatchers("/board/**","/reply/**","/todo/**").hasRole("USER")
                .antMatchers("/admin/**").hasRole("ADMIN")
                .anyRequest().permitAll();  // 나머지

         /*form 로그인 페이지에 대한 설정, 성공시 처리 핸들러 등록*/
        http.formLogin().loginPage("/auth/login");  // "/auth/login" 요청의 페이지는 사용자가 직접 만들 페이지

         /*로그아웃*/
        http.logout().logoutUrl("/auth/logout").logoutSuccessUrl("/");
        // "/auth/logout" => Security가 자동 매핑
        // logoutSuccessUrl : 로그아웃이 성공하면 어디로 보낼지 , login 페이지로 보내고싶으면 따로 설정하지않아도 자동으로간다.


         /*자동로그인*/
        http.rememberMe().key("123456789").rememberMeParameter("remember-me").tokenValiditySeconds(60*60*60*24*7);
        // tokenValiditySeconds : 시간설정


        return http.build();
    }


    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationSuccessHandler successHandler() {
        return new CustomLoginSuccessHandler();
    }

    public AccessDeniedHandler accessDeniedHandler() {
        return new Custom403Handler();
    }



    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {

        log.info("------------web configure-------------------");

        return (web) -> web.ignoring().requestMatchers(PathRequest.toStaticResources().atCommonLocations());

    }
}
