import java.util.regex.Pattern;

public class Icompass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*String str1=new String("hello");
String str2="hello";
if(str1==str2)
{
	System.out.println("Equals");
}
	else
	{
		System.out.println("Not Equals");
	}
}
	}*/
String input="Hello Welcome";
String pattern="HelloWelcome\\s";
boolean flag=Pattern.matches(pattern, input);
System.out.println(flag);
	}
}
