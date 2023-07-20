package confirm.ch06;

class MemberService{
	public boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		}else {
			return false;
		}
	}
	
	public void logout(String id) {
		System.out.println(id + "님이 로그아웃 되었습니다.");
	}
}


public class Test15 {
	public static void main(String[] args) {
		//15번
		MemberService service = new MemberService();
		
		boolean result = service.login("hong", "12345");
		
		if(result) {
			System.out.println("로그인 되었습니다.");
			service.logout("hong");
		}else {
			System.out.println("id, password가 올바르지 않습니다.");
		}
	}

}
