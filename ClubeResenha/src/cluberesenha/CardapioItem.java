/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluberesenha;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author cirochang
 */
public class CardapioItem {
    private String name;
    private String type;
    private String description;
    private float price;
    
   
    
    //GET AND SETTERS
    
    public void setAllParams(String name,String type,String description,float price){
        setName(name);
        setType(type);
        setDescription(description);
        setPrice(price);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    public String getPrice_to_s(){
        Locale localeBR = new Locale("pt","br"); //Cria o locale do Brasil
        NumberFormat n = NumberFormat.getInstance(localeBR); //Cria um NumberFormat com base no locale
        n.setMinimumFractionDigits(2); //Seta o número mínimo de casa decimal
        n.setMaximumFractionDigits(2); //Seta o número máximo de casa decimal
        return n.format(price);
    }
    
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
}
