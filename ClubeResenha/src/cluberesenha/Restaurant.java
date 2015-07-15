/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluberesenha;

import java.util.ArrayList;

/**
 *
 * @author cirochang
 */
public class Restaurant {
    private String name;
    private String description;
    private CardapioList cardapio_list;

    
    public Restaurant(){
        cardapio_list = new CardapioList();
        name = "without a name";
        description = "without a description name";
    }
    //GET AND SETTERS


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CardapioList getCardapioList() {
        return cardapio_list;
    }

 
    
    
}
