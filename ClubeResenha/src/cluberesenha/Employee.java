/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluberesenha;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author cirochang
 */
public class Employee {
    private String matricula_boss;
    private String cargo;
    private float salary;

    public void setAllParams(String matricula_boss, String cargo, float salary){
        setMatriculaBoss(matricula_boss);
        setCargo(cargo);
        setSalary(salary);
    }
    
    public String getSalary_to_s(){
        Locale localeBR = new Locale("pt","br"); //Cria o locale do Brasil
        NumberFormat n = NumberFormat.getInstance(localeBR); //Cria um NumberFormat com base no locale
        n.setMinimumFractionDigits(2); //Seta o número mínimo de casa decimal
        n.setMaximumFractionDigits(2); //Seta o número máximo de casa decimal
        return n.format(salary);
    }
    
    /**
     * @return the matricula
     */
    public String getMatriculaBoss() {
        return matricula_boss;
    }


    public void setMatriculaBoss(String matricula_boss) {
        this.matricula_boss = matricula_boss;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the salario
     */
    public float getSalary() {
        return salary;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalary(float salario) {
        this.salary = salario;
    }
}
