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
public class MasterUser extends Manager{
    
    @Override
    public String getTypeName(){
        return "Master";
    }
    
    public void registerUser(UserList user_list, String user_type, String first_name,String last_name,String email,String password,String phone,String rg,String cpf){
        user_list.createUser(user_type, first_name, last_name, email, password, phone, rg, cpf);
    }
    
    public void deleteUser(UserList user_list, User user){
        user_list.deleteUser(user);
    }
    
}
