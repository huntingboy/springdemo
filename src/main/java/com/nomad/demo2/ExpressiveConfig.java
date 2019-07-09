package com.nomad.demo2;

import com.nomad.demo1.BlankDisk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:/com/nomad/demo2/app.properties")
public class ExpressiveConfig {

    @Autowired
     private Environment env;

    //或者xml配置
    //<context:property-placeholder/>
    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
    @Bean
    public BlankDisk disk() {
        return  new BlankDisk(env.getProperty("disc.title", "默认标题"),
                env.getProperty("disc.content", "默认内容"));
    }

}
