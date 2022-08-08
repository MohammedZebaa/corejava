/*class StaticOperation{
	int rollno;
	String name;
	static String college="Scient";
	StaticOperation(int r, String n){
		rollno=r;
		name=n;
	}
void display() {System.out.println(rollno+" "+name+" "+college);}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticOperation s1=new StaticOperation(111,"zeba");
		StaticOperation s2=new StaticOperation(222,"zoya");
s1.display();
s2.display();
	}

}*/
class StaticOperation{
	static int cube(int x) {
		return x*x*x;
	}
	public static void main(String args[]) {
		int result=StaticOperation.cube(5);
		System.out.println(result);
	}
}
	