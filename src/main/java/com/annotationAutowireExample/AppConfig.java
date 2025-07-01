package com.annotationAutowireExample;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.annotationAutowireExample")
public class AppConfig {
}
