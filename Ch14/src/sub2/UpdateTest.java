package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * 날짜 : 2023/07/10
 * 이름 : 손영우
 * 내용 : Update 실습하기
 */

public class UpdateTest {
	public static void main(String[] args) {
		
		// DB정보
		
		String host = "jdbc:mysql://localhost:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		
		try {
			
			// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 3단계 - SQL 실행객체 생성
			Statement stmt = conn.createStatement();
			
			// 4단계 - SQL 실행
			String sql = "Update `user1` set `hp` = '010-1234-1111' , `age` = 25 where `name` = '김유신'";
			stmt.executeUpdate(sql);
			
			// 5단계 - 결과처리(SELECT 경우)
			// 6단계 - 연결해제
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Update 완료...");
	}
}
