package com.shanshuan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Created by wangzifeng on 2019/12/9.
 */
@SpringBootApplication
public class EsApllication {
    public static void main(String[] args) {
        System.out.println("我是正确版本");
        System.out.println("我是错误版本");
        SpringApplication.run(EsApllication.class);
    }
}
