class Student {
	private String name;
	private int geburtsjahr;

	public Student(String name, int geburtsjahr) {
		this.name = name;
		this.geburtsjahr = geburtsjahr;
	}

	public boolean equals(Student other) {
		if (this == other) return true;
		if (other == null) return false; // !? 

		if (this.name.equals(other.name) && this.geburtsjahr == other.geburtsjahr) {
			return true;
		}
		return false;
	}
}

public class AdHoc {



	public static void main(String... args) {
		Student s1 = new Student("Peter", 2001);
		Student s2 = s1;
		Student s3 = new Student("Peter", 2001);
		Student s4 = new Student("Lisa", 2003);


		System.out.println("s1 == s2: " + (s1 == s2));
		System.out.println("s1 == s3: " + (s1 == s3));
		System.out.println("s1 == s3: " + (s1.equals(s3)));
		System.out.println("s1 == s4: " + (s1.equals(s4)));
	}

}
