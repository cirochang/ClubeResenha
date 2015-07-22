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

public class CardapioList {
    private ArrayList<CardapioItem> cardapio_item = new ArrayList<>();
    private int num_cardapio_item = 0;
    
    
    public void createCardapioItem(String name, String type, String description, float price){
        cardapio_item.add( new CardapioItem() );
        cardapio_item.get(cardapio_item.size()-1).setAllParams(name, type, description, price);
    }
    
    public void editCardapioItem(String name, String type, String description, float price){
        cardapio_item.get(num_cardapio_item).setAllParams(name, type, description, price);
    }
    
    public void deleteCardapioItem(){
        cardapio_item.remove(num_cardapio_item);
    }
    
    public CardapioItem getCardapioItemClass(){
        return this.cardapio_item.get(num_cardapio_item);
    }
    
    public CardapioItem getCardapioItem(int direction){
        if(num_cardapio_item + direction >= cardapio_item.size()){
            num_cardapio_item = 0;
        }
        else if(num_cardapio_item + direction < 0){
            num_cardapio_item = cardapio_item.size()-1;
        }
        else{
            num_cardapio_item = num_cardapio_item + direction;
        }
        return this.cardapio_item.get(num_cardapio_item);
    }
    
    public String printAllCardapioItens(){
        String print;
        print = "";
        String[] type_exist = {"Petisco", "Refeição", "Drink", "Sobremesa"};
        for (String type_exist_selected : type_exist) {
            for(CardapioItem item : cardapio_item){
                if(item.getType().equals(type_exist_selected)){
                    print += "Name: " + item.getName() + "       Type: " + item.getType()+ "      Description: "+ item.getDescription();
                }
            }
        }
        return print;
    }
    
    public ArrayList getCardapioItemListOrganized(){
        ArrayList<String> cardapio_organized = new ArrayList<>();
        String[] type_exist = {"Petisco", "Refeição", "Drink", "Sobremesa"};
        for (String type_exist_selected : type_exist) {
            for(CardapioItem item : cardapio_item){
                if(item.getType().equals(type_exist_selected)){
                    cardapio_organized.add("Name: " + item.getName() + "       Type: " + item.getType()+ "      Description: "+ item.getDescription());
                }
            }
        }
        return cardapio_organized;
    }
    
}
