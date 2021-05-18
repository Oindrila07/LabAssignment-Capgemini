import java.util.*;
public class IncreasingNumber {
	public static boolean checkNumber(int num) {
		int current_digit=num%10;
		num=num/10;
		while(num>0) {
			if(current_digit<=num%10) {
				return false;
			}
			current_digit=num%10;
			num=num/10;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(checkNumber(n)) {
	System.out.println("Increasing number");
}
else {
	System.out.println("Not an increasing number");
}
sc.close();
	}

}
