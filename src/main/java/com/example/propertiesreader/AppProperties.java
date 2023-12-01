package com.example.propertiesreader;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "myapp.car1")
public class AppProperties {
    private String colour;
    private int wheelsize;
    private int weight;
    private String brand;
    private String type;
}