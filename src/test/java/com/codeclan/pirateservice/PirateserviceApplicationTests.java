package com.codeclan.pirateservice;

import com.codeclan.pirateservice.models.Pirate;
import com.codeclan.pirateservice.repositories.PirateRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PirateserviceApplicationTests {

	@Autowired
	PirateRepository pirateRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createSinglePirateAndSave(){
		Pirate pirate = new Pirate("Jack", "Sparrow", 32);
		pirateRepository.save(pirate);
	}

}
