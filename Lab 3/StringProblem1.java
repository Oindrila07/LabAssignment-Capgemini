import java.util.*;
public class StringProblem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int sum=0;
String str=sc.nextLine();
StringTokenizer str2=new StringTokenizer(str," ");
while(str2.hasMoreTokens()) {
	int x=0;
	x=Integer.parseInt(str2.nextToken());
	System.out.println(x);
	sum+=x;
}
System.out.println(sum);
sc.close();
	}

}
