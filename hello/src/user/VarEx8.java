package user;

import java.util.Scanner;

/**
 *@date   :2016. 6. 8.
 *@author : 최경욱
 *@file   :VarEx8.java
 *@story  :실수 타입 double 곱하기 예제
 */
public class VarEx8 {
			public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);
				double x = 0.0, y = 0.0, z = 0.0;
				System.out.println("실수 x 입력");
				 x = scanner.nextDouble();
				System.out.println("실수 x 입력");
				 y = scanner.nextDouble();
				 z = x*y;
				System.out.println("x*y ="+z);
			}
}
