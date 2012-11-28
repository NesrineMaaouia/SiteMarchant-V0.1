package tn.website.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Stock {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_stock;
	private List<Produit> list = new ArrayList<Produit>();
	public long getId_stock() {
		return id_stock;
	}
	public void setId_stock(long id_stock) {
		this.id_stock = id_stock;
	}
	public List<Produit> getList() {
		return list;
	}
	public void setList(List<Produit> list) {
		this.list = list;
	}

}
