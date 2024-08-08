
public class Avg_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {10,20,30,40,50};
		int sum = 0;
		for(int i=0;i<arr1.length;i++) {
			sum=sum+arr1[i];
		}
		int avg = sum/arr1.length;
		System.out.println("The Average is: "+ avg);

	}

}
