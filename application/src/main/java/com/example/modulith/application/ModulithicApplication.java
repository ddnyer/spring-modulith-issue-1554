package com.example.modulith.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationExcludeFilter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.TypeExcludeFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.FilterType;
import org.springframework.modulith.Modulith;

@Modulith
@ComponentScan(
    basePackages = {
        "com.example.modulith.application",
        "com.example.modulith.generic",
    },
    excludeFilters = {
        @Filter(type = FilterType.CUSTOM, classes = TypeExcludeFilter.class),
        @Filter(type = FilterType.CUSTOM, classes = AutoConfigurationExcludeFilter.class)
    })
public class ModulithicApplication {

  public static void main(String[] args) {
    SpringApplication.run(ModulithicApplication.class, args);
  }

}
