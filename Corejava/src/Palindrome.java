
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myString="mom";
		StringBuilder buf= new StringBuilder(myString);
		buf.reverse();
		String data = buf.toString();
		System.out.println("Reverse the string :"+data);
if(myString.equals(data)){
	System.out.println("Palindrome");
}
else {
	System.out.println("not Palindrome");
}
	}

}
