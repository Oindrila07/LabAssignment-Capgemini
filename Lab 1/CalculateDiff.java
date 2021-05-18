import java.util.*;
public class CalculateDiff {
	public static int calculateDifference(int n) {
		int sum1=0,sum2=0;
		for(int i=1;i<=n;i++) {
			sum1=sum1+(i*i);
		}
		for(int i=1;i<=n;i++) {
			sum2+=i;
		}
		sum2=sum2*sum2;
		return (sum1-sum2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number: ");
int num=sc.nextInt();
System.out.println("The difference is:"+calculateDifference(num));
sc.close();
	}

}
