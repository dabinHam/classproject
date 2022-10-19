package jdbc;
// 3. PreparedStatement
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest2 {

	public static void main(String[] args) {

		// 1. 드라이버 로드 (생략가능)
		try {
			// 생략 가능
//			Class.forName("oracle.jdbc.driver.OracleDriver"); // 오라클
			Class.forName("com.mysql.cj.jdbc.Driver"); // mysql

			// 2. Connection 객체 생성
//		String dbUr1 = "jdbc:oracle:thin:@localhost:1521:xe"; // 오라클
			String dbUr1 = "jdbc:mysql://localhost:3306/project"; // mysql
			Connection conn = DriverManager.getConnection(dbUr1, "scott", "tiger");

//			if (conn != null) {
//				System.out.println("데이터베이스 연결!");
//				conn.close();
//			}

			// 3. Statement / PreparedStatement
			// PreparedStatement : 변수를 찾아야 할때  
			String sql = "select * from dept where deptno=?";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			// ?에 값을 넣어주기 위하여 (정수가 들어가야함)
			pstmt.setInt(1,10); 	// (index)
			
			
			// Select의 결과를 담고 있는 객체 
			ResultSet rs = pstmt.executeQuery();
//			ResultSet rs = pstmt.executeQuery(sql); // 오버로딩 되어있음.
			
			// 행이 하나 나오는 경우에는 if 를 사용하여 반복시키지않고 처리가 가능하다. | while의 경우는 조건에 따라서 한번 반복하고 나온다.
			if(rs.next()) {
//				int deptno = rs.getInt("deptno");
//				String dname = rs.getString("dname");
//				String loc = rs.getString("loc");
				
				// 숫자로 처리가 가능하다 , 하지만 많이사용되진 않음. 
				int deptno = rs.getInt(1); // 1번째 컬럼
				String dname = rs.getString(2); // 2번째 컬럼
				String loc = rs.getString(3); // 3번째 컬럼
				
				System.out.printf("%d \t %s \t %s \n", deptno, dname, loc);
			}
			
			rs.close();
//			stmt.close();
			pstmt.close();
			conn.close();
			
			
			// 4. ResultSet

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
