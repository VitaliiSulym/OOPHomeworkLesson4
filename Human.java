

public class Human {

	private String name;
	private String surname;
	private String sex;
	private int age;
	private int height;
	private int weight;

	public Human(String name, String surname, String sex, int age, int height, int weight) {
		super();
		this.name = name;
		this.surname = surname;
		this.sex = sex;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public Human() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Name=" + name + ", Surname=" + surname + ", sex=" + sex + ", age=" + age + ", height=" + height
				+ ", weight=" + weight;
	}

}
