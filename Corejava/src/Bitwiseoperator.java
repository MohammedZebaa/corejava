import java.util.Scanner;

public class Bitwiseoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int no1, no2,no3; 
no1=5;no2=7;no3=35;
int and=no1&no2;
int or=no1|no2;
int xor=no1^no2;
int complement=~no3;
System.out.println("AND:"+and+",OR:"+or+",XOR:"+xor+",COMPLEMENT"+complement);
	}
}

