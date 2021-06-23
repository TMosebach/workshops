package de.tmosebach.workshops.mybatis.domain;

public class Mitglied {

	private Long id;
	private String vorname;
	private String name;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Mitglied [id=" + id + ", vorname=" + vorname + ", name=" + name + "]";
	}
}
