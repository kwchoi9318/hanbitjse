
package exam;

import java.util.Scanner;

/**
 *@date   :2016. 6. 8.
 *@author : 최경욱
 *@file   :Average.java
 *@story  :
 */
public class Average {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
			String name = scanner.next();
		System.out.println("국어점수 : [ ]");
			int kor = scanner.nextInt();
		System.out.println("영어점수 : [ ]");
			int eng = scanner.nextInt();
		System.out.println("수학점수 : [ ]");
			int mth = scanner.nextInt();
			
			int sum = kor+eng+mth;
			int avg = (int)sum/3;
			
			System.out.println("["+name+" : 총점 "+sum+"점, 평균 "+avg+" 점]");
	}
}
