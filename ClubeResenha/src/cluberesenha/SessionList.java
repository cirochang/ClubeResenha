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
public class SessionList {
    private ArrayList<Session> session = new ArrayList<>();
    private int num_session = 0;
    
    
    public void createSession(Movie movie, int num_room, String week_day, int start_hour, int start_min, int end_hour, int end_min){
        session.add( new Session() );
        session.get(session.size()-1).setAllParams(movie, num_room, week_day, start_hour, start_min, end_hour, end_min);
    }
    
    public void editSession(Movie movie, int num_room, String week_day, int start_hour, int start_min, int end_hour, int end_min){
        session.get(num_session).setAllParams(movie, num_room, week_day, start_hour, start_min, end_hour, end_min);
    }
    
    public void deleteSession(){
        session.remove(num_session);
    }
    
    public Session getSession(){
        return this.session.get(num_session);
    }
    
    public Session getSession(int direction){
        if(num_session + direction >= session.size()){
            num_session = 0;
        }
        else if(num_session + direction < 0){
            num_session = session.size()-1;
        }
        else{
            num_session = num_session + direction;
        }
        return this.session.get(num_session);
    }
    
}
