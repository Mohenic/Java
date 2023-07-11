package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *  날짜 : 2023/07/11
 *  이름 : 손영우
 *	내용 : PreparedDelete 실습하기
 */
public class PreparedDeleteTest {
	public static void main(String[] args) {
		
		String host = "jdbc:mysql://localhost:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			String sql = "delete from `user2` where `uid` = ?";
			PreparedStatement ptmt = conn.prepareStatement(sql);
			
			ptmt.setString(1, "j101");
			
			ptmt.executeUpdate();
			
			ptmt.close();
			conn.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("DELETE 완료...");
	}
}
