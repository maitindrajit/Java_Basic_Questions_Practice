package Array_Questions;

import java.util.*;

public class palindrome_num_in_range {

	static boolean rev(int a) {
		int sum=0;
		int copy =a;
		while(a>0) {
			int r=a%10;
			sum=sum*10+r;
			a=a/10;
		}
		if(sum==copy) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 100;
		int n2 = 150;
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=n1; i<=n2; i++) 
		{
			if(rev(i))
				list.add(i);
		}
		System.out.print(list);
		
	}

}
