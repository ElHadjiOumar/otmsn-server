package com.javaws.entities;

public class User {
	
	private int id;
	private String nom;
	private String prenom;
	private String nin;
	private String date_creation;
	private String numero;
	private String type;
	

	
	public User(int id, String nom, String prenom, String nin, String date_creation, String numero, String type) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.nin = nin;
		this.date_creation = date_creation;
		this.numero = numero;
		this.type = type;
	}
	
	
	public User(String nom, String prenom, String nin, String date_creation, String numero, String type) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.nin = nin;
		this.date_creation = date_creation;
		this.numero = numero;
		this.type = type;
	}

	

	public User() {
		super();
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNin() {
		return nin;
	}
	public void setNin(String nin) {
		this.nin = nin;
	}
	public String getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(String date_creation) {
		this.date_creation = date_creation;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	

}
