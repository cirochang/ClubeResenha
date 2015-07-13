/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluberesenha;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author cirochang
 */
public class UserList {
    private ArrayList<User> user = new ArrayList<>();
    private int num_user = 0;
    
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
        user.add(new Member());
        getLast().setAllParams(user_type, matricula, first_name, last_name, email, password, phone, rg, cpf);
        
        user.add(new Teacher());
        getLast().setAllParams("Teacher", "20150002","Kakashi", "Sensei", "kakashi@gmail.com", "123456", "22883527", "345212345", "154993234");
        
        //done
        user.add(new Secretary());
        getLast().setAllParams("Secretary", "20150003","Jenifer", "Lopes", "jenifer@gmail.com", "123456", "22883527", "345212345", "154993234");
        
        //done
        user.add(new MasterUser());
        getLast().setAllParams("Master", "20150004","Goku", "Sayajin", "goku@gmail.com", "123456", "22883527", "345212345", "154993234");
        
        user.add(new Doctor());
        getLast().setAllParams("Doctor", "20150005","Sasha", "Grey", "sashagrey@gmail.com", "123456", "22883527", "345212345", "154993234");
        
        user.add(new RestaurantOwner());
        getLast().setAllParams("Restaurant Owner", "20150006","Hong", "Chang", "hongchang@gmail.com", "123456", "22883527", "345212345", "154993234");
        
        user.add(new PersonalTrainner());
        getLast().setAllParams("Personal Trainner", "20150007","Arnold", "Shernegued", "arnoldsherned@gmail.com", "123456", "22883527", "345212345", "154993234");
        
        user.add(new CinemaOwner());
        getLast().setAllParams("Cinema Owner", "20150008","Tulio", "Tuliban", "tuliotuliban@gmail.com", "123456", "22883527", "345212345", "154993234");
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
        
    public boolean authenticate(String matricula, String password){
        User user_verify;
        user_verify = getUserByMatricula(matricula);
        return password.equals(user_verify.getPassword());
    }
    
    public User getUserByMatricula(String matricula){
        for (User user_selected : user) {
            if (user_selected.getMatricula().equals(matricula)) {
                return user_selected;
            }
        }
        return null;
    }
    
    public User getUserByMatricula(String matricula, String type){
        for (User user_selected : user) {
            if (user_selected.getMatricula().equals(matricula) && user_selected.getUserType().equals(type)) {
                return user_selected;
            }
        }
        return null;
    }
    

    
    public boolean existUserByMatricula(String matricula){
        return getUserByMatricula(matricula) != null;
    }
    
    
    public void deleteUser(){
        user.remove(num_user);
    }
    
    //FACTORY METHOD
    public void createUser(String user_type, String first_name, String last_name, String email, String password, String phone, String rg, String cpf){        
        String matricula = matriculaGenerate();
        switch(user_type){
            case "Member":
                user.add(new Member());
                break;
            case "Teacher":
                user.add(new Teacher());
                break;
            case "Secretary":
                user.add(new Secretary());
                break;
            case "Master":
                user.add(new MasterUser());
                break;
            case "Doctor":
                user.add(new Doctor());
                break;
            case "Restaurant Owner":
                user.add(new RestaurantOwner());
                break;
            case "Personal Trainner":
                user.add(new PersonalTrainner());
                break;
            case "Cinema Owner":
                user.add(new CinemaOwner());
                break; 
            default:
                user.add(new Member());
        }
        getLast().setAllParams(user_type, matricula, first_name, last_name, email, password, phone, rg, cpf);
    }
    
    public void editUser(String user_type, String matricula, String first_name, String last_name, String email, String password, String phone, String rg, String cpf){
        user.get(num_user).setAllParams(user_type, matricula, first_name, last_name, email, password, phone, rg, cpf);
    }
    
    public User getLast(){
        return user.get(user.size()-1);
    }
    
      
    public User getUser(int direction){
        if(num_user + direction >= user.size()){
            num_user = 0;
        }
        else if(num_user + direction < 0){
            num_user = user.size()-1;
        }
        else{
            num_user = num_user + direction;
        }
        return this.user.get(num_user);
    }
    
    public User getUser(int direction, String user_type){
        User user_selected = getUser(direction);
        if (user_selected.getUserType().equals(user_type)){
            return user_selected;
        }
        else if(direction > getUserSize() || direction < -getUserSize()){
            return null; //ERROR
        }
        else if(direction >= 0){
            return getUser(direction + 1, user_type);
        }
        else{ 
            return getUser(direction - 1, user_type);
        }
    }
    
    public Member getMemberEmployeed(int direction, String matricula_boss){
        User user_selected = getUser(direction);
        if (user_selected.getUserType().equals("Member")){
            Member member = (Member) user_selected;
            String matricula_selected = member.getEmployee().getMatriculaBoss();
            if(matricula_selected != null && matricula_selected.equals(matricula_boss)){
                return member;
            }
        }
        if(direction > getUserSize() || direction < -getUserSize()){
            return null; //ERROR
        }
        else if(direction >= 0){
            return getMemberEmployeed(direction + 1, matricula_boss);
        }
        else{ 
            return getMemberEmployeed(direction - 1, matricula_boss);
        }
    }
    
    public User getUserByPersonalMatricula(int direction, String matricula_personal){
        User user_selected = getUser(direction);
        String matricula_selected = user_selected.getAcademySerie().getMatriculaTeacherAcademy();
        if(matricula_selected != null && matricula_selected.equals(matricula_personal)){
            return user_selected;
        }
        if(direction > getUserSize() || direction < -getUserSize()){
            return null; //ERROR
        }
        else if(direction >= 0){
            return getUserByPersonalMatricula(direction + 1, matricula_personal);
        }
        else{ 
            return getUserByPersonalMatricula(direction - 1, matricula_personal);
        }
    }
    
    
    
    public int getUserSize(){
        return user.size();
    }
    
}
