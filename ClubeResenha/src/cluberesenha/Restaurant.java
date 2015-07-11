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
    private CardapioItem cardapio_item;
    private String name;
    private String description;
    private EmployeeList employee_list;
    private CardapioList cardapio_list;

    
    public Restaurant(){
        cardapio_item = new CardapioItem();
        name = "without a name";
        description = "without a description name";
    }
    
    //GET AND SETTERS

    public void setCardapioItem(CardapioItem cardapio_item) {
        this.cardapio_item = cardapio_item;
    }

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

    public EmployeeList getEmployeeList() {
        return employee_list;
    }


    public CardapioList getCardapioList() {
        return cardapio_list;
    }

 
    
    
}
