package app.code;

import app.shop.administration.Director;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContextExtensionsKt;
import org.springframework.context.support.AbstractApplicationContext;

public class ApplicationWithSpring {
    public static void main(String[] args){
        AbstractApplicationContext context = new AnnotationConfigApplicationContext("app.config");
        Director director = context.getBean(Director.class) ;
        director.manageCompany();
    }
}
