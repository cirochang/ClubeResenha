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
public class CinemaOwner extends Manager{
    
    private Cinema cinema = new Cinema();
    
    public void addSession(String movie_name, int room, String week_days, int start_hour, int start_min, int end_hour, int end_min){
        cinema.addSession(movie_name, room, week_days, start_hour, start_min, end_hour, end_min);
    }
    
    public void editSession(String movie_name, int room, String week_days, int start_hour, int start_min, int end_hour, int end_min){
         cinema.editSession(movie_name, room, week_days, start_hour, start_min, end_hour, end_min);
    }

    public void removeSession(){
        cinema.getSessionList().deleteSession();
    }
    
    public Session getSession(int direction){
        return cinema.getSessionList().getSession(direction);
    }
    
    public void editSession(int num_room, String week_day, int start_hour, int start_min, int end_hour, int end_min){
        Movie movie = cinema.getMovieList().getMovie();
        cinema.getSessionList().editSession(movie, num_room, week_day, start_hour, start_min, end_hour, end_min);
    }
    
    //MOVIE

    public void addMovie(String title, String cast, String direction, String genre, String synopsis, String distributor, int classification){
        cinema.getMovieList().createMovie(title, cast, direction, genre, synopsis, distributor, classification);
    }
    
    public void removeMovie(){
        cinema.getMovieList().deleteMovie();
    }
    
    public Movie getMovie(int direction){
        return cinema.getMovieList().getMovie(direction);
    }
    
    public void editMovie(String title, String cast, String direction, String genre, String synopsis, String distributor, int classification){
        cinema.getMovieList().editMovie(title, cast, direction, genre, synopsis, distributor, classification);
    }
    
    public Cinema getCinema(){
        return cinema;
    }

    
    @Override
    public String getTypeName(){
        return "Cinema Owner";
    }
    
    
}
