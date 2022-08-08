import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter number of rows");
		int n = s.nextInt();
		int t = 1;
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= n - i; k++)
				
			{
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(+t+" ");
				t++;
			}
			System.out.println();
		}
	}

}
