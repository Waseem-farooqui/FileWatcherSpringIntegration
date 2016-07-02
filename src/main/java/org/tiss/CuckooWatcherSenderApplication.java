package org.tiss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@EnableAutoConfiguration
@ImportResource("classpath:/cuckoo-watcher-sender.xml")
public class CuckooWatcherSenderApplication {

	public static void main(String[] args) {
		SpringApplication.run(CuckooWatcherSenderApplication.class, args);
	}
}
