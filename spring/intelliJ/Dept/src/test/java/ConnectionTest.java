import com.app.manager.domain.DeptDTO;
import com.app.manager.domain.DeptSearchOption;
import com.app.manager.mapper.DeptMapper;
import com.app.manager.mapper.TimeMapper;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Log4j2
@ExtendWith(SpringExtension.class) // Spring 내부에서 컨테이너 생성해주는거
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml") // 설정 파일의 위치 등록
public class ConnectionTest {

    // 특정클래스 하나에 여러클래스가 필요하다면 아래와 같이 선언하여 사용하면 된다.
    @Autowired
    private DataSource dataSource;

    @Autowired(required = false)
    private TimeMapper timeMapper;

    @Autowired(required = false)
    private DeptMapper deptMapper;

    @Test
    public void deptSelectByDeptnosTest(){

        List<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(30);

        log.info(">>>>>>>>>>>>>>>>> IN 연산 테스트 "+ deptMapper.selectByDeptnos(list));
    }

    @Test
    public void deptSelectByOptionTest(){
        log.info(deptMapper.selectByOption(DeptSearchOption.builder().searchType(null).keyword(null).build()));
    }


    /* 실제로 할때엔 각각 메소드 만들어서 테스트 하기! */
    @Test
    public void getDeptListTest(){
       log.info("LIST >>>>>>>>>>  " + deptMapper.selectAll());
//        log.info("DEPT 정보 >>>>>>>>>>  " + deptMapper.selectBydeptno(40));
//        DeptDTO deptDTO = new DeptDTO(50,"test","testLoc");
        DeptDTO deptDTO = new DeptDTO(10,"DEV","SEOUL");
//        log.info("DEPT 정보 >>>>>>>>>>  " + deptMapper.insertDept(deptDTO));
//        log.info("DEPT 수정 >>>>>>>>>>  " + deptMapper.updateDept(deptDTO));
       // log.info("DEPT 삭제 >>>>>>>>>>  " + deptMapper.deleteByDeptno(50));
    }

    @Test
    public void getTimeTest(){
        log.info(timeMapper.getTime());
    }

    @Test
    public void connectionTest() throws SQLException {
        Connection connection = dataSource.getConnection();

        log.info(connection);

        Assertions.assertNotNull(connection);

        connection.close();
    }


}
