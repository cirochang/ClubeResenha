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
public class Session {
    private int num_room;
    private String week_day;
    private int start_hour;
    private int start_min;
    private int end_hour;
    private int end_min;
    private Movie movie;
    
    public void setAllParams(Movie movie, int num_room, String week_day, int start_hour, int start_min, int end_hour, int end_min){
        this.num_room = num_room;
        this.week_day = week_day;
        this.start_hour = start_hour;
        this.start_min = start_min;
        this.end_hour = end_hour;
        this.end_min = end_min;
        this.movie = movie;
    }
    
    public Movie getMovie(){
        return this.movie;
    }
   
    public String getStartMin_to_s(){
        if (getStartMin() < 10){
            return "0" + getStartMin();
        }
        else{
            return "" + getStartMin();
        }
    }
    
    public String getStartHour_to_s(){
        if (getStartHour() < 10){
            return "0" + getStartHour();
        }
        else{
            return "" + getStartHour();
        }
    }
    
    public String getEndMin_to_s(){
        if (getEndMin() < 10){
            return "0" + getEndMin();
        }
        else{
            return "" + getEndMin();
        }
    }
    
    public String getEndHour_to_s(){
        if (getEndHour() < 10){
            return "0" + getEndHour();
        }
        else{
            return "" + getEndHour();
        }
    }

    /**
     * @return the num_room
     */
    public int getNumRoom() {
        return num_room;
    }

    /**
     * @return the week_day
     */
    public String getWeekDay() {
        return week_day;
    }

    /**
     * @return the start_hour
     */
    public int getStartHour() {
        return start_hour;
    }

    /**
     * @return the start_min
     */
    public int getStartMin() {
        return start_min;
    }

    /**
     * @return the end_hour
     */
    public int getEndHour() {
        return end_hour;
    }

    /**
     * @return the end_min
     */
    public int getEndMin() {
        return end_min;
    }
    
}
