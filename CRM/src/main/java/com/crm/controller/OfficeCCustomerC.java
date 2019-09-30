package com.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.crm.dao.OfficeCustomerDao;
import com.crm.model.OfficeCustomer;
import com.crm.util.Popup;
import com.crm.util.Status;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class OfficeCCustomerC {

	@Autowired OfficeCustomerDao ocdao;
	
	@DeleteMapping("/customeroffice/{cid}/{oid}")
	public Status deleteOne(OfficeCustomer oc) {
		
	    if(ocdao.delete(oc) > 0)
	    	return new Status();
	    else
	    	return new Status(false, Popup.ERROR, "" );
	 }
	
	@PostMapping("/customeroffice/{cid}/{oid}")
	public Status create(OfficeCustomer oc) {
		
		if(ocdao.insert(oc) > 0)
	    	return new Status();
	    else
	    	return new Status(false, Popup.ERROR, "" );
	 }
}
