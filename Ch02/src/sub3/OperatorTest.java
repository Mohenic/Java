package sub3;

/*
 * 날짜 : 2023/06/13
 * 이름 : 손영우
 * 내용 : Java 연산자 실습하기
 * 
 * 연산자(Operator)
 *  - 변수의 데이터를 처리하기 위한 연산식
 *  - 일반적으로 산술, 복합대입, 비교, 논리연산을 수행
 *  
 */


public class OperatorTest {
	
	public static void main(String[] args) {
		
		// 산술연산자
		
		 int num1 = 1;
		 int num2 = 2;
		 int num3 = 3;
		 int num4 = 4;
		 
		 int result1 = num1 + num2;
		 int result2 = num1 - num2;
		 int result3 = num2 * num3;
		 int result4 = num4 / num2;
		 int result5 = num4 % num3; // 나머지 구하는 연산자
		 
		 System.out.println("result1 : " + result1);
		 System.out.println("result2 : " + result2);
		 System.out.println("result3 : " + result3);
		 System.out.println("result4 : " + result4);
		 System.out.println("result5 : " + result5);
		 
		// 증감연산자
		 
		 int num = 0;
		 
		 num++;
		 ++num;
		 
		 System.out.println("num : " + num);
		 
		 num--;
		 --num;
		 
		 System.out.println("num : " + num);
		 
		// 복합대입연산자
		 
		 int n1 = 1, n2 = 2, n3 = 3, n4 = 4;
		 
		 n1 += 1; // n1 = n1 + 1
		 n2 -= 2; // n2 = n2 - 2
		 n3 *= 3; // n3 = n3 * 3
		 n4 /= 4; // n4 = n4 / 4
		 
		 System.out.println("n1 : " + n1);
		 System.out.println("n2 : " + n2);
		 System.out.println("n3 : " + n3);
		 System.out.println("n4 : " + n4);
		
		// 비교연산자
		 
		 int var1 = 1;
		 int var2 = 2;
		 
		 boolean rs1 = var1 > var2;  // var1은 var2 보다 크다
		 boolean rs2 = var1 < var2;  // var1은 var2 보다 작다
		 boolean rs3 = var1 >= var2; // var1은 var2 보다 크거나 같다
		 boolean rs4 = var1 <= var2; // var1은 var2 보다 작거나 크다
		 boolean rs5 = var1 == var2; // var1은 var2과 서로 같다
		 boolean rs6 = var1 != var2; // var1은 var2과 서로 다르다
		 
		 System.out.println("rs1 : " + rs1);
		 System.out.println("rs2 : " + rs2);
		 System.out.println("rs3 : " + rs3);
		 System.out.println("rs4 : " + rs4);
		 System.out.println("rs5 : " + rs5);
		 System.out.println("rs6 : " + rs6);
		 
		 
		// 논리연산자
		 
		 int var3 = 3;
		 int var4 = 4;
		 
		 boolean res1 = (var3 > 3) && (var4 > 3); // && 'and'
		 boolean res2 = (var3 > 2) && (var4 > 3);
		 boolean res3 = (var3 > 3) || (var4 > 3); // || 'or'
		 boolean res4 = (var3 > 3) || (var4 > 5);
		 boolean res5 = !(var3 > var4); // ! '부정'
		 
		 System.out.println("res1 : " + res1); // var3은 3보다 크고 그리고 var4는 3보다 작다
		 System.out.println("res2 : " + res2); // var3은 2보다 크고 그리고 var4는 3보다 작다
		 System.out.println("res3 : " + res3); // var3은 3보다 크거나 var4는 3보다 작다
		 System.out.println("res4 : " + res4); // var3은 3보다 작거나 var4는 5보다 작다
		 System.out.println("res5 : " + res5); // var3은 var4보다 크지 않다
		 
		 
	}

}
