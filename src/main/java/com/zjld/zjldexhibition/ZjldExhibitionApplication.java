package com.zjld.zjldexhibition;

import com.zjld.zjldexhibition.config.interceptor.CommonInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@ImportResource("classpath:dubbo/dubbo.xml")
public class ZjldExhibitionApplication extends WebMvcConfigurerAdapter {

    public static void main(String[] args) {
        SpringApplication.run(ZjldExhibitionApplication.class, args);
    }

    @Bean
    public CommonInterceptor commonInterceptor(){return new CommonInterceptor(); }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        super.addInterceptors(registry);
        registry.addInterceptor(this.commonInterceptor()).addPathPatterns("/**");
    }
}

