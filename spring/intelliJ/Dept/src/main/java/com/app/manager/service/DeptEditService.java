package com.app.manager.service;


import com.app.manager.domain.DeptDTO;
import com.app.manager.mapper.DeptMapper;
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
