package tn.website.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Categorie {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
 private long id_categorie;
public long getId_categorie() {
	return id_categorie;
}
public void setId_categorie(long id_categorie) {
	this.id_categorie = id_categorie;
}
public String getLibelle() {
	return libelle;
}
public void setLibelle(String libelle) {
	this.libelle = libelle;
}
private String libelle;

}
