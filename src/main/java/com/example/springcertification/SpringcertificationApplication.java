

package com.example.springcertification;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringcertificationApplication implements CommandLineRunner, ApplicationRunner
{
	private static final Logger logger = LoggerFactory.getLogger(SpringcertificationApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(SpringcertificationApplication.class, args);
		logger.info("Spring Cert Project ");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Inside CommandLine Runner run method");
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Inside Application Runner run method");
	}
}
