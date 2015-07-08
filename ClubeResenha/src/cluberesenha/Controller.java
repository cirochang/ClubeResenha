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
public class Controller {
    
    private static Controller instance = null;
    
    public Controller(){
        //For Test
        user_list.initUserTest();
    }
    
    final UserList user_list = new UserList();
    private User current_user;
    
    public static Controller getInstance() {
       if(instance == null) {
          instance = new Controller();
       }
       return instance;
    }
    
    //---------------------------------------------------------------------USE CASE FUNCTIONS--------------------------------------------------------------------------------------------
    
    //Users Buttons
    public boolean login(String matricula, String password){
        if(user_list.authenticate(matricula,password)==true){
            this.current_user = user_list.getUserByMatricula(matricula);
            return true;
        }
        else{
            return false;
        }
    }
    
    public void logout(){
        this.current_user = null;
    }
    
    //Teacher
    public void createSportClass(String sport_name,String description,String local,String week_day,int start_hour,int start_min,int end_hour,int end_min){
        Teacher current_teacher = (Teacher) current_user;
        current_teacher.createSportClass(sport_name, description, local, week_day, start_hour, start_min, end_hour, end_min);
    }
    
    public SportClass showMySportClass(int direction){
        Teacher current_teacher = (Teacher) current_user;
        return current_teacher.getSportClass(direction);
    }
    
    public void editSportClass(String sport_name,String description,String local,String week_day,int start_hour,int start_min,int end_hour,int end_min){
        Teacher current_teacher = (Teacher) current_user;
        current_teacher.editSportClass(sport_name, description, local, week_day, start_hour, start_min, end_hour, end_min);
    }
    
    public void deleteSportClass(){
        Teacher current_teacher = (Teacher) current_user;
        current_teacher.deleteSportClass();
    }
    
    //Secretary Buttons
    public void registerMember(String first_name, String last_name, String email, String password, String phone, String rg, String cpf){
        Secretary current_secretary = (Secretary) current_user;
        current_secretary.registerMember(user_list, first_name, last_name, email, password, phone, rg, cpf);
    }
    
    //Master Buttons
    public void registerUser(String user_type , String first_name, String last_name, String email, String password, String phone, String rg, String cpf){
        MasterUser current_master_user = (MasterUser) current_user;
        current_master_user.registerUser(user_list, user_type, first_name, last_name, email, password, phone, rg, cpf);
    }
    
    public void deleteUser(User user){
        MasterUser current_master_user = (MasterUser) current_user;
        current_master_user.deleteUser(user_list, user);
    }
    
    //Manager Buttons
    public void editUser(User user){
       Manager current_manager = (Manager) current_user;
       current_manager.editUser(user_list, user);
    }
    
    //Getters and Setters
    public User getCurrentUser(){
        return current_user;
    }
    
    //Helpers
    public User getLastUser(){
        return user_list.getLastUser();
    }
    
    public User[] getAllUsers(){
        return user_list.getAllUsers();
    }
    
    public User[] getAllUsers(String user_type){
        return user_list.getAllUsers(user_type);
    }
    
    
   
    
    
    
    
    
}
