package Array_Questions;

public class Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {4,5,6};
		int count = 0;
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					count++;
				}
				
			}
			
				}
		if(count==arr2.length) {
			System.out.println("Is a subarray");
		}
		else {
			System.out.println("Not subarray");
		}
		
	}

}
