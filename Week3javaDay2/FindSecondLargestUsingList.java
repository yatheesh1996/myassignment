package week3java2day2;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargestUsingList {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> set1 = new TreeSet<Integer>();
		for(int i=0;i<data.length;i++) {
			set1.add(data[i]);
		}
		System.out.println(set1);
		List<Integer> listFinal= new ArrayList<Integer>(set1);
		int size = listFinal.size();
		System.out.println(listFinal.get(size-2));
		

	}

}
