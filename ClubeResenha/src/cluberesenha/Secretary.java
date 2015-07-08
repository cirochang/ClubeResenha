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
public class Secretary extends Manager{
    
    @Override
    public String getTypeName(){
        return "Secretary";
    }
    
    public void registerMember(UserList user_list, String first_name, String last_name, String email, String password, String phone, String rg, String cpf){
       user_list.createUser("Member", first_name, last_name, email, password, phone, rg, cpf);
    }
    
}
