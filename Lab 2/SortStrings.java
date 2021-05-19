import java.util.*;
public class SortStrings {
	public static String[] sortStrings(String[] arr) {
		Arrays.sort(arr);
		int len = arr.length;
		String[] newArr = new String[len];
		for (int i = 0; i < (int)Math.ceil(len/2)+1; i++)
			newArr[i] = arr[i].toUpperCase();
		for (int i = (int)Math.ceil(len/2)+1; i < len; i++)
			newArr[i] = arr[i].toLowerCase();
		return newArr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n=sc.nextInt();
		String[] arr=new String[n];
		System.out.println("Enter the values in array:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextLine();
		}
		System.out.println("the resultant array is: ");
		String[] result=sortStrings(arr);
		for(String val:result) {
			System.out.println(val);
		}
sc.close();
	}

}
