
package branch;

import java.util.Scanner;

/**
 *@date   :2016. 6. 8.
 *@author : 최경욱
 *@file   :Avg.java
 *@story  :
 */
public class Avg {
	/* 이름과 국영수 세 과목점수 입력 받기
	 * [홍길동 : 총점 ***점, 평균 ***점, 합격여부(불합격) : ]
	 * 평균 소수점 이하는 절삭
	 * 평균점수가 90점 이상이면 A, 
	  *80이상이면 B합격
	 
	 *70이상 c
	 *60이상 d 50이상 e 50미만이면 f
	 *
	 */
	public static void main(String[] args) {
		//-----------------------------변수 선언부, 준비, 초기화(init)----------
		int kor = 0,eng = 0,mth = 0,sum = 0, avg = 0;
		String name = "", i = "";
		Scanner scanner = new Scanner(System.in);
		//------------------------------연산부 (알고리즘)-------------------------------
		System.out.println("이름을 입력하세요.");
			 name = scanner.next();
			 
		System.out.println("국어점수 : [ ]");
			 kor = scanner.nextInt();
			 if(kor > 100 || kor<0){
				 System.out.println("100점 이하의 점수만 입력해주세요.");
			 return;
			 }
			 
		System.out.println("영어점수 : [ ]");
			 eng = scanner.nextInt();
			 if(kor > 100 || kor<0){
				 System.out.println("100점 이하의 점수만 입력해주세요.");
			 return;
			 } 
			 
		System.out.println("수학점수 : [ ]");
			 mth = scanner.nextInt();
			 if(kor > 100 || kor<0){
				 System.out.println("100점 이하의 점수만 입력해주세요.");
			 return;
			 }
			 
			 sum = kor+eng+mth;
			 avg = (int)sum/3;
			
			 if(avg >= 90){
				 i  = "A";
			 }else if(avg >= 80){
				 i = "B";
			 }else if(avg >= 70){
				 i = "C";
			 }else if(avg >= 60){
				 i = "D";
			 }else if(avg >= 50){
				 i = "E";
			 } else{
				 i = "F";
			 }
				 
			 
			//--------------------------출력부 (콘솔) --------------------------
			System.out.println("["+name+" : 총점 "+sum+"점, 평균 "+avg+" 점,"+i+"학점입니다]");
	}

}
