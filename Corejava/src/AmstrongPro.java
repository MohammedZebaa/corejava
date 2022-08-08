import java.util.Scanner;

public class AmstrongPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter number to check amstrong");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int num=n;
		int r,sum=0;
		while(n!=0)
		{
			r=n%10;
			System.out.println("r---->"+r);
			sum=sum+r*r*r;
			n=n/10;
			System.out.println("n---->"+n);
		}
		if(num==sum)
		{
			System.out.println("given number is amstrong");
		}
		else
		{
			System.out.println("given number is not amstrong");
		}
	}

}
