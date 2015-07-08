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
    
    public void editUser(UserList user_list, User user){
        user_list.editUser(user);
    }
    
}
