package com.lust.eurke;

import com.netflix.appinfo.ApplicationInfoManager;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import javax.annotation.PostConstruct;

/**
 * Created by magicdog on 2016/11/18.
 */
@SpringBootApplication
@EnableEurekaServer
@EnableAspectJAutoProxy
@Configuration
@EnableAutoConfiguration(exclude = {
        org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration.class})

public class ApplicationStart  implements InitializingBean {

    @Autowired
    private static ApplicationInfoManager applicationInfoManager;

    @Autowired
    private static EurekaClient eurekaClient;


    public static void main(String[] args){
        ConfigurableApplicationContext context = new SpringApplicationBuilder(new Object[] { ApplicationStart.class })
                .run(args);
    }



    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(this.applicationInfoManager);
        System.out.println(this.eurekaClient);
    }
}
