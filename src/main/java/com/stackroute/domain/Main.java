package com.stackroute.domain;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

    Movie movie1 = (Movie) context.getBean("moviebean",Movie.class);
    System.out.println(movie1);


  }
}
