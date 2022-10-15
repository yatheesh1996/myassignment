package week3java2;

public class PalindromeStringMethod {

	public static void main(String[] args) {
		String name= "madam";
		String rev="";
		char[] c= name.toCharArray();
		for(int i=c.length-1;i>=0;i--) {
			rev=rev+ c[i];
			}
		System.out.println("The reversed string value is "+rev);
		System.out.println("The given input String value "+name+" is a palindrome : "+rev.equalsIgnoreCase(name));
		
	}

}
