package de.tmosebach.workshops.mybatis.domain;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MitgliedRepository {

	@Select("SELECT * FROM Mitglied")
	public List<Mitglied> findAll();
}
