package com.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.crm.dao.CustomerDao;
import com.crm.model.Customer;
import com.crm.util.Popup;
import com.crm.util.Status;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class CustomerC {
	
	@Autowired CustomerDao cdao;
	
	@GetMapping("/customer")
	public List<Customer> selectAll() {		
	    return cdao.selectAllwithOffice();
	  }
	
	@GetMapping("/customer/office/{id}")
	public List<Customer> selectByOffice(@PathVariable int id) {		
	    return cdao.selectByOffice(id);
	  }
	
	@GetMapping("/customer/{id}")
	public Customer selectOne(@PathVariable int id) {		
	    return cdao.selectByPrimaryKey(id);
	 }
	
	@DeleteMapping("/customer/{id}")
	public int deleteOne(@PathVariable int id) {		
	    return cdao.deleteByPrimaryKey(id);
	 }
	
	@PostMapping("/customer")
	public Status create(@RequestBody Customer c) {
		if(cdao.insert(c) > 0)
			return new Status();
		else
			return new Status(false, Popup.ERROR, "");
	}
	
	@PutMapping("/customer")
	public Status change(@RequestBody Customer c) {
		if(cdao.updateByPrimaryKeySelective(c) > 0)
			return new Status();
		else
			return new Status(false, Popup.ERROR, "");
	}
				
}
