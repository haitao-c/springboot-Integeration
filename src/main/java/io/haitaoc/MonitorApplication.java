package io.haitaoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@EnableAutoConfiguration
@ComponentScan
//扫描 mybatis mapper 包路径, 注意导入的包是tk.mybatis.spring.annotation.MapperScan
@MapperScan(basePackages = "io.haitaoc.mapper")
@SpringBootApplication
public class MonitorApplication {
    public static void main(String[] args) {
        SpringApplication.run(MonitorApplication.class,args);
    }

}
