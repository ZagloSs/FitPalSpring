package com.fitpal.spring;

import com.fitpal.spring.controllers.UsuarioController;
import com.fitpal.spring.models.Usuario;
import com.fitpal.spring.services.UsuarioService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"com.fitpal.spring"})
public class Application {

	public static void main(String[] args) {


		SpringApplication.run(Application.class, args);
	}

}
