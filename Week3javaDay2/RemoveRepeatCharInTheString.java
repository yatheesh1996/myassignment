package week3java2day2;

import java.util.HashSet;
import java.util.Set;

public class RemoveRepeatCharInTheString {

	public static void main(String[] args) {
		String input = "babudd";
		char[] name = input.toCharArray();
		char dup = 0;
		Set <Character> set1 = new HashSet<Character>();
		for(int a=0;a<name.length;a++) {
			if(!set1.add(name[a])) {
				dup=name[a];
				set1.remove(dup);
			}
		}
		
		
		System.out.println("The final characters of the string without duplicates : "+set1);
		

	}

}
