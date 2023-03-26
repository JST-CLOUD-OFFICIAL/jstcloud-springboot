package com.alibaba.jstcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.alibaba.jstcloud.dao"})
public class JstCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(JstCloudApplication.class, args);
	}

}
