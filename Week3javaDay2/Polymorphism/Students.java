package Polymorphism;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("Student id: "+id);
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("Student name: "+name);
		System.out.println("Student id: "+id);
	}
	public void getStudentInfo( String phoneNumber,String emailId) {
		System.out.println("Student emailId: "+emailId);
		System.out.println("Student phoneNumber: "+phoneNumber);
	}
	public static void main(String[] args) {
		Students s = new Students();
		s.getStudentInfo(2011);
		s.getStudentInfo(2011, "Yatheesh");
		s.getStudentInfo("8667712525", "abc@gmail.com");

	}

}
