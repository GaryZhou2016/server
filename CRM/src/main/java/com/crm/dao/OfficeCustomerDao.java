package com.crm.dao;

import java.util.Map;

import com.crm.model.OfficeCustomer;

public interface OfficeCustomerDao {
    int insert(OfficeCustomer record);

    int insertSelective(OfficeCustomer record);
    
    int delete(OfficeCustomer record);
    
}