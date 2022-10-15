package week3java2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		int count=0;
		boolean check = text1.length()==text2.length();
		System.out.println(check);
		char[] arr1 = text1.toCharArray();
		char[] arr2 = text2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]!=arr2[i]) {
				count++;
			
			}
		}
		if(count>0) {
			System.out.println("The characters in both arrays are not same");
		}else {
			System.out.println("The characters in both arrays are  same");
		}
	}

}
