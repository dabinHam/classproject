package jdbc;
// 3. PreparedStatement 이용한 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteTest {

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
			// insert
			String sql = "delete from dept where deptno=?";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, 50);
			
			int result = pstmt.executeUpdate();
			
			if(result>0) {
				System.out.println("삭제되었습니다.");
			}
			
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