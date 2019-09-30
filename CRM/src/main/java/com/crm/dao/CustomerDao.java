package com.crm.dao;

import java.util.List;

import com.crm.model.Customer;

public interface CustomerDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
    
    List<Customer> selectAll();
    
    List<Customer> selectAllwithOffice();
    
    List<Customer> selectByOffice(Integer id);
}