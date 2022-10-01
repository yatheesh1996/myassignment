package week1.day1;

public class Mobile {
	public void makecall(String mobileModel, float mobileWeight) {
		System.out.println("model-> "+ mobileModel);
		System.out.println("weight(grams)-> " + mobileWeight);
	}
    public void sendmsg(boolean isFullyCharged, int mobileCost) {
    	System.out.println("is fully charged ->" + isFullyCharged);
    	System.out.println("cost(rupees)-> "+ mobileCost);
    }
	
	public static void main(String[] args) {
		Mobile m = new Mobile();
		m.makecall("samsung S22", 190.15f);
		m.sendmsg(false, 50000);
		System.out.println("This is my mobile");
	}
	
}
