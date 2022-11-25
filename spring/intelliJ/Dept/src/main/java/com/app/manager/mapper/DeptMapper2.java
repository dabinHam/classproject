package com.app.manager.mapper;

import com.app.manager.domain.DeptDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DeptMapper2 {

    // 전체 부서 리스트
    @Select("select * from dept") // 잘 바뀌지 않는 코드들에 한해서 xml 을 사용하지않고 어노테이션을이용해서 사용할 수 있지만
                                    // 확장성이 있거나 추후 수정예정이 있는 코드의 경우 꼭 xml로 빼서 해준다.
    List<DeptDTO> selectAll();

    // 수정 | 상세 페이지
    @Select(" select * from dept where deptno=#{deptno}  ")
    DeptDTO selectBydeptno(int deptno);

    // 데이터 수정(변경) 처리
    @Update("update dept set dname=#{dname} , loc=#{loc} where deptno=#{deptno}")
    int updateDept(DeptDTO deptDTO);

    // 삭제 처리
    @Delete("delete from dept where deptno=#{no}")
    int deleteByDeptno(int deptno);

    // 입력 처리
    @Insert("insert into dept values (#{deptno}, #{dname}, #{loc})")
    int insertDept(DeptDTO deptDTO);

}
