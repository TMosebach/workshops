package de.tmosebach.workshops.mybatis.domain;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface MitgliedRepository {

	@Select("SELECT * FROM Mitglied")
	public List<Mitglied> findAll();
	
	@Insert("insert into mitglied (vorname, name) values (#{vorname}, #{name});")
	public int save(Mitglied mitglied);
	
	@Select("SELECT * FROM Mitglied WHERE id = #{id}")
	public Optional<Mitglied> findByPk(long id);
	
	@Update("UPDATE Mitglied set vorname = #{vorname}, name = #{name} WHERE id = #{id}")
	public int update(Mitglied mitglied);
	
	@Delete("DELETE FROM Mitglied WHERE id = #{id}")
	public int delete(long id);
}
