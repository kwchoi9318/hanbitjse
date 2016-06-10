/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 *@date   :2016. 6. 10.
 *@author : 최경욱
 *@file   :Kaup.java
 *@story  :카우푸지수 구하는 프로그램
 */
public class Kaup {
	/**
	 * 개발자님 프로그램 제작의뢰입니다.
	 * 비만지수를 구하는 것인데요
	 * 키와 몸무게를 입력하면 당사자가 
	 * 비만인지 저체중인지 알려주는
	 * 프로그램을 만들어 주세요
	 * 돈은 입금했습니다.
	 * 잘은 모르는데 kaup 공식을 쓰면 된다고 하네요.
	 * 
	 * 
	 * */		
	public static void main(String[] args) {
		 int  gram = 0;
		 double height = 0.0, bm = 0.0;	 
		 String result = "", name = "";
		Scanner scanner = new Scanner(System.in);
		
			System.out.print("이름을 입력해주세요: ");
			name = scanner.next();
			System.out.print("키를 입력해주세요:  ");
			height = scanner.nextDouble();
			System.out.print("몸무게를 입력해주세요:  ");
			gram = scanner.nextInt();
			
			
			bm = (gram/height)/height;
			
			if (bm<18.5) {
				result = "저체중";
				
			}else if(bm>=18.5&&bm<=22.9){
				result = "정상체중";
			
			}else if(bm>=23.0&&bm<=24.9){
				result = "위험";
			}else if(bm>=25.0&&bm<=29.9){
				result = "비만 1단계";
			
			}else if(bm>=30.0&&bm<=39.9){
				result = "비만2단계";
			
			}else if(bm>=40.0){
				result = "비만3단계";
			}else{
				System.out.println("측정 범위 초과");
			return;
			}
				
				
				
			System.out.println(""+name+"씨의 키는 "+height+" "
					+ "몸무게는 "+gram+" 체질량지수는"+bm+" "+result+"입니다");	
			}
}
