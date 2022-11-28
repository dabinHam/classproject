package com.myproject.emp.mapper;

import com.myproject.emp.domain.EmpDTO;

import java.util.List;

public interface EmpMapper {

    // empno ename job mgr hiredate sal comm deptno
    // selectAll , insertEmp, deleteByEmpno , selectByEmpno, updateEmp

    // 전체리스트
    List<EmpDTO> selectAll();

    // 입력
    int insertEmp(EmpDTO empDTO);

    // 삭제
    EmpDTO deleteByEmpno(int empno);

    // 수정 | 상세 페이지
    EmpDTO selectByEmpno(int empno);

    // 데이터 수정(변경) 처리
    int updateEmp(EmpDTO empDTO);

}
