package com.example.springboot06datamybatis.config;

import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;

//自定义mybatis的配置规则
@org.springframework.context.annotation.Configuration
public class MybatisConfig {
    @Bean
    public ConfigurationCustomizer configurationCustomizer(){
        return new ConfigurationCustomizer(){
        @Override
            public  void customize(Configuration configuration){

            //设置驼峰命名规则
                 configuration.setMapUnderscoreToCamelCase(true);

             }
        };
    }
}
