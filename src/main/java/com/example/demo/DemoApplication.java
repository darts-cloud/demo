package com.example.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    static Log log;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		log = LogFactory.getLog(DemoApplication.class);
        log.info("ログ出力");
	}

	@GetMapping("/")
	public String index() {
        log.info("ログ出力");
		return String.format("Hello %s!", "index");
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        log.info("ログ出力");
		return String.format("Hello %s!", name);
	}

}
