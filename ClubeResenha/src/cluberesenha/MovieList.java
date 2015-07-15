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
public class MovieList {
    private ArrayList<Movie> movie = new ArrayList<>();
    private int num_movie = 0;
    
    public void createMovie(String title, String cast, String direction, String genre, String synopsis, String distributor, int classification){
        movie.add( new Movie() );
        movie.get(movie.size()-1).setAllParams(title, cast, direction, genre, synopsis, distributor, classification);
    }
    
    public void editMovie(String title, String cast, String direction, String genre, String synopsis, String distributor, int classification){
        movie.get(num_movie).setAllParams(title, cast, direction, genre, synopsis, distributor, classification);
    }
    
    public void deleteMovie(){
        movie.remove(num_movie);
    }
    
    public Movie getMovie(){
        return this.movie.get(num_movie);
    }
    
    public Movie getMovie(int direction){
        if(num_movie + direction >= movie.size()){
            num_movie = 0;
        }
        else if(num_movie + direction < 0){
            num_movie = movie.size()-1;
        }
        else{
            num_movie = num_movie + direction;
        }
        return this.movie.get(num_movie);
    }
    
}
