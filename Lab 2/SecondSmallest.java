import java.util.Arrays;
import java.util.Scanner;
public class SecondSmallest {
	public static int getSecondSmallest(int[] arr) {
		Arrays.sort(arr);
		return arr[1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of elements in the array: ");
int n=sc.nextInt();
System.out.print("\n");
int[] arr=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=sc.nextInt();
}
System.out.print("The second smallest integer of the array is: "+getSecondSmallest(arr));
sc.close();
	}

}
