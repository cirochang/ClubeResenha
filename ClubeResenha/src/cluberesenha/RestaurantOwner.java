/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluberesenha;

/**
 *
 * @author cirochang
 * @author cirochang
 * @author cirochang
 */
public class RestaurantOwner extends User {
    private Restaurant restaurant;
    
    public RestaurantOwner(){
        restaurant = new Restaurant();
    }
    
    @Override
    public String getTypeName(){
        return "Restaurant Owner";
    }
    
    public void addCardapioItem(String name,String type,String description,float price){
        restaurant.getCardapioList().createCardapioItem(name, type, description, price);
    }
    
    public void removeCardapioItem(){
        restaurant.getCardapioList().deleteCardapioItem();
    }
    
    public CardapioItem getCardapioItem(int direction){
        return restaurant.getCardapioList().getCardapioItem(direction);
    }
    
    public void editCardapioItem(String name,String type,String description,float price){
        restaurant.getCardapioList().editCardapioItem(name, type, description, price);
    }
    
    public Restaurant getRestaurant(){
        return restaurant;
    }
    
    public void addEmployee(UserList user_list, String matricula, String matricula_boss, String cargo, float salario){
        ((Member) user_list.getUserByMatricula(matricula,"Member")).getEmployee().setAllParams(matricula_boss, cargo, salario);
    }
    
    public void removeEmployee(UserList user_list, String matricula){
        ((Member) user_list.getUserByMatricula(matricula,"Member")).getEmployee().setAllParams(null, null, 0);
    }

    
}
