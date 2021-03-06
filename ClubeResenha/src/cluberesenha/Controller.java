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

//A classe Controller usa o padrão de projeto Slingleton, pois precisamos que todas as interfaces recebam o mesmo objeto controller.
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
        current_teacher.addSportClass(sport_name, description, local, week_day, start_hour, start_min, end_hour, end_min);
    }
    
    public SportClass showMySportClassTeacher(int direction){
        Teacher current_teacher = (Teacher) current_user;
        return current_teacher.getMySportClassTeacher(direction);
    }
    
    public void editSportClass(String sport_name,String description,String local,String week_day,int start_hour,int start_min,int end_hour,int end_min){
        Teacher current_teacher = (Teacher) current_user;
        current_teacher.editSportClass(sport_name, description, local, week_day, start_hour, start_min, end_hour, end_min);
    }
    
    public void deleteSportClass(){
        Teacher current_teacher = (Teacher) current_user;
        current_teacher.deleteSportClass();
    }
    
    //Cinema Owner
    public void addMovie(String title, String cast, String direction, String genre, String synopsis, String distributor, int classification){
        CinemaOwner current_cinema_owner = (CinemaOwner) current_user;
        current_cinema_owner.addMovie(title, cast, direction, genre, synopsis, distributor, classification);
    }
    
    public void editMovie(String title, String cast, String direction, String genre, String synopsis, String distributor, int classification){
        CinemaOwner current_cinema_owner = (CinemaOwner) current_user;
        current_cinema_owner.editMovie(title, cast, direction, genre, synopsis, distributor, classification);
    }
    
    public Movie showMyMovie(int direction){
        CinemaOwner current_cinema_owner = (CinemaOwner) current_user;
        return current_cinema_owner.getMovie(direction);
    }
    
    public void deleteMovie(){
        CinemaOwner current_cinema_owner = (CinemaOwner) current_user;
        current_cinema_owner.removeMovie();
    }
    
    public void addSession(String movie_name, int room, String week_days, int start_hour, int start_min, int end_hour, int end_min){
        CinemaOwner current_cinema_owner = (CinemaOwner) current_user;
        current_cinema_owner.addSession(movie_name, room, week_days, start_hour, start_min, end_hour, end_min);
    }
    
    public Session showMySession(int direction){
        CinemaOwner current_cinema_owner = (CinemaOwner) current_user;
        return current_cinema_owner.getSession(direction);
    }
    
    public void editSession(String movie_name, int room, String week_days, int start_hour, int start_min, int end_hour, int end_min){
        CinemaOwner current_cinema_owner = (CinemaOwner) current_user;
        current_cinema_owner.editSession(movie_name, room, week_days, start_hour, start_min, end_hour, end_min);
    }
    
    public void deleteSession(){
        CinemaOwner current_cinema_owner = (CinemaOwner) current_user;
        current_cinema_owner.removeSession();
    }
    
    //Restaurant Owner
    public void addCardapioItem(String nome, String type, String description, float price){
        RestaurantOwner current_restaurant_owner = (RestaurantOwner) current_user;
        current_restaurant_owner.addCardapioItem(nome, type, description, price);
    }
    
    public void editCardapioItem(String name, String type, String description, float price){
        RestaurantOwner current_restaurant_owner = (RestaurantOwner) current_user;
        current_restaurant_owner.editCardapioItem(name, type, description, price);
    }
    
    public CardapioItem showMyCardapioItem(int direction){
        RestaurantOwner current_restaurant_owner = (RestaurantOwner) current_user;
        return current_restaurant_owner.getCardapioItem(direction);
    }
    
    public void deleteCardapioItem(){
        RestaurantOwner current_restaurant_owner = (RestaurantOwner) current_user;
        current_restaurant_owner.removeCardapioItem();
    }
    
    public void addEmployee(String matricula, String matricula_boss, String cargo, float salario){
        Manager current_restaurant_owner = (Manager) current_user;
        current_restaurant_owner.addEmployee(user_list, matricula, matricula_boss, cargo, salario);
    }
    
    public void removeEmployee(String matricula){
        Manager current_restaurant_owner = (Manager) current_user;
        current_restaurant_owner.removeEmployee(user_list, matricula);
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
    
    public void deleteUser(){
        MasterUser current_master_user = (MasterUser) current_user;
        current_master_user.deleteUser(user_list);
    }
    
    //Manager Buttons
    public void editUser(String user_type, String matricula, String first_name, String last_name, String email, String password, String phone, String rg, String cpf){
       Manager current_manager = (Manager) current_user;
       current_manager.editUser(user_list, user_type, matricula, first_name, last_name, email, password, phone, rg, cpf);
    }
    
    //Personal Trainner Buttons
    public void createNewSerie(String matricula, String type_serie, String serie){
        PersonalTrainner current_personal_trainner = (PersonalTrainner) current_user;
        current_personal_trainner.createNewSerie(user_list,matricula, type_serie, serie);
    }
    
    public User showStudentSerie(int direction){
        PersonalTrainner current_personal_trainner = (PersonalTrainner) current_user;
        return current_personal_trainner.getStudentSerie(user_list, direction);
    }
    
    //Doctor Buttons
    public void createNewMedicalExam(String matricula, String blood_type, String description){
        Doctor current_doctor = (Doctor) current_user;
        current_doctor.createNewMedicalExam(user_list,matricula,blood_type,description);
    }
    
    public User showPacientMedicalExam(int direction){
        Doctor current_doctor = (Doctor) current_user;
        return current_doctor.getPacientMedicalExam(user_list,direction);
    }
    
    
    //ALL USERS    
    public User showUser(int direction){   //MANAGER??
        return user_list.getUser(direction);
    }
    
    public User showUser(int direction,String user_type){ 
        return user_list.getUser(direction, user_type);
    }
    
    public SportClass showMySportClassStudent(int direction){
        return current_user.getMySportClassStudent(direction);
    }
     
    public SportClass showSportClass(int direction){
        return current_user.getAllSportClass(direction);
    }
    
    public void enrollSportClass(SportClass sport_class){
        sport_class.enrollStudent(current_user.getMatricula());
    }
    
    public void unrollSportClass(SportClass sport_class){
        sport_class.unrollStudent(current_user.getMatricula());
    }
    
    public Restaurant showRestaurants(int direction){
        return ((RestaurantOwner) user_list.getUser(direction, "Restaurant Owner") ).getRestaurant();
    }
    
    public Member showEmployees(int direction){
        return user_list.getMemberEmployeed(direction, current_user.getMatricula());
    }
    
    public void removeEmployee(){
        Member member_user = (Member) current_user;
        member_user.getEmployee().setAllParams(null,null,0);
    }
    
    //Getters and Setters
    public void createBill(String matricula_receive, String matricula_pay, float credit, String description){
        user_list.getUserByMatricula(matricula_receive).getBillList().createBill(credit, description);
        user_list.getUserByMatricula(matricula_pay).getBillList().createBill(-credit, description);
    }
    
    
    public User getCurrentUser(){
        return current_user;
    }
    
    public User getLastUser(){
        return user_list.getLast();
    }
    
    public User getUserByMatricula(String matricula){
        return user_list.getUserByMatricula(matricula);
    }
    
    public User getUserByMatricula(String matricula, String type){
        return user_list.getUserByMatricula(matricula, type);
    }
    
    
}
