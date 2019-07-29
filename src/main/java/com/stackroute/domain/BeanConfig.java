package com.stackroute.domain;
import org.springframework.context.annotation.Bean;
public class BeanConfig {

  Actor actor1,actor2,actor3;

  @Bean(name = "actor1")
  public Actor getActor1(){

    actor1 = new Actor("keer","female",22);
    return actor1;
  }

  @Bean(name = "actor2")
  public Actor getActor2(){

    actor2 = new Actor("akhi","male",24);
    return actor1;
  }

  @Bean(name = "actor3")
  public Actor getActor3(){

    actor3 = new Actor("sruthi","female",25);
    return actor1;
  }


  @Bean(name = "movie1")
  public Movie getMovie1(){
    Movie movie1 = new Movie();

    movie1.setActor1(actor1);
    movie1.setActor2(actor2);
    movie1.setActor3(actor3);

    return movie1;
  }

  @Bean(name = "movie2")
  public Movie getMovie2(){
    Movie movie2 = new Movie();

    movie2.setActor1(actor1);
    movie2.setActor2(actor2);
    movie2.setActor3(actor3);

    return movie2;
  }


}
