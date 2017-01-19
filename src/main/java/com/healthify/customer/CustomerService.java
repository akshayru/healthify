package com.healthify.customer;

import java.util.HashMap;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value="/rest/customer")
class CustomerService{
 
   @RequestMapping(value="/",method = RequestMethod.GET)
   public HashMap<Long,Customer> getAllCustomer(){
      return ApplicationCustomer.hmCustomer;
   }
   @RequestMapping(value="/add",method = RequestMethod.POST)
	public Customer addStudent(@RequestBody Customer customer){	   
	   ApplicationCustomer.hmCustomer.put(new Long(customer.getId()), customer);
	   return customer;	 
	}
   @RequestMapping(value="/addnew",method = RequestMethod.POST)
	public Customer addCustomerNew(@RequestBody Customer customer){	 
//	   Student student=new Student(name,subject);
	   ApplicationCustomer.hmCustomer.put(new Long(customer.getId()), customer);
	   return customer;	 
	}
   @RequestMapping(value="/update",method = RequestMethod.PUT)
   public Customer updateCustomer(@RequestBody Customer customer) throws Exception {

      if(ApplicationCustomer.hmCustomer.containsKey(new Long(customer.getId()))){
    	  ApplicationCustomer.hmCustomer.put(new Long(customer.getId()), customer);
      }else{
         throw new Exception("Student "+customer.getId()+" does not exists");
      }

      return customer;
   }
   @RequestMapping(value="/delete/{id}",method = RequestMethod.DELETE)
   public Customer deleteCustomer(@PathVariable long id) throws Exception {
    
      Customer customer;
    
      if(ApplicationCustomer.hmCustomer.containsKey(new Long(id))){
         customer=ApplicationCustomer.hmCustomer.get(new Long(id));
         ApplicationCustomer.hmCustomer.remove(new Long(id));
      }else{
         throw new Exception("Student "+id+" does not exists");
      }
      return customer;
   }
   @RequestMapping(value="/{id}",method = RequestMethod.GET)
   public Customer getCustomer(@PathVariable long id){
      return ApplicationCustomer.hmCustomer.get(new Long(id));
   }
}