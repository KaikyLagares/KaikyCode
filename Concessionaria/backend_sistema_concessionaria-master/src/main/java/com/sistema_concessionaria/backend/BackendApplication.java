package com.sistema_concessionaria.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
		try {
			System.out.println("");
			System.out.println("\033[0;32m" + "Backend iniciado com sucesso" + "\033[0m");
			System.out.println("O endpoit para acessar a API é: \033[0;32m" + "http://localhost:8080/{endpoint}" + "\033[0m");
		} catch (Exception e) {
			System.out.println("");
			System.out.println("\033[0;31m" + "Erro ao iniciar o backend" + "\033[0m");
			System.out.println(e);
		}
	}

}
