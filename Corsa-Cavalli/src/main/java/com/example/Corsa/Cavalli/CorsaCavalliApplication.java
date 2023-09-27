package com.example.Corsa.Cavalli;

import com.example.Corsa.Cavalli.repository.ClassificaRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;

@EnableJpaRepositories
@SpringBootApplication
public class CorsaCavalliApplication {

	public static void main(String[] args) {
		SpringApplication.run(CorsaCavalliApplication.class, args);
	}

	@Bean
	public ApplicationRunner databaseCleanupRunner(JdbcTemplate jdbcTemplate) {
		return args -> {
			String sql = "DELETE FROM classifica";
			jdbcTemplate.update(sql);


		};
	}

	;
}
