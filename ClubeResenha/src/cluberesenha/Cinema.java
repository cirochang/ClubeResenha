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
public class Cinema {
    private String name;
    private String description;
    private MovieList movie_list = new MovieList();
    private SessionList session_list = new SessionList();

    public void addSession(String movie_name, int room, String week_days, int start_hour, int start_min, int end_hour, int end_min){
        Movie movie_selected = movie_list.getMovieByName(movie_name);
        if(movie_selected != null){
            session_list.createSession(movie_selected, room, week_days, start_hour, start_min, end_hour, end_min);
        }
    }
    
    public void editSession(String movie_name, int room, String week_days, int start_hour, int start_min, int end_hour, int end_min){
        Movie movie_selected = movie_list.getMovieByName(movie_name);
        if(movie_selected != null){
            session_list.editSession(movie_selected, room, week_days, start_hour, start_min, end_hour, end_min);
        }
    }
    
    public SessionList getSessionList(){
        return session_list;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
     * @return the movie_list
     */
    public MovieList getMovieList() {
        return movie_list;
    }
    
    public String[] getMovieNames(){
        return movie_list.getMovieNames();
    }
    
    
}
