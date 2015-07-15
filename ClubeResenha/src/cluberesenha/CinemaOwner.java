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
    
    public void addSession(int num_room, String week_day, int start_hour, int start_min, int end_hour, int end_min){
        Movie movie = cinema.getMovieList().getMovie();
        cinema.getSessionList().createSession(movie, num_room, week_day, start_hour, start_min, end_hour, end_min);
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
    
    public void addEmployee(UserList user_list, String matricula, String matricula_boss, String cargo, float salario){
        ((Member) user_list.getUserByMatricula(matricula,"Member")).getEmployee().setAllParams(matricula_boss, cargo, salario);
    }
    
    public void removeEmployee(UserList user_list, String matricula){
        ((Member) user_list.getUserByMatricula(matricula,"Member")).getEmployee().setAllParams(null, null, 0);
    }

    
    @Override
    public String getTypeName(){
        return "Cinema Owner";
    }
    
    
}
