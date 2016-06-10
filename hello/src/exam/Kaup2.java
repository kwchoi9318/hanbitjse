/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 *@date   :2016. 6. 10.
 *@author : 최경욱
 *@file   :Kaup2.java
 *@story  :카우푸지수 구하는 프로그램
 */
public class Kaup2 {
	/**
	 * bmi 지수 소수점 이하 2 자리에서 끊어주세요.
	 * 
	 * */
	public static void main(String[] args) {
		//------------init---------------
		Scanner scanner = new Scanner(System.in);
		String name = "", result = "";
		double bmi = 0.0,height = 0.0,weight = 0.0,kaup = 0.0;
		//--------------op---------------
		System.out.println("이름?");
		name = scanner.next();
		System.out.println("키?");
		height = scanner.nextDouble();
		System.out.println("몸무게?");
		weight = scanner.nextDouble();
		
		kaup = weight/(height/100)/(height/100);
		
		if(kaup<18.5){
		result ="저체중";
		}else if(kaup<22.9&&kaup>18.5){
			result ="정상";	
		}else if(kaup<24.9&&kaup>18.5){
			result ="위험체중";
		}else if(kaup<29.9&&kaup>25.0){
			result ="비만1";
		}else if(kaup<40&&kaup>30.0){
			result ="비만2";
		}else if(kaup>=40){
			result ="비만3";
		}
		
		double d = Double.parseDouble(String.format("%.2f", kaup));
		System.out.println("name+은 BMI 지수는 "
				+Double.parseDouble(String.format("%.2f", kaup))+"이고,"
				+ " "+result+"이다 ");
		
		
	}
}
