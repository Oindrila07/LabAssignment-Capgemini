import java.util.*;
public class ModifyNumber {
	static int modifyNumber(int number1) {
		String s = Integer.toString(number1);
		String ans = "";
		for (int i = 0; i < s.length()-1; i++) 
			ans += Integer.toString(Math.abs(Character.getNumericValue(s.charAt(i)) - Character.getNumericValue(s.charAt(i+1))));
		ans += s.substring(s.length()-1);
		return Integer.parseInt(ans);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
System.out.println(modifyNumber(num));
sc.close();
	}

}
