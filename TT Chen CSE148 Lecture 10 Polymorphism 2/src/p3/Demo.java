package p3;

public class Demo {

	public static void main(String[] args) {
		
		Student s1 = new Student("Adam", 3.5);
		Faculty f1 = new Faculty("Zack", 100);
		Student s2 = new Student("Bill", 3.6);
		Faculty f2 = new Faculty("Chen", 100);
		
//		Person p1 = new Person("Suzy");
		
		// instanceof operator
//		System.out.println(s1 instanceof Person);
		
		PersonBag theBag = new PersonBag(10);
		theBag.insert(f2);
		theBag.insert(s1);
		theBag.insert(f1);
		theBag.insert(s2);
		theBag.display();
		System.out.println("Highest GPA Student: ");
		System.out.println(theBag.findStudentWithHighestGPA());
	}

}
