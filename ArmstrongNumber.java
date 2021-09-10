package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 153;
		int num = n;
		double result = 0;
		while (num != 0) {
			int digit = num % 10;
			result = result + Math.pow(digit, 3);
			num = num / 10;

		}
		if (result == n)
			System.out.println(n + " is an amstrong number");
		else
			System.out.println(n + " is not an amstrong number");

	}

}
