
public class Implicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	byte i=50;
	//no casting needed
short j=i;
int k=j;
long l=k;
float m=k;
double n=m;
System.out.println("byte value :"+i);
System.out.println("short value :"+j);
System.out.println("int value :"+k);
System.out.println("long value :"+l);
System.out.println("float value :"+m);
System.out.println("double value :"+n);

	}

}
