/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 *@date   :2016. 6. 9.
 *@author : 최경욱
 *@file   :Num1.java
 *@story  :
 */
public class Num1 {
			
	 /* 저희 반은 학생수가 3명입니다.
	 * 학생의 평균점수는 0~100점사이입니다.
	 * 3명의 평균점수를 입력하면
	 * 1등 홍길동
	 * 2등 김유신
	 * 3등 김구
	 * 이렇게 나오도록 해주세요.
	 * 단, 학생이름은 스캐너로 입력받습니다.
	 * 홍길동
	 * 49
	 * 김유신
	 * 78
	 * 김구
	 * 96
	 * ==============
	 * 1등 김구 96점
	 * 2등 김유신 78점
	 * 3등 홍길동 49점
	 * ==============
	 * */
		public static void main(String[] args) {
			String name = "", name2 = "", name3 = "";
			int avg = 0, avg2 = 0, avg3 = 0; 
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("이름 입력 : ");
				name = scanner.next();
			System.out.print("점수 입력 : ");
				avg = scanner.nextInt();
				
				System.out.print("이름 입력 : ");
				name2 = scanner.next();
			System.out.print("점수 입력 : ");
				avg2 = scanner.nextInt();
				
				System.out.print("이름 입력 : ");
				name3 = scanner.next();
			System.out.print("점수 입력 : ");
				avg3 = scanner.nextInt();
				
			if(avg>avg2&&avg>avg3 ){
			
				
				
				
			}else if
			
			System.out.println("1등 "+name+"은 "+avg+"점");
			System.out.println("2등 "+name2+"은 "+avg2+"점");
			System.out.println("3등 "+name3+"은"+avg3+"점");
		}
	}
