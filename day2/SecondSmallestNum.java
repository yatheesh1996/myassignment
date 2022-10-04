package week1day2;


import java.util.Arrays;

public class SecondSmallestNum {

	public static void main(String[] args) {
		int[] arr= {23,45,67,32,89,22};
		Arrays.sort(arr);
		System.out.println("the sorted array:");
		System.out.println(Arrays.toString(arr));
		System.out.println("the second smallest number in the array is "+arr[1]);

	}

}
