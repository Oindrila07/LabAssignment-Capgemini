import java.util.*;
public class Sorting {
	static int[] getSorted(int[] arr) {
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			StringBuffer s = new StringBuffer(String.valueOf(arr[i]));
			s.reverse();
			arr[i] = Integer.parseInt(String.valueOf(s));
		}
		Arrays.sort(arr);
		return arr;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int[] arr=new int[num];
for (int i=0;i<num;i++) {
	arr[i]=sc.nextInt();
}
int[] result=getSorted(arr);
System.out.println(Arrays.toString(result));
sc.close();
	}

}
