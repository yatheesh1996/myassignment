package week1day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int input=73;
		int count=0;
		boolean flag;
		if(input<=1) {
			//System.out.println(input+" is not a prime number");
			flag=false;
		}
		for(int i=2;i<=input/2;i++) {
			if(input%i==0) {
				count++;
			}
		}
		if(count>1) {
			//System.out.println(input+" is not a prime number");
			flag=false;
		}else {
			//System.out.println(input+" is a prime number");
			flag=true;
		}
		if(flag==true) {
			System.out.println(input+" is a prime number");
		}else
		{
			System.out.println(input+" is not a prime number");
		}
		
	
	}

}
