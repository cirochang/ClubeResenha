/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluberesenha;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author cirochang
 */
public class Reserve {
    private int reserve_num;
    private String matricula;
    private final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    private Date created_at;


    public void setAllParams(int reserve_num, String matricula){
        createDate();
        this.setReserve_num(reserve_num);
        this.matricula = matricula;
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

    /**
     * @return the reserve_num
     */
    public int getReserve_num() {
        return reserve_num;
    }

    /**
     * @param reserve_num the reserve_num to set
     */
    public void setReserve_num(int reserve_num) {
        this.reserve_num = reserve_num;
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @return the dateFormat
     */
    public DateFormat getDateFormat() {
        return dateFormat;
    }

    /**
     * @return the created_at
     */
    public Date getCreated_at() {
        return created_at;
    }

}