package com.digitalInovationOne.springBootConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Value("${app.message}") //get from .properties
    private String appMessage;

    @Value("${ENV_DB_URL: NOTHING}")
    private String dbEnvironmentVariable;

    @GetMapping("/")
    private String getAppMessage () {
        return appMessage;
    }

    @GetMapping("/env")
    private String getDbEnvironmentVariable () {
        return "A seguinte variável de ambiente foi passada " + dbEnvironmentVariable;
    }
}
