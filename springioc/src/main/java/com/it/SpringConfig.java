package com.it;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@PropertySource(value = "classpath:myConfig.properties" )
public class SpringConfig {
    @Bean
    public Student student(){
        return new Student();
    }
    @Bean
    public School school(){
        return new School();
    }
}
