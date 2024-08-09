package com.lms.mentorservice;

import org.springframework.boot.SpringApplication;

public class TestMentorserviceApplication {

	public static void main(String[] args) {
		SpringApplication.from(MentorserviceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
