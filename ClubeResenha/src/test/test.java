/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author cirochang
 */
public class test {
    public static void main( String[] args ) 
    {
    	testDoors();
    }
    
    public static void testDate(){
        try{
 
                DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        	Date date1 = dateFormat.parse("2009/12/31 12:00:00"); //
        	Date date2 = dateFormat.parse("2010/12/31 12:00:00"); //Date now
                Date date = new Date(); // Current now
                System.out.println(dateFormat.format(date));
                
        	System.out.println(dateFormat.format(date1));
        	System.out.println(dateFormat.format(date2));
 
        	if(date1.compareTo(date2)>0){
        		System.out.println("Date1 is after Date2");
        	}else if(date1.compareTo(date2)<0){
        		System.out.println("Date1 is before Date2");
        	}else if(date1.compareTo(date2)==0){
        		System.out.println("Date1 is equal to Date2");
        	}else{
        		System.out.println("How to get here?");
        	}
 
    	}catch(ParseException ex){
    		ex.printStackTrace();
    	}
    }
    
    public static void testDoors(){
    Random rand = new Random();
    int min = 0;
    int max = 2;        
    int randomNum;
    boolean[] door = new boolean[3];
    door[0] = false;
    door[1] = true;
    door[2] = false;
    int man;
    int woman =0;
    boolean loop = true;
    int error = 0;
    int good = 0;
    for(int i=0; i< 100000; i++){
        randomNum = rand.nextInt((max - min) + 1) + min;
        man = randomNum;
        while(loop==true){
            randomNum = rand.nextInt((max - min) + 1) + min;
            woman = randomNum;
            if(woman != man){
                loop = false;
            }
        }
        loop = true;
        if(door[woman] == false){
            while(loop==true){
                randomNum = rand.nextInt((max - min) + 1) + min;
                if(randomNum != man && randomNum != woman){
                    man = randomNum;
                    loop = false;
                }
            }
        }
        
        if(door[man] == true){
            good++;
        }
        else{
            error++;
        }
    }
    float number = good/100000;
    System.out.println("THE RELATION IS: "+ error);

    
       
    
    }
}
