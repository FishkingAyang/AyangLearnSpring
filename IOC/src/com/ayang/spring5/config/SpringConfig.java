package com.ayang.spring5.config;

/**
 * @author Ayang
 * @date 2021/3/7 - 3:02
 */

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  //作为配置类，替代xml配置文件
@ComponentScan(basePackages = {"com.ayang"})
public class SpringConfig {

}

