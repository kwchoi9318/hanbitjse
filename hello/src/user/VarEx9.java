package user;

import java.util.Scanner;

public class VarEx9 {
			public static void main(String[] args) {
				
				Scanner scanner = new Scanner(System.in);
				double x = 0.0, y = 0.0, z = 0.0;
				System.out.println("실수 x 입력");
				 x = scanner.nextDouble();
				System.out.println("실수 x 입력");
				 y = scanner.nextDouble();
				 z = x/y;
				System.out.println("x/y="+z);
			}
}
