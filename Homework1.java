import java.util.Scanner;

class Homework1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요: ");
		
		
		int num1 = sc.nextInt();
		int result = 0;
		result = num1; 
		System.out.println("현재까지 입력된 정수의 합은 " + result + "입니다");
		
		int num2 = sc.nextInt();
		result += num2;
		System.out.println("현재까지 입력된 정수의 합은 " + result + "입니다");
		
		int num3 = sc.nextInt();
		result += num3;
		System.out.println("현재까지 입력된 정수의 합은 " + result + "입니다");
		
		int num4 = sc.nextInt();
		result += num4;
		System.out.println("현재까지 입력된 정수의 합은 " + result + "입니다");
		
		int num5 = sc.nextInt();
		result += num5;
		System.out.println("현재까지 입력된 정수의 합은 " + result + "입니다");
	}
}