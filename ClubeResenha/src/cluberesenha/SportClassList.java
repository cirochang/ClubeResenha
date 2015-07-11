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
public class SportClassList {
    
    private static SportClassList instance = null;
    
    public static SportClassList getInstance() {
       if(instance == null) {
          instance = new SportClassList();
       }
       return instance;
    }
    
    
    private ArrayList<SportClass> sport_class = new ArrayList<>();
    private int num_sport_class = 0;
    
    public void createSportClass(String matricula_teacher, String sport_name,String description,String local,String week_day,int start_hour,int start_min,int end_hour,int end_min){
        sport_class.add( new SportClass() );
        sport_class.get(sport_class.size()-1).setAllParams(matricula_teacher, sport_name, description, local, week_day, start_hour, start_min, end_hour, end_min);
    }
    
    public void editSportClass(String matricula_teacher, String sport_name,String description,String local,String week_day,int start_hour,int start_min,int end_hour,int end_min){
        sport_class.get(num_sport_class).setAllParams(matricula_teacher, sport_name, description, local, week_day, start_hour, start_min, end_hour, end_min);
    }
    
    public void deleteSportClass(){
        sport_class.remove(num_sport_class);
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
        
    public SportClass getSportClassStudent(int direction, String matricula){
        SportClass sport_class_selected = getSportClass(direction);
        if(sport_class_selected.searchStudentByMatricula(matricula)){
            return sport_class_selected;
        }
        else if(direction > getSportClassSize() || direction < -getSportClassSize()){
            return null; //ERROR
        }
        else if(direction >= 0){
            return getSportClassStudent(direction + 1, matricula);
        }
        else{
            return getSportClassStudent(direction -1, matricula);
        }  
    }
    
    public boolean checkSportClassStudent(String matricula){
        for(SportClass sport_class_selected : sport_class){
            if(sport_class_selected.searchStudentByMatricula(matricula)){
                return true;
            }
        }
        return false;
    }
    
    public SportClass getSportClassTeacher(int direction, String matricula){
        SportClass sport_class_selected = getSportClass(direction);
        if(sport_class_selected.searchTeacherByMatricula(matricula)){
            return sport_class_selected;
        }
        else if(direction > getSportClassSize() || direction < -getSportClassSize()){
            return getSportClass(getSportClassSize() + 1); //ERROR
        }
        else if(direction >= 0){
            return getSportClassStudent(direction + 1, matricula);
        }
        else{
            return getSportClassStudent(direction -1, matricula);
        }  
    }
    
    public int getSportClassSize(){
        return sport_class.size();
    }
    
}
