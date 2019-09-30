package com.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.crm.dao.OfficeDao;
import com.crm.model.Office;
import com.crm.util.Popup;
import com.crm.util.Status;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class OfficeC {

	@Autowired OfficeDao odao; 
	
	@GetMapping("/office")
	public List<Office> selectAll() {		
	    return odao.selectAll();
	  }
	
	@GetMapping("/office/{id}")
	public Office selectOne(@PathVariable int id) {		
	    return odao.selectByPrimaryKey(id);
	 }
	
	@DeleteMapping("/office/{id}")
	public int deleteOne(@PathVariable int id) {		
	    return odao.deleteByPrimaryKey(id);
	 }
	
	@PostMapping("/office")
	public Status create(@RequestBody Office c) {
		if(odao.insert(c) > 0)
			return new Status();
		else
			return new Status(false, Popup.ERROR, "");
	}
	
	@PutMapping("/office")
	public Status change(@RequestBody Office c) {
		if(odao.updateByPrimaryKeySelective(c) > 0)
			return new Status();
		else
			return new Status(false, Popup.ERROR, "");
	}
}
