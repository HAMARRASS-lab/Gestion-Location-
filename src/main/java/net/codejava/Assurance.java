package net.codejava;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Assurance {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAssurance;
	private String vehicule;
	private String numPolice;
	private String description;
	private double montant;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateDebut;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateFin;
	


	public Assurance() {
	
	}

	public Assurance(Long idAssurance, String vehicule, String numPolice, String description, double montant,
			Date dateDebut, Date dateFin) {
		super();
		this.idAssurance = idAssurance;
		this.vehicule = vehicule;
		this.numPolice = numPolice;
		this.description = description;
		this.montant = montant;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}



	public Long getIdAssurance() {
		return idAssurance;
	}



	public void setIdAssurance(Long idAssurance) {
		this.idAssurance = idAssurance;
	}



	public String getVehicule() {
		return vehicule;
	}



	public void setVehicule(String vehicule) {
		this.vehicule = vehicule;
	}



	public String getNumPolice() {
		return numPolice;
	}



	public void setNumPolice(String numPolice) {
		this.numPolice = numPolice;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public double getMontant() {
		return montant;
	}



	public void setMontant(double montant) {
		this.montant = montant;
	}



	public Date getDateDebut() {
		return dateDebut;
	}



	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}



	public Date getDateFin() {
		return dateFin;
	}



	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	
	



}
