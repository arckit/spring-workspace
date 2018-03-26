package org.arc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class App {
	
	public static void main(String args[]) {
		System.out.println("Kudos Arc!, You started your first Sping Boot app");
		SpringApplication.run(App.class,args);
		
	}

}
