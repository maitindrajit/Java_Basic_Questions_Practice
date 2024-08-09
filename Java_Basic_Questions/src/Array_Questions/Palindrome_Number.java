package Array_Questions;

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number You want to check Palindrome: ");
		int a = sc.nextInt();
		int b=a;
		int rev = 0;
		while(a!=0) {
			rev=rev*10+a%10;
			a=a/10;
		}
		if(rev==b) {
			System.out.println("Is a Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}

	}

}
