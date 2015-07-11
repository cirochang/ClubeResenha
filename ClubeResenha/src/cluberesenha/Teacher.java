/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluberesenha;
/**
 *
 * @author cirochang
 */
public class Teacher extends User{
    
    @Override
    public String getTypeName(){
        return "Teacher";
    }
    
    public void addSportClass(String sport_name,String description,String local,String week_day,int start_hour,int start_min,int end_hour,int end_min){
        sport_class_list.createSportClass(this.matricula, sport_name, description, local, week_day, start_hour, start_min, end_hour, end_min);
    }
    
    public void editSportClass(String sport_name,String description,String local,String week_day,int start_hour,int start_min,int end_hour,int end_min){
        sport_class_list.editSportClass(this.matricula, sport_name, description, local, week_day, start_hour, start_min, end_hour, end_min);
    }
    
    public void deleteSportClass(){
        sport_class_list.deleteSportClass();
    }   
    
    public int getSportClassSize(){
        return sport_class_list.getSportClassSize();
    }
    
    public SportClass getMySportClassTeacher(int direction){
        return sport_class_list.getSportClassTeacher(direction, this.matricula);
    }
    
    
} 
