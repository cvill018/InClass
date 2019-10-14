
public class Student extends Person implements Comparable<Student> {
	public Student() throws NameException {
		super();
		rating = 5;
		// TODO Auto-generated constructor stub
	}

	private String className;
	private Integer rating;
	
	public int compareTo(Student o) {
		return 0;
	}

	public Integer getRating() {
		// TODO Auto-generated method stub
		return new Integer(rating);
	}
}
