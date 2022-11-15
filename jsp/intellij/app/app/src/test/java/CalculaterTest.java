import com.first.app.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculaterTest {

    Calculator cal;

    @BeforeEach         // @BeforeEach : 매번 선언해줘야하는 불편함을 해소해줄 수 있는거!
    public void setup(){
        System.out.println("@BeforeEach");
        cal = new Calculator();
    }

    @Test   // 꼭 @Test 를 사용해줘야 test대상이 된다.
    public void testAdd(){
        System.out.println("test : add() ");

//        Calculator cal = new Calculator();

        Assertions.assertEquals(12, cal.add(10,2), "add(10,2) => 12 Test");  // Assertions: 시멘틱태그 assertEquals(기대값, 계산값)
    }

    @Test
    public void testSub(){
        System.out.println("Test : sub()");
//        Calculator cal = new Calculator();
        Assertions.assertEquals(8,cal.sub(10,2), "sub(10,2) Test");
    }

    @Test
    public void testMul(){
        System.out.println("Test : mul()");
//        Calculator cal = new Calculator();
        Assertions.assertEquals(20,cal.mul(10,2),"mul(10,2) Test");
    }

    @Test
    public void testDiv(){
        System.out.println("Test : div()");
//        Calculator cal = new Calculator();
        Assertions.assertEquals(5,cal.div(10,2),"div(10,2) Test");
    }

    ///////////////////////////////////////////////////////////

    @Test
    public void test(){
//         Assertions.fail("테스트 미 진행");
//        Assertions.assertTrue(true,"테스트하는 메소드의 결과값이 true이면 성공");
//        Assertions.assertNull(null,"메소드의 반환값이 NULL 이면 성공");
//        Assertions.assertNull(true,"메소드의 반환값이 NULL 이면 성공");     // null이 아닌 true를 넣으면 오류
//        Assertions.assertNotNull(new Object(),"메소드의 반환값이 NULL 이 아니면 성공");
//        Assertions.assertNotNull(null,"메소드의 반환값이 NULL 이 아니면 성공");   // 실패


    }
}
