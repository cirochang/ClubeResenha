/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluberesenha;

import java.util.Random;

/**
 *
 * @author cirochang
 */
public class UserList {
    private static UserList instance;
    final int num_max_users = 100;
    private User[] user = new User[num_max_users];
    private int num_users = 0;
    
    public static UserList get_instance(){
           if(instance == null) 
           {
                instance = new UserList();
           }
           return instance;
    }
    
    //TESTE - CRIA USUARIOS TESTES
    public void initUserTest(){
        String matricula = "20150001";
        String user_type = "Member";
        String first_name = "Ciro";
        String last_name = "Lyra Chang";
        String email = "cirochang@live.com";
        String password = "Ciross";
        String phone = "969007259";
        String rg = "12345678";
        String cpf = "15298233740";
        user[num_users] = new Member();
        user[num_users].setAllParams(user_type, matricula, first_name, last_name, email, password, phone, rg, cpf);
        num_users += 1;  
        
        user[num_users] = new Teacher();
        user[num_users].setAllParams("Teacher", "20150002","Kakashi", "Sensei", "kakashi@gmail.com", "123456", "22883527", "345212345", "154993234");
        num_users +=1;
        
        //done
        user[num_users] = new Secretary();
        user[num_users].setAllParams("Secretary", "20150003","Jenifer", "Lopes", "jenifer@gmail.com", "123456", "22883527", "345212345", "154993234");
        num_users +=1;
        
        //done
        user[num_users] = new MasterUser();
        user[num_users].setAllParams("Master", "20150004","Goku", "Sayajin", "goku@gmail.com", "123456", "22883527", "345212345", "154993234");
        num_users +=1;
        
        user[num_users] = new Doctor();
        user[num_users].setAllParams("Doctor", "20150005","Sasha", "Grey", "sashagrey@gmail.com", "123456", "22883527", "345212345", "154993234");
        num_users +=1;
        
        user[num_users] = new RestaurantOwner();
        user[num_users].setAllParams("Restaurant Owner", "20150006","Hong", "Chang", "hongchang@gmail.com", "123456", "22883527", "345212345", "154993234");
        num_users +=1;
        
        user[num_users] = new PersonalTrainner();
        user[num_users].setAllParams("Personal Trainner", "20150007","Arnold", "Shernegued", "arnoldsherned@gmail.com", "123456", "22883527", "345212345", "154993234");
        num_users +=1;
        
        user[num_users] = new CinemaOwner();
        user[num_users].setAllParams("Cinema OWner", "20150008","Tulio", "Tuliban", "tuliotuliban@gmail.com", "123456", "22883527", "345212345", "154993234");
        num_users +=1;
    }
    
    public void editUser(User user_edit){
        User user_update = getUserByMatricula(user_edit.getMatricula());
        user_update = user_edit;
    }
    
    //FACTORY METHOD
    public User createUser(String user_type, String first_name, String last_name, String email, String password, String phone, String rg, String cpf){        
        User new_user;
        switch(user_type){
            case "Member":
                new_user = new Member();
                break;
            case "Teacher":
                new_user = new Teacher();
                break;
            case "Secretary":
                new_user = new Secretary();
                break;
            case "Master":
                new_user = new MasterUser();
                break;
            case "Doctor":
                new_user = new Doctor();
                break;
            case "Restaurant Owner":
                new_user = new RestaurantOwner();
                break;
            case "Personal Trainner":
                new_user = new PersonalTrainner();
                break;
            case "Cinema Owner":
                new_user = new CinemaOwner();
                break; 
            default:
                new_user = new Member();
        }
        new_user.setAllParams(user_type, matriculaGenerate(), first_name, last_name, email, password, phone, rg, cpf);
        addUser(new_user);
        return new_user;
    }
    
    public String matriculaGenerate(){
    Random rand = new Random();
    int min = 0;
    int max = 10000;        
    int randomNum;
    String matricula;
    boolean loop = true;
    matricula = "2015";
    while(loop == true){
        randomNum = rand.nextInt((max - min) + 1) + min;
        matricula = "2015" + randomNum;
        if(existUserByMatricula(matricula)==false){
            loop = false;
        }
    }    
    return matricula;
    }
    
    //factory method
    public void addUser(User new_user) {
        user[num_users] = new_user;
        num_users += 1;
    }
    
    public boolean authenticate(String matricula, String password){
        User user_verify;
        user_verify = getUserByMatricula(matricula);
        if(password.equals(user_verify.getPassword())){
            return true;
        }
        else{
            return false;
        }
    }
    
    public User getUserByMatricula(String matricula){
        User user_verify;
        for(int i = 0; i < num_users; i++){
            if(user[i].getMatricula().equals(matricula)){
                user_verify = this.user[i];
                return user_verify;
            }
        }
        return null;
    }
    
    public int getUserIndexByMatricula(String matricula){
        for(int i = 0; i < num_users; i++){
            if(user[i].getMatricula().equals(matricula)){
                return i;
            }
        }
        return num_max_users + 1;
    }
    
    public boolean existUserByMatricula(String matricula){
        for(int i = 0; i < num_users; i++){
            if(user[i].getMatricula().equals(matricula)){
                return true;
            }
        }
        return false;
    }
    
    public User getLastUser(){
        return user[num_users - 1];
    }
    
    
    public User[] getAllUsers(){
        User[] selected_users = new User[num_users];
        for(int i = 0; i < num_users; i++){
            selected_users[i] = user[i];
        }
        return selected_users;
    }

    public User[] getAllUsers(String user_type) {
        int[] index_user_number = new int[num_users];
        int counter = 0;
        //get all users index selected
        for(int i = 0; i < num_users; i++){
            if(user[i].getUserType().equals(user_type)){
                index_user_number[counter] = i;
                counter += 1;
            }
        }
        //put that users_index in a new User array
        User[] selected_users = new User[counter];
        for(int i = 0; i < counter; i++){
            selected_users[i] = user[index_user_number[i]];
        }
        return selected_users;
    }
    
    public void deleteUser(User user_to_delete){
        int num_user = getUserIndexByMatricula(user_to_delete.getMatricula());
        for(int i = num_user; i < this.num_users - 1; i++){
            user[i] = user[i + 1];
        }
    }
    
}
