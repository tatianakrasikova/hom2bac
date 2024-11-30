package app.config;

import app.shop.administration.Director;
import app.shop.administration.Manager;
import app.shop.personal.Cleaner;
import app.shop.personal.Receiver;
import app.shop.personal.Salesman;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Director director() {
        return  new Director();
    }
    @Bean
    public Manager manager() {
        return new Manager();
    }
    @Bean
    public Cleaner cleaner(){
        return new Cleaner();
    }
    @Bean
    public Receiver receiver() {
        return new Receiver();
    }
    @Bean
    public Salesman salesman() {
        return new Salesman();
    }
}
