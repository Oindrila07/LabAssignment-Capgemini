import java.util.*;
public class PositiveString {
	static boolean checkStringType(String str) {
		char[] c=new char[str.length()];
		for( int i=0;i<str.length();i++) {
			c[i]=str.charAt(i);
		}
		for(int i=0;i<c.length-1;i++) {
			if(c[i]>c[i+1])
			{
				return false;
			}
		}
		return true;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
if(checkStringType(str)) {
	System.out.println("It's a positive string.");
}
else {
	System.out.println("It's not a positive string.");
}
sc.close();
	}

}
