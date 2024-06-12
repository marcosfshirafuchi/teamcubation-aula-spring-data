package com.bootcamp.aula_spring_data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AulaSpringDataApplication {
	/**
	 * <h1> Teamcubation - Aula de Spring Data</h1>
	 * criar o metodo de atualizar curso, podendo alterar nome ou descricao<br>
	 *         @PutMapping<br>
	 *         localhost:8080/courses/1<br>
	 *         -> 1) Consultar se o curso existe?<br>
	 *         -> 2) Se existe, atualizar a informação<br>
	 *         -> 3) se nao existe lançar excecao que nao existe<br>
	 *         -> 4) se salvou com sucesso retorna o course atualizado<br>
	 * <p>
	 * <b>Note:</b> Desenvolvido na linguagem Java.
	 *
	 * @author  Marcos Ferreira Shirafuchi
	 * @version 1.0
	 * @since   12/06/2024
	 */

	public static void main(String[] args) {
		SpringApplication.run(AulaSpringDataApplication.class, args);
	}

}
