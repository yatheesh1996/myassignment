package week3java2day2;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumberUsingSet {
	public static void main(String[] args) {
		Integer[] data = {1,2,2,3,4,6,7,8,8,9,7,12,13,15};
		Set<Integer> set1 = new TreeSet<Integer>();
		for(int i=0;i<data.length;i++) {
			set1.add(data[i]);
		}
		System.out.println("The missing numbers are : ");
		for(int j=1;j<Collections.max(set1);j++) {
			if(!set1.contains(j)) {
				System.out.println(j);
			}
		}
		
		
		
		
		
	
}
}
