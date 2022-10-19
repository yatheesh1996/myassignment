package week3java2day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersectionUsingList {

	public static void main(String[] args) {
		int[] a={3,2,11,4,6,7};
		int[] b={1,2,8,4,9,7};
		List<Integer> l1= new ArrayList<Integer>();
		List<Integer> l2= new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			l1.add(a[i]);
			l2.add(b[i]);
		}
		System.out.println("The list l1 : "+l1);
		System.out.println("The list l1 : "+l2);
		System.out.println("The intersection numbers : ");
		for(int x=0;x<b.length;x++) {
			for(int y=0;y<b.length;y++) {
				if(l1.get(x)==l2.get(y)) {
					System.out.println(+l1.get(x));
				}
				}
		}

	}

}
