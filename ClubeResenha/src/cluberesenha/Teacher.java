/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluberesenha;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cirochang
 */
public class Teacher extends User{
    private ArrayList<SportClass> sport_class = new ArrayList<>();
    private int num_sport_class = 0;
    
    @Override
    public String getTypeName(){
        return "Teacher";
    }
    
    public void createSportClass(String sport_name,String description,String local,String week_day,int start_hour,int start_min,int end_hour,int end_min){
        sport_class.add( new SportClass() );
        sport_class.get(sport_class.size()-1).setAllParams(sport_name, description, local, week_day, start_hour, start_min, end_hour, end_min);
    }
    
    public void editSportClass(String sport_name,String description,String local,String week_day,int start_hour,int start_min,int end_hour,int end_min){
        sport_class.get(num_sport_class).setAllParams(sport_name, description, local, week_day, start_hour, start_min, end_hour, end_min);
    }
    
    public void deleteSportClass(){
        sport_class.remove(num_sport_class);
    }
    
    public SportClass getSportClass(){
        return this.sport_class.get(num_sport_class);
    }
    
    public SportClass getSportClass(int direction){
        if(num_sport_class + direction >= sport_class.size()){
            num_sport_class = 0;
        }
        else if(num_sport_class + direction < 0){
            num_sport_class = sport_class.size()-1;
        }
        else{
            num_sport_class = num_sport_class + direction;
        }
        return this.sport_class.get(num_sport_class);
    }
    
    
} 
