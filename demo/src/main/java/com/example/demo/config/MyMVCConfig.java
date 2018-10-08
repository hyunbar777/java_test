package com.example.demo.config;

import com.example.demo.component.LoginHandlerInterceptor;
import com.example.demo.component.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MyMVCConfig extends WebMvcConfigurerAdapter {

//    @Override
//    public void addViewControllers(ViewControllerRegistry registry){
//
//        //浏览器发送 /Ritchie 请求到 success
//        registry.addViewController( "/ritchie").setViewName("/success");
//    }



    //
    @Bean//将组件注册到容器中
    public WebMvcConfigurerAdapter webMvcConfigurerAdapter(){
      WebMvcConfigurerAdapter adapter = new   WebMvcConfigurerAdapter(){

          @Override
          public void addViewControllers(ViewControllerRegistry registry){

              //浏览器发送 /Ritchie 请求到 success
              registry.addViewController( "/").setViewName("login");
              registry.addViewController( "/index.html").setViewName("login");
              registry.addViewController( "/main.html").setViewName("dashboard");

          }
          //注册拦截器
          @Override
          public void addInterceptors(InterceptorRegistry registry) {
              //super.addInterceptors(registry);
              registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
                     .excludePathPatterns("/index.html","/","/user/login","/asserts/**","/webjars/**");
          }
      };
      return  adapter;
    }
    @Bean
    public LocaleResolver localeResolver(){

        return  new MyLocaleResolver();
    }
}
