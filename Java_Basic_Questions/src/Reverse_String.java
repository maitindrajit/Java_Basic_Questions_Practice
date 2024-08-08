import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String a = sc.nextLine();
		String rev = "";
		for(int i =0;i<a.length();i++) {
			rev = a.charAt(i)+rev;
		}
		System.out.print("The Reversed String is: "+rev);
	}

}
