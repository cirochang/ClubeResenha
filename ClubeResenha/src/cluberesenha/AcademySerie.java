/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluberesenha;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author cirochang
 */
public class AcademySerie {
    private String matricula_teacher_academy;
    private String type_serie;
    private String serie;

    public void setAllParams(String matricula_teacher_academy, String type_serie, String serie){
       this.matricula_teacher_academy = matricula_teacher_academy;
       this.type_serie = type_serie;
       this.serie = serie;
    }
    
    public boolean hasPersonal(){
        if(this.matricula_teacher_academy == null){
            return false;
        }else{
            return true;
        }
    }

    /**
     * @return the matricula_teacher_academy
     */
    public String getMatriculaTeacherAcademy() {
        return matricula_teacher_academy;
    }

    /**
     * @param matricula_teacher_academy the matricula_teacher_academy to set
     */
    public void setMatriculaTeacherAcademy(String matricula_teacher_academy) {
        this.matricula_teacher_academy = matricula_teacher_academy;
    }

    /**
     * @return the type_serie
     */
    public String getTypeSerie() {
        return type_serie;
    }

    /**
     * @param type_serie the type_serie to set
     */
    public void setTypeSerie(String type_serie) {
        this.type_serie = type_serie;
    }

    /**
     * @return the serie
     */
    public String getSerie() {
        return serie;
    }

    /**
     * @param serie the serie to set
     */
    public void setSerie(String serie) {
        this.serie = serie;
    }
  
}
