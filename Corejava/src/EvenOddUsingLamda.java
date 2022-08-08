interface EvenOdd
{
	void printEvenOdd(int n);
}
interface Arithmetic
{
	int Operation(int a,int b);
}
public class EvenOddUsingLamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenOdd obj=(n -> {if(n%2 !=0) System.out.println(n+" is Odd ");
		else
			System.out.println(n+" is Even");
		});
		obj.printEvenOdd(5);
		obj.printEvenOdd(2);
		Arithmetic addition=(a,b) ->(a+b);
		System.out.println("Addition="+addition.Operation(10, 5));
        
	}

}
