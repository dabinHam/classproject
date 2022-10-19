package jdbc;
//3. Statement 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {

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
			Statement stmt = conn.createStatement();
			
			String sql = "select * from dept";
			ResultSet rs = stmt.executeQuery(sql); //매개변수를 받으면서 DB에 요청을함 객체를 얻어옴 -> 요청한걸 반환하여 ResultSet이 받음
//			stmt.executeUpdate(dbUr1); // 반영된 갯수를 확인 
//			stmt.executeQuery(sql); // 객체를 얻어옴 2개를 제일 많이 사용한다. 
			
			while(rs.next()) {
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
			stmt.close();
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
