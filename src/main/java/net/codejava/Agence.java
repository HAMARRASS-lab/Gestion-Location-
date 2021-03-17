package net.codejava;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Agence {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAgence;
	private String nom;
	private String adresse;
	private String ville;
	private double tel;

	public Agence() {
	
	}

	public Agence(Long idAgence, String nom, String adresse, String ville, double tel) {
		super();
		this.idAgence = idAgence;
		this.nom = nom;
		this.adresse = adresse;
		this.ville = ville;
		this.tel = tel;
		
	}

	public Long getIdAgence() {
		return idAgence;
	}

	public void setIdAgence(Long idAgence) {
		this.idAgence = idAgence;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public double getTel() {
		return tel;
	}

	public void setTel(double tel) {
		this.tel = tel;
	}


}
