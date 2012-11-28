package tn.website.bean;

 

import java.io.Serializable;  
import java.util.ArrayList;  
import java.util.List;  

import javax.faces.bean.ManagedBean;


import org.primefaces.event.DragDropEvent;

import tn.website.model.Produit;
  

  @ManagedBean
public class TableBean implements Serializable {  
  
   
     
  
    /**
	 * 
	 */
	private static final long serialVersionUID = 8687883931858553563L;

	private List<Produit> p1;  
  
    private List<Produit> Pdrope;  
  
    public TableBean() {  
        p1 = new ArrayList<Produit>();  
        Pdrope = new ArrayList<Produit>();  
  
        populateRandomCars(p1, 9);  
    }  
  
    private void populateRandomCars(List<Produit> list, int size) {  
        for(int i = 0 ; i < size ; i++)  
            list.add(new Produit(1, "PC", 240, "samsung"));
            list.add(new Produit(2, "smartphone", 700, "sony"));
    }  
  
   
  
    
  
    public List<Produit> getP1() {
		return p1;
	}

	public void setP1(List<Produit> p1) {
		this.p1 = p1;
	}

	public List<Produit> getPdrope() {
		return Pdrope;
	}

	public void setPdrope(List<Produit> pdrope) {
		Pdrope = pdrope;
	}

	public void onCarDrop(DragDropEvent ddEvent) {  
        Produit car = ((Produit) ddEvent.getData());  
  
        Pdrope.add(car);  
        p1.remove(car);  
    }  
  
    public List<Produit> getDroppedProduits() {  
        return Pdrope;  
    }  
}  
