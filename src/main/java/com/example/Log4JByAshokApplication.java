package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.dao.ReportDao;
import com.example.service.MessageService;

@SpringBootApplication
public class Log4JByAshokApplication {

	public static void main(String[] args) {
		SpringApplication.run(Log4JByAshokApplication.class, args);
		System.out.println("modified code after clone");
                String college = "knit";
		String name = "Moiz";
		MessageService m = new MessageService();
		m.getWelcomeMsg();
		m.greetingMsg();
		
		ReportDao dao = new ReportDao();
		dao.getName(10);
	}

}
