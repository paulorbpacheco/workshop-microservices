package cloud.disciplina;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DisciplinaServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DisciplinaServiceApplication.class, args);
	}
	
	@Autowired
	DisciplinaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.save(new Disciplina(null, "Microservices", 80, new Date()));
		repository.save(new Disciplina(null, "Academia Arquiteto", 120, new Date()));
		repository.save(new Disciplina(null, "Academia Java", 120, new Date()));
		repository.save(new Disciplina(null, "Academia Web", 100, new Date()));
	}
}
