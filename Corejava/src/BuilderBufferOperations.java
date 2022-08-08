
public class BuilderBufferOperations{

	public static void main(String[] args){
		// TODO Auto-generated method stub	
		StringBuilder sb=new StringBuilder("Zeba");
        System.out.println("Capacity :"+sb.capacity());
System.out.println("Insert :"+sb.insert(0, "Z"));
System.out.println("Delete :"+sb.delete(1,3));
	System.out.println("Append :"+sb.append("World"));
	System.out.println("Replace :"+sb.replace(5,7,"mohammed"));
	System.out.println("Length :"+sb.length());
	System.out.println("Reverse :"+sb.reverse());
	System.out.println("charAt:"+sb.charAt(5));
	}

}
