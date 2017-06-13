package com.bangsun.nanjing.ConductProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

@Controller
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan
public class MyFirstSpringBoot {
	
//	@Value("${datasource.username}")
//	private String name;
//
//    @RequestMapping("/hello")
//    @ResponseBody
//    String home() {
//        return "Hello World!"+name;
//    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(MyFirstSpringBoot.class, args);
    }
}
