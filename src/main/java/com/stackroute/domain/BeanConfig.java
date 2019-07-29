package com.stackroute.domain;
import org.springframework.context.annotation.Bean;
public class BeanConfig {

  @Bean(name = "actor")
  public Actor getActor(){

    Actor actor = new Actor();
    actor.setName("KEER");
    actor.setGender("female");
    actor.setAge(10);

    return actor;
  }
  @Bean(name = "actor2")
  public Actor getActor1(){

    Actor actor2 = new Actor();
    actor2.setName("KEER");
    actor2.setGender("female");
    actor2.setAge(10);

    return actor2;
  }
  @Bean(name = "actor3")
  public Actor getActor2(){

    Actor actor3 = new Actor();
    actor3.setName("KEER");
    actor3.setGender("female");
    actor3.setAge(10);

    return actor3;
  }

  @Bean(name = "movie1")
  public Movie getMovie(){
    Movie movie = new Movie();

    return movie;
  }
  @Bean(name = "movie2")
  public Movie movie(){
    Movie movie2 = new Movie();

    return movie2;
  }

}
