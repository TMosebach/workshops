package de.tmosebach.workshops.mybatis.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.jdbc.Sql;

@MybatisTest
class MitgliedRepositoryTest {
	
	@Autowired
	private MitgliedRepository mitgliedRepository;

	@Test
	@Sql("/insertMitglieder.sql")
	void testFindAll() {
		
		List<Mitglied> mitgieder = mitgliedRepository.findAll();
		mitgieder.forEach( mitglied -> System.out.println(mitglied) );
		assertEquals(3, mitgieder.size());
	}
}
