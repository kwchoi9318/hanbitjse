/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 *@date   :2016. 6. 9.
 *@author : 최경욱
 *@file   :Avg2.java
 *@story  :
 */
public class Avg2 {
	public static void main(String[] args) {
		int kor = 0, eng = 0, mth = 0, total = 0, avg = 0;
		String name = "",result = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요.");
		name = scanner.next();
		
		System.out.println("국어점수");
		kor = scanner.nextInt();
		if(kor >100){
			System.out.println("100점 이하로 입력하세요");
		return;
		}
		
		System.out.println("영어점수");
		eng = scanner.nextInt();
		if(eng >100){
			System.out.println("100점 이하로 입력하세요");
		return;
		}
		
		System.out.println("수학점수");
		mth = scanner.nextInt();
		if( mth >100){
			System.out.println("100점 이하로 입력하세요");
		return;
		}
		
		total = kor + eng + mth;
		avg = total/3;
		if(avg >40){
			 result = "불합격";
		}else{
			 result = "합격";
		}
		System.out.println("총점"+avg+"점, 평균 "+total+"점,"+result+"입니다");
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
