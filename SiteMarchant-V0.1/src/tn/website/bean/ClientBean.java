package tn.website.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ClientBean {
	
	private long id_personne;
	private String nom,prenom;
	private String ville;
	private int telephone;
	public long getId_personne() {
		return id_personne;
	}
	public void setId_personne(long id_personne) {
		this.id_personne = id_personne;
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
	public String getville() {
		return ville;
	}
	public void setville(String ville) {
		this.ville = ville;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public ClientBean(long id_personne, String nom, String prenom,
			String ville, int telephone) {
		super();
		this.id_personne = id_personne;
		this.nom = nom;
		this.prenom = prenom;
		this.ville = ville;
		this.telephone = telephone;
	}
	public ClientBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String client(){
		return "acceuilClient";
	}
	public String panier(){
		return "gestionPanier";
	}
	

}
