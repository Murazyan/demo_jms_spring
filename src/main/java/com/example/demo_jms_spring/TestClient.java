//package com.example.demo_jms_spring;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;
//
//
//public class TestClient {
//
//	@SuppressWarnings("resource")
//	public static void main(String[] args) throws Exception {
//		ApplicationContext jmsContext = null;
//		jmsContext = new FileSystemXmlApplicationContext(
//				"path/to/jmsContext.xml");
//		SimpleMessageSender messageSender = (SimpleMessageSender) jmsContext
//				.getBean("simpleMessageSender");
//
//		// Create a session within the connection.
//		messageSender.sendMessage("hello");
//	}
//}