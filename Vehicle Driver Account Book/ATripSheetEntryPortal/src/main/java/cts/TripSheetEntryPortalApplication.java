package cts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TripSheetEntryPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(TripSheetEntryPortalApplication.class, args);
	}

}
