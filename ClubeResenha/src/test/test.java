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

/**
 *
 * @author cirochang
 */
public class test {
    public static void main( String[] args ) 
    {
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
}
