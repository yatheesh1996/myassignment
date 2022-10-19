package week3java2day2;


import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicateNumbersUsingSet {

	public static void main(String[] args) {
		int[] data = {4,3,6,8,29,1,2,4,7,8};
		System.out.println("The duplicate numbers : ");
		Set<Integer> set1 = new TreeSet<Integer>();
		for(int i=0;i<data.length;i++) {
			if(!set1.add(data[i])) {
				System.out.println(data[i]);
			}
			
		}

	}

}
