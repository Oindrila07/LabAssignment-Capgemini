import java.util.*;
public class MirrorImage {
	static String getImage(String str) {
	StringBuffer str2=new StringBuffer(str);
	str2.reverse();
	str=str+"|"+str2;
	return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    System.out.println(getImage(str));
    sc.close();
	}

}
