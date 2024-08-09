package Array_Questions;

public class Max_Min_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,2,3,4,5};
		int min = 999999999;
		int max = 0;
		for(int i =0;i<arr1.length;i++) {
			if(min>arr1[i]) {
				min=arr1[i];
			}
			if(max<arr1[i]) {
				max=arr1[i];
			}
		}
		System.out.println("The min is :"+min);
		System.out.println("The max is :"+max);

	}

}
