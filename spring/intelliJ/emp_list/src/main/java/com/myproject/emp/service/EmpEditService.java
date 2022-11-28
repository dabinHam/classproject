package com.myproject.emp.service;


import com.myproject.emp.domain.EmpDTO;
import com.myproject.emp.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpEditService {

    @Autowired(required = false)
    private EmpMapper empMapper;

    public int editEmp(EmpDTO empDTO){
        return empMapper.updateEmp(empDTO);
    }
}
