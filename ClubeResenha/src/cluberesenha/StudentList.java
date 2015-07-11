/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluberesenha;

import java.util.ArrayList;

/**
 *
 * @author cirochang
 */
public class StudentList {
    private ArrayList<Student> student = new ArrayList<>();
    private int num_student = 0;
    
    public void createStudent(String matricula, String note){
        student.add( new Student() );
        student.get(student.size()-1).setAllParams(matricula, note);
    }
    
    public void createStudent(String matricula){
        student.add( new Student() );
        student.get(student.size()-1).setMatricula(matricula);
    }
    
    public void editStudent(String matricula, String note){
        student.get(num_student).setAllParams(matricula, note);
    }
    
    public void deleteStudent(){
        student.remove(num_student);
    }
    
    public void deleteStudentByMatricula(String matricula){
        for(int i=0; i< student.size(); i++){
            if(student.get(i).getMatricula().equals(matricula)){
                student.remove(i);
            }
        }
    }
      
    public Student getStudent(int direction){
        if(num_student + direction >= student.size()){
            num_student = 0;
        }
        else if(num_student + direction < 0){
            num_student = student.size()-1;
        }
        else{
            num_student = num_student + direction;
        }
        return this.student.get(num_student);
    }
    
    public Student getStudentByMatricula(String matricula){
            for(Student student_selected : student){
                if(student_selected.getMatricula().equals(matricula)){
                    return student_selected;
                }
            }
        return null;
    }
    
}
