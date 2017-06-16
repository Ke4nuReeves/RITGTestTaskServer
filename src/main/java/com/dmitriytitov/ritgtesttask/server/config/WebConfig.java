package com.dmitriytitov.ritgtesttask.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Dmitriy Titov on 16.06.2017.
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.dmitriytitov.ritgtesttask.server")
public class WebConfig extends WebMvcConfigurerAdapter {
}
