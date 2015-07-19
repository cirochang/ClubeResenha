/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluberesenha;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author cirochang
 */
public class Bill {
    private float credit;
    private String description;
    private final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    private Date created_at;
    
    public void setAllParams(float credit, String description){
        this.setCredit(credit);
        this.description = description;
        createDate();
    }   
   
    
    public void createDate(){
        setCreatedAt( new Date());
    }

    public String printDate(){
        return getDateFormat().format(getCreated_at());
    }

    public Date getCreatedAt() {
        return getCreated_at();
    }
    
    public void setCreatedAt(Date created_at) {
        this.created_at = created_at;
    }
    
    public DateFormat getDateFormat() {
        return dateFormat;
    }
    
    
    public String getCredit_to_s(){
        Locale localeBR = new Locale("pt","br"); //Cria o locale do Brasil
        NumberFormat n = NumberFormat.getInstance(localeBR); //Cria um NumberFormat com base no locale
        n.setMinimumFractionDigits(2); //Seta o número mínimo de casa decimal
        n.setMaximumFractionDigits(2); //Seta o número máximo de casa decimal
        return n.format(getCredit());
    }
    
    public void setCredit(float credit) {
        this.credit = credit;
    }

    /**
     * @return the created_at
     */
    public Date getCreated_at() {
        return created_at;
    }

    /**
     * @return the credit
     */
    public float getCredit() {
        return credit;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    
    

}
