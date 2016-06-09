/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date :2016. 6. 9.
 * @author : 최경욱
 * @file :MonthEnd.java
 * @story :
 */
public class MonthEnd {
	/**
	 * 월을 입력하면 말일이 몇일인지 알려주는 프로그램. 단, 2월은 29일로 한정함. 1~12를 벗어난 숫자를 입력하면 잘못된 입력값
	 * 입니다 라고 뜬다.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String month = "";
		String endDate = "";

		System.out.println("월을 입력하세요.");
		

		switch (scanner.next()) {
		case "1":
			endDate = "31일";
			break;
		case "3":
			endDate = "31일";
			break;
	
		case "2":
			endDate = "29일";
			break;
		case "4":
			endDate = "30일";
			break;
		case "5":
			endDate = "31일";
			break;
		case "6":
			endDate = "30일";
			break;
		case "7":
			endDate = "31일";
			break;
		case "8":
			endDate = "31일";
			break;
		case "9":
			endDate = "30일";
			break;
		case "10":
			endDate = "31일";
			break;
		case "11":
			endDate = "30일";
			break;
		case "12":
			endDate = "31일";
			break;
		default : System.out.println("1부터 12를 벗어난 월은 없습니다.");
		}
	System.out.println(""+month+"월 의 말일은 "+endDate+"입니다.");
	
	}
	
}
