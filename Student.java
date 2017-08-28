

public class Student extends Human {

	private String university;
	private String faculty;

	public Student(String name, String surname, String sex, int age, int height, int weight, String university,
			String faculty) {
		super(name, surname, sex, age, height, weight);
		this.university = university;
		this.faculty = faculty;
	}

	public Student() {
		super();
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	@Override
	public String toString() {
		return "Student [" + super.toString() + ", university=" + university + ", faculty=" + faculty + "]";
	}
}
