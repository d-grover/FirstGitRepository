import java.util.Scanner;

public class Function_Calculator {
	public static void main(String args[]) {
		int num1, num2, sum, subtract, product, quotient;
		num1 = num2 = sum = subtract = product = quotient = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		num1 = sc.nextInt();
		System.out.println("Enter the second number:");
		num2 = sc.nextInt();
		sum = add(num1, num2);
		subtract = subtract(num1, num2);
		product = multiply(num1, num2);
		quotient = divide(num1, num2);
		System.out.println("Operations available:");
		System.out.println("1.Sum");
		System.out.println("2.Subtract");
		System.out.println("3.Product");
		System.out.println("4.Division");
		System.out.println("Enter the operation no to be performed:");
		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("Result is:" + sum);
			break;
		case 2:
			System.out.println("Result is:" + subtract);
			break;
		case 3:
			System.out.println("Result is:" + product);
			break;
		case 4:
			System.out.println("Result is:" + quotient);
			break;
		}
		sc.close();
	}

	static int add(int no1, int no2) {
		return no1 + no2;
	}

	static int subtract(int no1, int no2) {
		return no1 - no2;
	}

	static int multiply(int no1, int no2) {
		return no1 * no2;
	}

	static int divide(int no1, int no2) {
		return no1 / no2;
	}
}
