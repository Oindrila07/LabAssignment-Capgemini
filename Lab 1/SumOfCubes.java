import java.util.*;
public class SumOfCubes {
	public static int CubeOfDigits(int num) {
		int sum=0;
		while(num>0) {
			int temp=num%10;
			sum+=temp*temp*temp;
			num=num/10;
		}
		return sum;
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num=sc.nextInt();
		
		System.out.println(CubeOfDigits(num));
		sc.close();
	}

}
