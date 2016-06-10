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
public class Calc2 {
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
		int opcode = 0,num1 = 0, num2 = 0,i = 0;
		String j = "";
		System.out.println("두개의 정수를 입력하세요");
		 num1 = scanner.nextInt();
		 num2 = scanner.nextInt();
		 switch (opcode) {
		case 1:
			i = num1 + num2;
			j = "+";
			
			
			break;
		case 2:
			
			i = num1 - num2;
			j = "-";
		
			break;
		case 3:
			i = num1 * num2;
			j = "*";
		
			break;
		case 4:
			i = num1/num2;
			j = "/";
			
			
		
		default:
			System.out.println("이외의 연산자 사용불가");
			break;
		}
		/*System.out.println("opcode의 값을 입력하세요"); 
		 opcode = scanner.nextInt();
		if (opcode == 1) {
			
		}else if(opcode == 2){
		}else if(opcode == 3){
			i = num1 + num2;
			j = "*";
		}else if(opcode == 4){
			i = num1 + num2;
			j = "/";
		 }else{
			 
			 i = num1 + num2;j = "%";
			 return;
		}*/
	System.out.println(num1+j+num2+"="+i);	
	}
	
}
