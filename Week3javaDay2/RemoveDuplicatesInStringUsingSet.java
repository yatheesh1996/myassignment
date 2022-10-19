package week3java2day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesInStringUsingSet {

	public static void main(String[] args) {
		String s = "PayPal India";
		String L = s.toLowerCase();
		char[] c = L.toCharArray();
		Set <Character> charSet= new LinkedHashSet<Character>();
		Set <Character> dupCharSet= new LinkedHashSet<Character>();
		for(int i=0;i<c.length;i++) {
			if(!charSet.add(c[i])) {
					dupCharSet.add(c[i]);
				}
			}
		System.out.println(dupCharSet);
			charSet.removeAll(dupCharSet);
		
	
	System.out.println(charSet);
	//paylindia
	List<Character> List= new ArrayList<Character>(charSet);
	for (int i = 0; i <List.size() ; i++) {
		if(List.get(i)!=' ') {
			System.out.print(List.get(i)); 
		}
	}
	
	
	
	
	
	
	
	}

}
