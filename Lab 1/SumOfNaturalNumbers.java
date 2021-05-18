import java.util.*;
public class SumOfNaturalNumbers {
	public static int calculateSum(int num) {
		int sum=0;
		for(int i=3;i<=num;i++) {
			if(i%3==0 || i%5==0) {
				sum+=i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number:");
int n=sc.nextInt();

System.out.println(calculateSum(n));
sc.close();
	}

}
