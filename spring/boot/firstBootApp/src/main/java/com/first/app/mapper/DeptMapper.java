package com.first.app.mapper;

import com.first.app.domain.DeptDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptMapper {

    // 전체 부서 리스트
    List<DeptDTO> selectAll();

    // 검색 타입과 키워드를 받아서 검색결과를 반환 (확장을 고려하여 타입과 객체를 가지고있는 별도의 클래스생성)
//    List<DeptDTO> selectByOption(DeptSearchOption searchOption);

    List<DeptDTO> selectByDeptnos(List<Integer> deptnos);

    // 상세 페이지
    DeptDTO selectByDeptno(int deptno);

    // 데이터 수정(변경) 처리
    int updateDept(DeptDTO deptDTO);

    // 삭제 처리
    int deleteByDeptno(int deptno);

    // 입력 처리
    int insertDept(DeptDTO deptDTO);

}
