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
public class MedicalExam {
    private String matricula_doctor;
    private String blood_type;
    private String description;
    private final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    private Date updated_at;

    public void setAllParams(String matricula_doctor, String blood_type, String description){
        updateDate(); //current date
        this.setMatriculaDoctor(matricula_doctor);
        this.setBloodType(blood_type);
        this.setDescription(description);
    }
    
    public void updateDate(){
        setUpdated_at(new Date());
    }
    
    public boolean hasExam(){
        if(this.getMatriculaDoctor() == null){
            return false;
        }else{
            return true;
        }
    }
    
    public String printDate(){
        return dateFormat.format(updated_at);
    }

    /**
     * @return the matricula_doctor
     */
    public String getMatriculaDoctor() {
        return matricula_doctor;
    }

    /**
     * @param matricula_doctor the matricula_doctor to set
     */
    public void setMatriculaDoctor(String matricula_doctor) {
        this.matricula_doctor = matricula_doctor;
    }

    /**
     * @return the blood_type
     */
    public String getBloodType() {
        return blood_type;
    }

    /**
     * @param blood_type the blood_type to set
     */
    public void setBloodType(String blood_type) {
        this.blood_type = blood_type;
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
     * @return the updated_at
     */
    public Date getUpdated_at() {
        return updated_at;
    }

    /**
     * @param updated_at the updated_at to set
     */
    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }
    
    

  
}
