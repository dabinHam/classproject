package com.first.app.service;


import com.first.app.domain.DeptDTO;
import com.first.app.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptEditService {

    @Autowired(required = false)
    private DeptMapper deptMapper;

    public int editDept(DeptDTO deptDTO){
        return deptMapper.updateDept(deptDTO);
    }
}
