package week1day2;

public class FibonnaciSeries {

	public static void main(String[] args) {
		int inputRange=15;
		int firstNum=0,SecondNum=1;
		int sum=0;
		System.out.println("the fibonacci series of the input range:");
		System.out.print(firstNum+","+SecondNum+",");
		for(int i=1;i<=inputRange;i++) {
			sum= firstNum+SecondNum;
			firstNum=SecondNum;
			SecondNum=sum;
			System.out.print(sum+",");
		}
		

	}

}
