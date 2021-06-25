package de.tmosebach.workshops.mybatis.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;

@MybatisTest
class MitgliedRepositoryCRUDTest {
	
	@Autowired
	private MitgliedRepository mitgliedRepository;

	@Test
	void testCRUD() {
		Mitglied mitglied = new Mitglied();
		mitglied.setVorname("Sabine");
		mitglied.setName("Schmitt");
		
		int insertCount =  mitgliedRepository.save(mitglied);
		assertEquals(1, insertCount);
		
		List<Mitglied> mitglieder = mitgliedRepository.findAll();
		assertEquals(1, mitglieder.size());
		
		Mitglied sabine = mitglieder.stream()
			.filter( m -> m.getName().equals("Schmitt"))
			.findFirst()
			.get();
		Long idSabine = sabine.getId();
		
		sabine.setName("Schmidt");
		int updateCount = mitgliedRepository.update(sabine);
		assertEquals(1, updateCount);
		
		Optional<Mitglied> result = mitgliedRepository.findByPk(idSabine);
		assertTrue(result.isPresent());
		assertEquals(sabine, result.get());
		
		int deleteCount = mitgliedRepository.delete(idSabine);
		assertEquals(1, deleteCount);
		
		result = mitgliedRepository.findByPk(idSabine);
		assertTrue(result.isEmpty());
	}
}
