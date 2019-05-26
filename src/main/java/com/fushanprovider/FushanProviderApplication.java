package com.fushanprovider;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration //dubbo支持注解
public class FushanProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(FushanProviderApplication.class, args);
    }

}
