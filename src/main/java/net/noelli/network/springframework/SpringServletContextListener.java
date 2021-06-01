package net.noelli.network.springframework;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class SpringServletContextListener implements ServletContextListener {


    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        xSuperSunGxUtils.getDBmanager.close();
        System.out.println("DBManager geschlossen");

    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {


    }
}
