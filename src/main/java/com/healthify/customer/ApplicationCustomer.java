package com.healthify.customer;

import java.sql.Date;
import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationCustomer {
 
   public static HashMap<Long,Customer> hmCustomer;
 
   public static void main(String[] args) {
	   hmCustomer=new HashMap<Long,Customer>();
	  Date date = new Date(0); 	
      Customer one=new Customer("Akshay","Ashokrao","Rudraksha","M",date,"AKSH@GMAIL.COM",92535,"CCC","2103 ALLEGRE","NAPERVILLE","IL",60563);
      hmCustomer.put((long) 1,one);
 
      SpringApplication.run(ApplicationCustomer.class, args);
 
      
   }
}
