package net.noelli.network.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;

import javax.servlet.ServletContextListener;

@SpringBootApplication
public class SpringFrameworkApplication{

    public static void main(String[] args) {
        xSuperSunGxUtils.getDBmanager.beginTransaction();

        SpringApplication.run(SpringFrameworkApplication.class, args);

    }


}
