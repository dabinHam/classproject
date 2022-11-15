import com.first.app.dept.Dept;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DeptTest {

    @Test
    public void DateTest(){
        Dept dept = new Dept(10, "test", "loc");

        dept.setDeptno(60);
        System.out.println(dept);

        Assertions.assertEquals(10,dept.getDeptno(),"부서 번호 테스트 ");
    }

}
