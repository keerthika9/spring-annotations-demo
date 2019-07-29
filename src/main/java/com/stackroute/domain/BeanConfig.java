package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.stackroute.domain")
public class BeanConfig {
  @Bean
  public Actor actor() {
    Actor actor = new Actor("sruthi", "female", 22);

    return actor;
  }

  @Bean
  public Actor actor2() {
    Actor actor2 = new Actor("keer", "female", 21);

    return actor2;
  }

  @Bean
  public Actor actor3() {
    Actor actor3 = new Actor("akhi", "male", 23);

    return actor3;

  }
}
