package sub1;

/**
 * 날짜 : 2023/06/28
 * 이름 : 손영우
 * 내용 : Java 제네릭 실습하기
 * 
 *  제네릭(Generic)
 *   - 클래스 내부의 속성 타입을 동적으로 일반화 시키는 문법
 *   - 제네릭 사용으로 클래스를 범용성있게 사용 
 */
public class GenericTest {
	public static void main(String[] args) {
		
		Apple a = new Apple("한국", 3000);
		Banana b = new Banana("일본", 2000);
		
		FruitBox<Apple> appleBox = new FruitBox<>();
		appleBox.setFruit(a);
		System.out.println(appleBox.getFruit());
		
		FruitBox<Banana> bananaBox = new FruitBox<>();
		bananaBox.setFruit(b);
		System.out.println(bananaBox.getFruit());
		
	}
}
