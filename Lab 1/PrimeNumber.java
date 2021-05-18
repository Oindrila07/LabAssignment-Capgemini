import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter an integer: ");
int n=sc.nextInt(),flag;
System.out.println("The prime numbers are: ");
for(int i=2;i<=n;i++) {
	flag=1;
	for(int j=2;j<=i/2;j++) {
		if(i%j==0) {
			flag=0;
			break;
		}
	}
	if(flag==1) {
		System.out.println(i+" ");
	}
}
sc.close();
	}

}
