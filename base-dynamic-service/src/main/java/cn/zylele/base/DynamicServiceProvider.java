package cn.zylele.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(value = "classpath*:*.xml")
@SpringBootApplication
public class DynamicServiceProvider{
	
    public static void main(String[] args) {
    	
    	SpringApplication app = new SpringApplication(DynamicServiceProvider.class);
    	app.setWebEnvironment(false);
    	app.run(args);
    }

}