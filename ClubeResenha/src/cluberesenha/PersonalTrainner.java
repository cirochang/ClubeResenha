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
public class PersonalTrainner extends User{
    
    @Override
    public String getTypeName(){
        return "Personal Trainner";
    }
    
    public void createNewSerie(UserList user_list, String matricula, String type_serie, String serie){
        user_list.getUserByMatricula(matricula).getAcademySerie().setAllParams(this.matricula, type_serie, serie);
    }
    
    public User getStudentSerie(UserList user_list, int direction){
        return user_list.getUserByPersonalMatricula(direction, this.matricula);
    }
}
