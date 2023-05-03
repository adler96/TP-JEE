package modeles;

import java.time.LocalDate;

public class Produit {

	private int id;
	private String libelle;
	private int prixU;
	private String description;
	private LocalDate dateFab;
	private LocalDate dateExp;
	
	public Produit() {
		super();
	}

	public Produit(String libelle, int prixU, String description, LocalDate dateFab, LocalDate dateExp) {
		super();
		this.libelle = libelle;
		this.prixU = prixU;
		this.description = description;
		this.dateFab = dateFab;
		this.dateExp = dateExp;
	}

	public Produit(int id, String libelle, int prixU, String description, LocalDate dateFab, LocalDate dateExp) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.prixU = prixU;
		this.description = description;
		this.dateFab = dateFab;
		this.dateExp = dateExp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public int getPrixU() {
		return prixU;
	}

	public void setPrixU(int prixU) {
		this.prixU = prixU;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getDateFab() {
		return dateFab;
	}

	public void setDateFab(LocalDate dateFab) {
		this.dateFab = dateFab;
	}

	public LocalDate getDateExp() {
		return dateExp;
	}

	public void setDateExp(LocalDate dateExp) {
		this.dateExp = dateExp;
	}
	
	
}
