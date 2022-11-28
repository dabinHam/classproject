package com.myproject.emp.service;


import com.myproject.emp.domain.EmpDTO;
import com.myproject.emp.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmpRegService {
    @Autowired(required = false)
    private EmpMapper empMapper;

    public int insertEmp(EmpDTO empDTO){
        return empMapper.insertEmp(empDTO);
    }

}
