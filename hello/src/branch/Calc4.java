/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 *@date   :2016. 6. 9.
 *@author : 최경욱
 *@file   :Calc4.java
 *@story  :
 */
public class Calc4 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
			int sum = 0,num1 = 0, num2 = 0;
			String count = "";
			
			System.out.print("첫번째숫자 :  ");
			num1 = scanner.nextInt();
	
			System.out.print("연산자 입력 : ");
			count  = scanner.next();
			
			System.out.print("두번째 숫자 : ");
			num2 = scanner.nextInt();
			
			switch (count) {
			case "+":
				sum = num1 +num2;
				break;
			case "-":
				sum = num1 - num2;

			default:
				System.out.println(" + 이외의 연산자는 적용이 안됩니다.");
			}
			System.out.println(num1+count+num2+"="+sum);
	
	}
}
