import java.util.Scanner;

class Student {

	int rollno;
	String name;
	int age;

	void display(int rollno, String name, int age) {
		System.out.println("Rollno :" + rollno);
		System.out.println("Name :" + name);
		System.out.println("Age :" + age);

	}
}
 class MainStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub1
		Scanner ss = new Scanner(System.in);
		System.out.println("enter rollno");
		int rollno = ss.nextInt();
		System.out.println("enter name");
		String name = ss.next();
		System.out.println("enter age");
		int age = ss.nextInt();
		Student xyz = new Student();
		xyz.display(rollno, name, age);
	}

}
