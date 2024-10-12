package pe.edu.cibertec.app_cl2_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AppCl2ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppCl2ServerApplication.class, args);
	}

}
