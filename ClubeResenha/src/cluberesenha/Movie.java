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
public class Movie {
    private String title;
    private String cast; //elenco
    private String direction;
    private String genre; //genero
    private String synopsis;
    private String distributor;
    private int classification;
    
    public void setAllParams(String title, String cast, String direction, String genre, String synopsis, String distributor, int classification){
        this.title = title;
        this.cast = cast;
        this.direction = direction;
        this.genre = genre;
        this.synopsis = synopsis;
        this.distributor = distributor;
        this.classification = classification;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the cast
     */
    public String getCast() {
        return cast;
    }

    /**
     * @return the direction
     */
    public String getDirection() {
        return direction;
    }

    /**
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @return the duration
     */
    public String getSynopsis() {
        return synopsis;
    }

    /**
     * @return the distributor
     */
    public String getDistributor() {
        return distributor;
    }

    /**
     * @return the classification
     */
    public int getClassification() {
        return classification;
    }

    
}
