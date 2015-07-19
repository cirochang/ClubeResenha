/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluberesenha;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

/**
 *
 * @author cirochang
 */
public class BillList {
    private ArrayList<Bill> bill = new ArrayList<>();
    private int num_bill = 0;
    
    
    public void createBill(float credit, String description){
        bill.add( new Bill() );
        bill.get(bill.size()-1).setAllParams(credit, description);
    }
    
    public ArrayList getBillInfo(){
        ArrayList<String> bill_info = new ArrayList<>();
        for(Bill selected_bill : bill){
            bill_info.add("CREDIT: "+ selected_bill.getCredit_to_s()+ " , DESCRIPTION: "+selected_bill.getDescription()+" , DATE: "+ selected_bill.printDate());
        }
        return bill_info;
    }
    
    public float getTotalCredit_to_f(){
        float total_float = 0;
        for(Bill selected_bill : bill){
            total_float += selected_bill.getCredit();
        }
        return total_float;
    }
    
    public String getTotalCredit(){
        float total_float = getTotalCredit_to_f();
        Locale localeBR = new Locale("pt","br"); //Cria o locale do Brasil
        NumberFormat n = NumberFormat.getInstance(localeBR); //Cria um NumberFormat com base no locale
        n.setMinimumFractionDigits(2); //Seta o número mínimo de casa decimal
        n.setMaximumFractionDigits(2); //Seta o número máximo de casa decimal
        return n.format(total_float);
    }

}
