package week1day2;

public class PalindromeOrNot {

	public static void main(String[] args) {
		int num=34343;
		int temp=num;
		String s= Integer.toString(num);
		int sum=0;
		for( int i=s.length();i>0;i--) {
			sum=(sum*10)+(num%10);
			num=num/10;
			
			}
		if(temp==sum) {
			System.out.println(temp+" is a palindrome number");
		}else {
			System.out.println(temp+" is not a palindrome numer");
		}
	}

}


//