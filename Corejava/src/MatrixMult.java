import java.util.Scanner;

public class MatrixMult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[100][100];
		int arr1[][]=new int[100][100];
		int arr2[][]=new int [100][100];
		
		Scanner s=new Scanner(System.in);
System.out.println("enter size of array");
int n=s.nextInt();
System.out.print("enter array elements for"+n+"*"+n+ " matrix1");
for(int i=0;i<n;i++)
{
	for(int j=0;j<n;j++)
	{
		arr[i][j]=s.nextInt();
	}
}
System.out.println("enter array elements for"+n+"*"+n+" matrix2");

for(int i=0;i<n;i++)
{
	for(int j=0;j<n;j++)
	{
		arr1[i][j]=s.nextInt();
	}
}
System.out.println("----After multiplication matrix is----");
for(int i=0;i<n;i++)
{
	for(int j=0;j<n;j++)
	{
		arr2[i][j]=0;
		for(int k=0;k<n;k++)
		{
			arr2[i][j]+=arr[i][k]+arr1[k][j];
		}
		System.out.print(arr2[i][j]+" ");
	}
	System.out.println();
}
	}

}
