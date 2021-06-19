package de.tmosebach.workshops.mybatis.domain;

public class Mitglied {

	private Long id;
	private String vorname;
	private String nachname;
	
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
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	@Override
	public String toString() {
		return "Mitglied [id=" + id + ", vorname=" + vorname + ", nachname=" + nachname + "]";
	}
}
