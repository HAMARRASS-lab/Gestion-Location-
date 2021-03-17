package net.codejava;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Credentials {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcredentials;
	private String username;
	private String password;
	private int etat;
	private int employe;
	


	public Credentials() {
	
	}

	public Credentials(Long idcredentials, String username, String password, int etat, int employe
			) {
		super();
		this.idcredentials = idcredentials;
		this.username = username;
		this.password = password;
		this.etat = etat;
		this.employe = employe;
		
	}

	public Long getIdcredentials() {
		return idcredentials;
	}

	public void setIdcredentials(Long idcredentials) {
		this.idcredentials = idcredentials;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getEtat() {
		return etat;
	}

	public void setEtat(int etat) {
		this.etat = etat;
	}

	public int getEmploye() {
		return employe;
	}

	public void setEmploye(int employe) {
		this.employe = employe;
	}






}
