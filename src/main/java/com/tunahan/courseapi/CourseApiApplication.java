package com.tunahan.courseapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@SpringBootApplication Annotation, um zu sagen, dass es die Applikationsklasse ist, sprich wo die App starten soll
@SpringBootApplication
public class CourseApiApplication {

	public static void main(String[] args) {
		// SpringApplication.run(source, args); source = welche Klasse die Applikation ist args = 
		SpringApplication.run(CourseApiApplication.class, args);
	}

}
