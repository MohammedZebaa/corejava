import java.util.Scanner;

class StudDetails{
	String name;
	int id;
	int age;
	double marks;
	StudDetails(String name,int id,int age,double marks)
	{
		this.name=name;
		this.id=id;
		this.age=age;
		this.marks=marks;
	}
	void display() {
		System.out.println("Name :"+name);
		System.out.println("Id :"+id);
		System.out.println("Age :"+age);
		System.out.println("Marks :"+marks);

	}
}
public class StudConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter name");
		String name=s.next();
		System.out.println("enter id");
		int id=s.nextInt();
		System.out.println("enter age");
		int age=s.nextInt();
		System.out.println("enter marks");
		double marks=s.nextDouble();
StudDetails std=new StudDetails(name,id,age,marks);
System.out.println("Details of a student :");
std.display();
	}

}
