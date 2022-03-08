package com.ning.bootdemo.config;

import com.ning.bootdemo.pojo.Student;
import javafx.application.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Configuration
//带这个标签的设配置文件
public class MyConfig {
    @Bean
    public Student student() {
        return new Student();
    }

}

