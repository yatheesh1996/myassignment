package week1day2;

import java.util.Arrays;

public class FindTheMissingNumber {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		for(int i=1;i<=arr.length;i++) {
			if(i!=arr[i-1]) {
				System.out.println(i);
				break;
			}
		}

	}

}
