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
public class SportClass {
    private String sport_name;
    private String description;
    private String week_day;
    private int start_hour;
    private int start_min;
    private int end_hour;
    private int end_min;
    private String local;
    private StudentList student_list;
    private String matricula_teacher;
    
    public SportClass(){
        student_list = new StudentList();
    }
    
    public void setAllParams(String matricula, String sport_name,String description,String local,String week_day,int start_hour,int start_min,int end_hour,int end_min){
        this.setMatriculaTeacher(matricula);
        this.setSportName(sport_name);
        this.setDescription(description);
        this.setLocal(local);
        this.setStartHour(start_hour);
        this.setEndHour(end_hour);
        this.setStartMin(start_min);
        this.setEndMin(end_min);
        this.setWeekDay(week_day);
    }
    
    public void enrollStudent(String matricula, String note){
        student_list.createStudent(matricula, note);
    }
    
    public void enrollStudent(String matricula){
        student_list.createStudent(matricula);
    }
    
    public void unrollStudent(String matricula){
        student_list.deleteStudentByMatricula(matricula);
    }
    
    public boolean searchTeacherByMatricula(String matricula){
        return matricula_teacher.equals(matricula);
    }
    
    public boolean searchStudentByMatricula(String matricula){
        return student_list.getStudentByMatricula(matricula) != null;
    }
    
    public StudentList getStudentList(){
        return student_list;
    }

    
    //GETTERS AND SETTERS
    
    public void setMatriculaTeacher(String matricula){
        this.matricula_teacher = matricula;
    }
    
    public String getMatriculaTeacher(){
        return matricula_teacher;
    }
    
    /**
     * @return the sport_name
     */
    public String getSportName() {
        return sport_name;
    }

    /**
     * @param sport_name the sport_name to set
     */
    public void setSportName(String sport_name) {
        this.sport_name = sport_name;
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

    /**
     * @return the week_day
     */
    public String getWeekDay() {
        return week_day;
    }

    /**
     * @param week_day the week_day to set
     */
    public void setWeekDay(String week_day) {
        this.week_day = week_day;
    }

    /**
     * @return the start_hour
     */
    public int getStartHour() {
        return start_hour;
    }

    /**
     * @param start_hour the start_hour to set
     */
    public void setStartHour(int start_hour) {
        this.start_hour = start_hour;
    }

    /**
     * @return the start_min
     */
    public int getStartMin() {
        return start_min;
    }
    
    public String getStartMin_to_s(){
        if (start_min < 10){
            return "0" + start_min;
        }
        else{
            return "" + start_min;
        }
    }
    
    public String getStartHour_to_s(){
        if (start_hour < 10){
            return "0" + start_hour;
        }
        else{
            return "" + start_hour;
        }
    }
    
    public String getEndMin_to_s(){
        if (end_min < 10){
            return "0" + end_min;
        }
        else{
            return "" + end_min;
        }
    }
    
    public String getEndHour_to_s(){
        if (end_hour < 10){
            return "0" + end_hour;
        }
        else{
            return "" + end_hour;
        }
    }

    /**
     * @param start_min the start_min to set
     */
    public void setStartMin(int start_min) {
        this.start_min = start_min;
    }

    /**
     * @return the end_hour
     */
    public int getEndHour() {
        return end_hour;
    }

    /**
     * @param end_hour the end_hour to set
     */
    public void setEndHour(int end_hour) {
        this.end_hour = end_hour;
    }

    /**
     * @return the end_min
     */
    public int getEndMin() {
        return end_min;
    }

    /**
     * @param end_min the end_min to set
     */
    public void setEndMin(int end_min) {
        this.end_min = end_min;
    }

    /**
     * @return the local
     */
    public String getLocal() {
        return local;
    }

    /**
     * @param local the local to set
     */
    public void setLocal(String local) {
        this.local = local;
    }
    
    
}
