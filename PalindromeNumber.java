package week1.day2;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int actualnum = 353;
		int result = 0;
		int num = actualnum;
		while (num > 0) {
			int n = num % 10;
			result = result * 10 + n;
			num = num / 10;

		}
		if (actualnum == result)
			System.out.println("Number is a palindrome");
	}

}
