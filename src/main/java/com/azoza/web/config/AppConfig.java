package com.azoza.web.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.mvc.jsp.JspMvcFeature;

public class AppConfig extends ResourceConfig {
    public AppConfig(){
        packages("com.azoza.web.controller");
        packages("com.azoza.web.middleware");

      register(JspMvcFeature.class);
      property(JspMvcFeature.TEMPLATE_BASE_PATH,"/WEB-INF/views");
         }
}
