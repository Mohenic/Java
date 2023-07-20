package confirm.ch06;

class ShopService {
	private static ShopService instance = new ShopService();
	
	public static ShopService getInstance() {
		return instance;
	}
	
	private ShopService() {}
	
}

public class Test18 {
	public static void main(String[] args) {
		// 18번
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 객체 입니다.");
		}else {
			System.out.println("다른 객체 입니다.");
		}
	}
}
