public class MainGroup {

	public static void main(String[] args) {

		Group group = new Group("Internal combustion engines");

		Student student1 = new Student("Sergey", "Romanok", "Man", 17, 67, 185, "NTU", "AutoMech");
		Student student2 = new Student("Vasya", "Ivanov", "Man", 16, 67, 185, "NTU", "AutoMech");
		Student student3 = new Student("Petr", "Pupkin", "Man", 15, 67, 185, "NTU", "AutoMech");
		Student student4 = new Student("Ivan", "Knyazev", "Man", 17, 67, 185, "NTU", "AutoMech");
		Student student5 = new Student("Vitalii", "Gruzdev", "Man", 20, 67, 185, "NTU", "AutoMech");
		Student student6 = new Student("Evgeniy", "Kilogram", "Man", 30, 67, 185, "NTU", "AutoMech");
		Student student7 = new Student("Aleksandr", "Kicha", "Man", 27, 65, 185, "NTU", "AutoMech");
		Student student8 = new Student("Grigoriy", "Nazarenko", "Man", 16, 67, 185, "NTU", "AutoMech");
		Student student9 = new Student("Oleg", "Fetisov", "Man", 24, 67, 185, "NTU", "AutoMech");
		Student student10 = new Student("Dmitriy", "Arshinnik", "Man", 17, 67, 185, "NTU", "AutoMech");

		group.addStudent(student1, 0);
		group.addStudent(student2, 1);
		group.addStudent(student3, 2);
		group.addStudent(student4, 3);
		group.addStudent(student5, 4);
		group.addStudent(student6, 5);
		group.addStudent(student7, 6);
		group.addStudent(student8, 7);
		group.addStudent(student9, 8);
		// group.addStudent(student10, 9);

		//group.interactiveStudentInput(9);

		System.out.println(group.toString());
		
		group.sortBy();

		System.out.println(group.toString());

		MilitaryComissar mc = new MilitaryComissar();

		mc.getTheNotice(group);

		

	}
}
