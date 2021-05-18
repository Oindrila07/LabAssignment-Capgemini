import java.util.*;
public class Fibonacci {
	public static int fib(int num) {
		if(num==0||num==1)
			return num;
		else
			return fib(num-1)+fib(num-2);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a=0,b=1;
System.out.println("Enter the number of values in the series: ");
int n=sc.nextInt();
System.out.println("The fibonacci series,in non-recursive approach, goes like: ");
System.out.println(a);
System.out.println(b);
for(int i=3;i<=n;i++) {
	int c=a+b;
	System.out.println(c);
	a=b;
	b=c;
}
System.out.println("The fibonacci series,in recursive approach, goes like: ");
for(int i=0;i<n;i++) {
System.out.println(fib(i));
}
sc.close();
	}

}
