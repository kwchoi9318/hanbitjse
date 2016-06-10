/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 *@date   :2016. 6. 10.
 *@author : 최경욱
 *@file   :Calc5.java
 *@story  :
 */
public class Calc5 {

		public static void main(String[] args) {
			
			int num1 = 0, num2 = 0, result = 0, opcode = 0; 
			String cal = "";
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("두개의 정수를 입력하세요.");
			
			num1 = scanner.nextInt();
			num2 = scanner.nextInt();
			
			System.out.println("opcode 의 값을 입력하세요");		
			
			switch (opcode) {
			case 1:
				cal = "+";
				result = num1 +num2;
				break;

			default:
				break;
			}
			
			
			
			
			
			
			
			
			
			System.out.println("a스캐너변수 연산자 b스캐너변수 = 계산결과");
		}
}
