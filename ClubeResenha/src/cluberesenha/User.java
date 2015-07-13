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
public abstract class User {
    protected String matricula;
    protected String user_type;
    protected String first_name;
    protected String last_name;
    protected String email;
    protected String password;
    protected String phone;
    protected String rg;
    protected String cpf;
    //protected Date birth_date = new Date();
    //protected Date created_at;
    //protected Date updated_at;
    protected Adress adress;
    protected SportClassList sport_class_list = SportClassList.getInstance();
    protected AcademySerie academy_serie = new AcademySerie();
    protected MedicalExam medical_exam = new MedicalExam();
    
    public abstract String getTypeName();
    
    public AcademySerie getAcademySerie(){
        return this.academy_serie;
    }
    
    public MedicalExam getMedicalExam(){
        return this.medical_exam;
    }

    
    //NEED TO IMPLEMENT...
    public void createAdress(String street, int number, String state){
        
    }
    
    public String getFullName(){
        return first_name + " " + last_name;
    }
    
    public SportClass getMySportClassStudent(int direction){
        return sport_class_list.getSportClassStudent(direction, this.matricula);
    }
    
    public SportClass getAllSportClass(int direction){
        return sport_class_list.getSportClass(direction);
    }
    
    public boolean checkSportClassStudent(){
        return sport_class_list.checkSportClassStudent(this.matricula);
    }
    
     //GETTERS AND SETTERS
    
    public void setAllParams(String user_type, String matricula, String first_name, String last_name, String email, String password, String phone, String rg, String cpf){
        setUserType(user_type);
        setMatricula(matricula);
        setFirstName(first_name);
        setLastName(last_name);
        this.setEmail(email);
        this.password = password;
        this.setPhone(phone);
        this.setRg(rg);
        this.setCpf(cpf);
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getFirstName() {
        return first_name;
    }

    public void setFirstName(String first_name) {
        this.first_name = first_name;
    }

    public String getUserType() {
        return user_type;
    }

    public void setUserType(String user_type) {
        this.user_type = user_type;
    }

    public String getLastName() {
        return last_name;
    }

    public void setLastName(String last_name) {
        this.last_name = last_name;
    }


    public String getPhone() {
        return phone;
    }

 
    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String getRg() {
        return rg;
    }


    public void setRg(String rg) {
        this.rg = rg;
    }


    public String getCpf() {
        return cpf;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

 
    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    
}
