package myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Now supports Travis
//Now also Heroku activated
//V2
@SpringBootApplication
 //@Import (SwaggerConfig.class) //for Swagger documentation - Swagger home
// http://localhost:8080/swagger-ui.html
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}
}