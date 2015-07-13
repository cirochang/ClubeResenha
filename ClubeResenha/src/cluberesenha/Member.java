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
public class Member extends User {
    Employee employee = new Employee();
    
    @Override
    public String getTypeName(){
        return "Member";
    }
    
    public boolean hasEmployeed(){
        if(employee.getMatriculaBoss() == null){
            return false;
        }
        else{
            return true;
        }
    }
    
    public Employee getEmployee(){
        return this.employee;
    }
}
