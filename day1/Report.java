package week1.day1;

public class Report {

	public static void main(String[] args) {
		Student s = new Student();
		System.out.println("Name of the student - "+s.studentName );
		System.out.println("Roll number - "+ s.rollNo);
		System.out.println("College name - "+ s.collegeName);
		System.out.println("Marks scored out of 500 - "+ s.marksScored);
		System.out.println("cgpa - "+ s.cgpa);
	}

}
