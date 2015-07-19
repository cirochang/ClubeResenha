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
public class ReserveList {
    private ArrayList<Reserve> reserve = new ArrayList<>();
    private int num_reserve = 0;
    
    
    public void createReserve(int reserve_num, String matricula){
        if(checkReserveByMatricula(matricula)){
            getReserveByMatricula(matricula).setAllParams(reserve_num, matricula);
        }
        else{
            reserve.add( new Reserve() );
            reserve.get(reserve.size()-1).setAllParams(reserve_num, matricula);
        }
    }
    
    public void editReserve(int reserve_num, String matricula){
        reserve.get(num_reserve).setAllParams(reserve_num, matricula);
    }
    
    public void deleteReserve(){
        reserve.remove(num_reserve);
    }
    
    public Reserve getReserve(){
        return this.reserve.get(num_reserve);
    }
    
    public Reserve getReserve(int direction){
        if(num_reserve + direction >= reserve.size()){
            num_reserve = 0;
        }
        else if(num_reserve + direction < 0){
            num_reserve = reserve.size()-1;
        }
        else{
            num_reserve = num_reserve + direction;
        }
        return this.reserve.get(num_reserve);
    }
    
    public ArrayList getReserveList(){
        return this.reserve;
    }
    
    public Reserve getReserveByMatricula(String matricula){
        for(Reserve selected_reserve : reserve ){
            if(selected_reserve.getMatricula().equals(matricula)){
                return selected_reserve;
            }
        }
        return null;
    }
    
    
    public boolean checkReserveByMatricula(String matricula){
        for(Reserve selected_reserve : reserve ){
            if(selected_reserve.getMatricula().equals(matricula)){
                return true;
            }
        }
        return false;
    }
    
    public boolean checkReserved(int num){
    for(Reserve selected_reserve : reserve ){
            if(selected_reserve.getReserve_num()==num){
                return true;
            }
        }
        return false;
    }

}
