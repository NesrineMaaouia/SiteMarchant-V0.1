package tn.website.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import tn.website.model.Categorie;

@ManagedBean
@SessionScoped
public class CategorieBean {
	
	private int id_categorie;
	private String libelle;
	private List<Categorie> categories = new ArrayList<Categorie>();
	
	public int getId_categorie() {
		return id_categorie;
	}
	public void setId_categorie(int id_categorie) {
		this.id_categorie = id_categorie;
	}
	public String getlibelle() {
		return libelle;
	}
	public void setlibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
	public CategorieBean(int id_categorie, String libelle,
			List<Categorie> categories) {
		super();
		this.id_categorie = id_categorie;
		this.libelle = libelle;
		this.categories = categories;
	}
	public CategorieBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public List<Categorie> getCategories() {
		return categories;
	}
	public void setCategories(List<Categorie> categories) {
		this.categories = categories;
	}
	
	public List<Categorie> recupCategorie() {
		
		return categories;
	}
}
