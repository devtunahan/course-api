package com.tunahan.courseapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// https://start.spring.io/ wo man Spring Projekt erstellen kann

//@SpringBootApplication Annotation, um zu sagen, dass es die Applikationsklasse ist, sprich wo die App starten soll

/**
 * Defaultkonfiguration wird geladen
 * Application context -> Container für alle Services
 * class path scan
 * Es wird ein Tomcat server gestartet
 */
@SpringBootApplication
public class CourseApiApplication {

	public static void main(String[] args) {
		// SpringApplication.run(source, args); source = welche Klasse die Applikation ist args = main args
		SpringApplication.run(CourseApiApplication.class, args);
	}

}
