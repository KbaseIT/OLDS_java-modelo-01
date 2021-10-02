package br.com.kbase.selection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SelectionApplication {

	@Autowired
	private ExampleRepository exampleRepository;

	public static void main(String[] args) {
		SpringApplication.run(SelectionApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void createExampleRecord() {
		Example example = new Example();
		example.setField01(1);
		exampleRepository.save(example);
	}

}
