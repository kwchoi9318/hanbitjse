/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 *@date   :2016. 6. 8.
 *@author : 최경욱
 *@file   :Calc.java
 *@story  :
 */
public class Calc3 {
	/*
	 * 두개의 정수를 입력받아서
	 * opcode값이 1이면 덧샘
	 * 2면 뺄샘
	 * 3이면 곱샘
	 * 4면 나눗샘
	 * 5면 나머지 구하는 계산기
	 * */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = 0, num2 = 0,numResult = 0;
		String symbol = "", count = "";
		System.out.print("첫번째 숫자: ");
		 num1 = scanner.nextInt();
		System.out.print("연산자 : ");
		 count = scanner.next();
		 System.out.print("두번째 숫자 : "); 
		 num2 = scanner.nextInt();
		 switch (count) {
		case "+":
			numResult = num1 + num2;
			symbol = "+";
			
			break;
		case "-":
			
			numResult = num1 - num2;
			symbol = "-";
		
			break;
		case "*":
			numResult = num1 * num2;
			symbol = "*";
		
			break;
		case "/":
			numResult = num1 / num2;
			symbol = "/";
			
			break;
		case "%":
			numResult = num1 % num2;
			symbol = "%";
			
			break;
		
		
				
		
		default:
			System.out.println("1~5까지만 입력바랍니다.");
			break;
		}
		
	System.out.println(num1+symbol+num2+"="+numResult);	
	}
	
}
