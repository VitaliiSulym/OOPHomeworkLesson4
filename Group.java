import java.util.NoSuchElementException;
import java.util.Scanner;

public class Group extends Student implements Voenkom {

	private Student[] group = new Student[10];

	private String groupName;

	public Group(String groupName) {
		super();
	}

	public Group() {
		super();
	}

	public Student[] getGroup() {
		return group;
	}

	public void setGroup(Student[] group) {
		this.group = group;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public void addStudent(Student student, int place) {
		try {
			if (place >= 0 && place <= group.length - 1) {
				if (group[place] == null) {
					group[place] = student;
				} else {
					throw new BusyGroupPlaceException();
				}
			} else {
				throw new GroupOutOfBoundsException();
			}
		} catch (BusyGroupPlaceException | GroupOutOfBoundsException ex) {
			ex.printStackTrace();
		}
	}

	public void interactiveStudentInput(int place) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input name of student and press Enter");
		String name = sc.next();
		System.out.println("Input surname of student and press Enter");
		String surname = sc.next();
		System.out.println("Input sex of student and press Enter");
		String sex = sc.next();
		System.out.println("Input age of student and press Enter");
		int age = sc.nextInt();
		System.out.println("Input height of student and press Enter");
		int height = sc.nextInt();
		System.out.println("Input weight of student and press Enter");
		int weight = sc.nextInt();
		System.out.println("Input university and press Enter");
		String university = sc.next();
		System.out.println("Input faculty and press Enter");
		String faculty = sc.next();
		sc.close();
		addStudent(new Student(name, surname, sex, age, height, weight, university, faculty), place);
	}

	public void removeStudent(int place) {
		if (place >= 0 && place < group.length) {
			if (group[place] != null) {
				group[place] = null;
			} else {
				System.out.println("There is no figure in this part of board");
			}
		}
	}

	public void searchStudent(String surname) {
		boolean b = false;
		for (int place = 0; place < group.length; place++) {

			if (group[place] != null && surname == group[place].getSurname()) {
				b = true;
				System.out.println("This student is already on " + place + " position");
			}

		}
		if (!b) {
			System.out.println("There isn`t such student");
		}

	}

	public void sortBy() {
		GroupSort groupSort = new GroupSort();
		Scanner sr = new Scanner(System.in);
		System.out.println(
				"Input corresponding parameter number from following below, by which you want your group will be sorted");
		System.out.println("1 - Name; 2 - Surname; 3 - Age");
		try {
		int number = sr.nextInt();
		

		switch (number) {
		case 1:
			groupSort.sortByName();
			break;
		case 2:
			groupSort.sortBySurname();
			break;
		case 3:
			groupSort.sortByAge();
			break;
		default:
			System.out.println("Not valid number!");
			sr.close();
		}
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		}
	

	private class GroupSort {
		private int compareStudentByName(Student a, Student b) {

			if (a != null && b == null) {
				return 1;
			}
			if (a == null && b != null) {
				return -1;
			}
			if (a == null && b == null) {
				return 0;
			}
			return a.getName().compareTo(b.getName());
		}

		private void sortByName() {
			for (int i = 0; i < group.length - 1; i++) {
				for (int j = i + 1; j < group.length; j++) {
					if (compareStudentByName(group[i], group[j]) > 0) {
						Student temp = group[i];
						group[i] = group[j];
						group[j] = temp;
					}
				}
			}
		}

		private int compareStudentBySurname(Student a, Student b) {

			if (a != null && b == null) {
				return 1;
			}
			if (a == null && b != null) {
				return -1;
			}
			if (a == null && b == null) {
				return 0;
			}
			return a.getSurname().compareTo(b.getSurname());
		}

		private void sortBySurname() {
			for (int i = 0; i < group.length - 1; i++) {
				for (int j = i + 1; j < group.length; j++) {
					if (compareStudentBySurname(group[i], group[j]) > 0) {
						Student temp = group[i];
						group[i] = group[j];
						group[j] = temp;
					}
				}
			}
		}

		private void sortByAge() {

			for (int i = 0; i < group.length - 1; i++) {
				for (int j = i + 1; j < group.length; j++) {
					if (group[i] != null && group[j] != null) {
						if (group[i].getAge() > group[j].getAge()) {
							Student temp = group[i];
							group[i] = group[j];
							group[j] = temp;
						}
					}
				}
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		int i = 0;
		for (Student student : this.group) {
			if (student != null) {
				sb.append((++i) + ") ").append(student);
				sb.append(System.lineSeparator());
			}
		}
		return sb.toString();
	}

	@Override
	public Group getTheNotice() {
		Group gotNotice = new Group();
		int place = 0;
		for (Student student : group) {
			if (student != null && student.getSex().equals("Man") && student.getAge() > 18) {
				gotNotice.addStudent(student, place);
				place += 1;
			}
		}
		return gotNotice;
	}

}
