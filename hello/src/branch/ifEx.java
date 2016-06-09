/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 *@date   :2016. 6. 8.
 *@author : 최경욱
 *@file   :ifEx.java
 *@story  :Branch 구문예제
 */
public class ifEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수값 하나 입력");
		int input = scanner.nextInt();
		if (input > 10) {
			System.out.println("입력된 값이 "+input+"이 10 보다 큽니다");
		}else{
			System.out.println("입력된 값이 "+input+"이 10 보다 작거나 같습니다");
			
		}
		
	}
}
