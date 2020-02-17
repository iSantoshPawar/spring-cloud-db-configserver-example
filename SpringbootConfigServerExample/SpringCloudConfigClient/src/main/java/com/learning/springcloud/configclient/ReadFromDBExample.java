package com.learning.springcloud.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * This class provide the example.
 * We can read directly the key.
 * <p>
 * example
 * Application/profile/label is provided in bootstrap.properties so
 * we can provide directly the key to fetch the value from db
 */
@RefreshScope
@RestController
class ReadFromDBExample {

    @Value("${key 1:Config Server is not working. Please check...key 1}")
    private String key1;

    @Value("${key 2:Config Server is not working. Please check... key 2}")
    private String key2;

    @Value("${key 3:Config Server is not working. Please check... key 3}")
    private String key3;

    @GetMapping("/key 1")
    public String getKey1() {
        return this.key1;

    }
    @GetMapping("/key 2")
    public String getKey2() {
        return this.key2;

    }

    @GetMapping("/key 3")
    public String getKey3() {
        return this.key3;

    }
}