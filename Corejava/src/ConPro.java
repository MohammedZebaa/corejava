
 class MyClass{ 
	 int x; 
	MyClass(int x)
	{
		this.x=x;
	}
}

public class ConPro
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass t1=new MyClass(10);
		MyClass t2=new MyClass(20);
System.out.println(t1.x+" "+t2.x);
	}

}

