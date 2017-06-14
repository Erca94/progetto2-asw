package asw.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ProgettoAswZuulGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProgettoAswZuulGatewayApplication.class, args);
	}
}
