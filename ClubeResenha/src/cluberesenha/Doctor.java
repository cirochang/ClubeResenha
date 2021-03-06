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
public class Doctor extends User {
    
    @Override
    public String getTypeName(){
        return "Doctor";
    }
    
    //NEED TO CHANGE
    public void createNewMedicalExam(UserList user_list, String matricula, String blood_type, String description){
        user_list.getUserByMatricula(matricula).getMedicalExam().setAllParams(this.matricula, blood_type, description);
    }
    
    public User getPacientMedicalExam(UserList user_list, int direction){
        return user_list.getUserByDoctorMatricula(direction, this.matricula);
    }
    
}
