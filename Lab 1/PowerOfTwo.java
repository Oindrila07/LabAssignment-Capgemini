import java.util.*;
public class PowerOfTwo {
	public static boolean checkNumber(int num) {
		if(num<2) {
			return false;
		}
		while(num>1) {
			if(num%2!=0) {
				return false;
			}
			num/=2;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number: ");
int n=sc.nextInt();
if(checkNumber(n)) {
System.out.printf("%d is the power of 2",n);
}
else
{
	System.out.printf("%d is not the power of 2",n);
}
sc.close();
	}

}
