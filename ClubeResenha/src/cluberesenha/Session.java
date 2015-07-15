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
   
    public String getStartMin_to_s(){
        if (getStart_min() < 10){
            return "0" + getStart_min();
        }
        else{
            return "" + getStart_min();
        }
    }
    
    public String getStartHour_to_s(){
        if (getStart_hour() < 10){
            return "0" + getStart_hour();
        }
        else{
            return "" + getStart_hour();
        }
    }
    
    public String getEndMin_to_s(){
        if (getEnd_min() < 10){
            return "0" + getEnd_min();
        }
        else{
            return "" + getEnd_min();
        }
    }
    
    public String getEndHour_to_s(){
        if (getEnd_hour() < 10){
            return "0" + getEnd_hour();
        }
        else{
            return "" + getEnd_hour();
        }
    }

    /**
     * @return the num_room
     */
    public int getNum_room() {
        return num_room;
    }

    /**
     * @return the week_day
     */
    public String getWeek_day() {
        return week_day;
    }

    /**
     * @return the start_hour
     */
    public int getStart_hour() {
        return start_hour;
    }

    /**
     * @return the start_min
     */
    public int getStart_min() {
        return start_min;
    }

    /**
     * @return the end_hour
     */
    public int getEnd_hour() {
        return end_hour;
    }

    /**
     * @return the end_min
     */
    public int getEnd_min() {
        return end_min;
    }
    
}
