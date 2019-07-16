package main.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class User {
    @Autowired
    StringBuilder name;

    public User() {
    }

    public User(StringBuilder name) {
        this.name = name;
    }

    public StringBuilder getName() {
        return name;
    }
 @Bean
    public StringBuilder name()
 {
     StringBuilder name=new StringBuilder("Stackrouter");
     return name;
 }
}
