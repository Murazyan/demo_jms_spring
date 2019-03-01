package com.example.demo_jms_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@SpringBootApplication
public class DemoJmsSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoJmsSpringApplication.class, args);

        ApplicationContext jmsContext = null;
        jmsContext = new FileSystemXmlApplicationContext(
                "C:\\Users\\muraz\\Desktop\\demo_jms_spring\\src\\main\\resources\\WEB-INF\\jmsContext.xml");
        SimpleMessageSender messageSender = (SimpleMessageSender) jmsContext
                .getBean("simpleMessageSender");

        // Create a session within the connection.
        messageSender.sendMessage("helloooooooooooo");
    }

}
