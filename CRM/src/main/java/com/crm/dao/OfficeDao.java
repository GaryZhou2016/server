package com.crm.dao;

import java.util.List;

import com.crm.model.Customer;
import com.crm.model.Office;

public interface OfficeDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Office record);

    int insertSelective(Office record);

    Office selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Office record);

    int updateByPrimaryKey(Office record);
    
    List<Office> selectAll();
}