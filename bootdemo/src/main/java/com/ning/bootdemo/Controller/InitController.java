package com.ning.bootdemo.Controller;

import com.ning.bootdemo.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class InitController {
    @Value("${age}")
    private int age;
    @Value("${name}")
    private String name;

    @RequestMapping("/init")
    @ResponseBody
    public String init(){
        System.out.println(name+age);
        return "name"+name+"age:"+age;
    }
    //show Student
    //作业提交

}
