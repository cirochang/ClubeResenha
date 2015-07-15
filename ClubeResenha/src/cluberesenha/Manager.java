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
public abstract class Manager extends User {
    
    public void editUser(UserList user_list, String user_type, String matricula, String first_name, String last_name, String email, String password, String phone, String rg, String cpf){
        user_list.editUser(user_type, matricula ,first_name, last_name, email, password, phone, rg, cpf);
    }
    
    public void addEmployee(UserList user_list, String matricula, String matricula_boss, String cargo, float salario){
        ((Member) user_list.getUserByMatricula(matricula,"Member")).getEmployee().setAllParams(matricula_boss, cargo, salario);
    }
    
    public void removeEmployee(UserList user_list, String matricula){
        ((Member) user_list.getUserByMatricula(matricula,"Member")).getEmployee().setAllParams(null, null, 0);
    }
    
}
