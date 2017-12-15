package org.reddragon.objectdb.demo.demoobjectdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



@SpringBootApplication
@EnableJpaRepositories // Needed when using objectdb
public class DemoObjectdbApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoObjectdbApplication.class, args);
	}

	// Needed when using objectdb
	@Bean
	public EntityManagerFactory entityManagerFactory() {
		return Persistence.createEntityManagerFactory("test.odb");
	}

	// Needed when using objectdb
	@Bean(name = "transactionManager")
	public PlatformTransactionManager transactionManager() {
		return new JpaTransactionManager(entityManagerFactory());
	}
}
