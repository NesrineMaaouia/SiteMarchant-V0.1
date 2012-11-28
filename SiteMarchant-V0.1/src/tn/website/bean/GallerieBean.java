package tn.website.bean;

import java.util.ArrayList;  
import java.util.List;  
import javax.annotation.PostConstruct;  
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;  
import java.util.List;  
import javax.annotation.PostConstruct;  

@ManagedBean
public class GallerieBean {  
  
    private List<String> images;  
  
    @PostConstruct  
    public void init() {  
        images = new ArrayList<String>();  
  
        for(int i=1;i<=6;i++) {  
            images.add(i + ".jpg");  
        }  
    }  
  
    public List<String> getImages() {  
        return images;  
    }  
    public String acceuil(){
    	return "acceuil";
    }
}  
  