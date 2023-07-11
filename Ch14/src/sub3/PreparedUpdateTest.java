package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *  날짜 : 2023/07/11
 *  이름 : 손영우
 *	내용 : PreparedUpdate 실습하기
 */

public class PreparedUpdateTest {
	public static void main(String[] args) {
		
		// DB 정보
		
		String host = "jdbc:mysql://localhost:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		try {
			
			// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 3단계 - SQL 실행 객체 생성
			String sql = "update `user2` set `hp` = ?, `age` = ? where `uid` = ?";
			PreparedStatement ptmt = conn.prepareStatement(sql);
			ptmt.setString(1, "010-1234-1111");
			ptmt.setInt(2, 25);
			ptmt.setString(3, "j101");
			
			// 4단계 - SQL 실행
			ptmt.executeUpdate();
			
			// 5단계 - 결과처리 (SELECT 경우)
			
			// 6단계 - 연결해제
			ptmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("UPDATE 완료...");
	}
}
