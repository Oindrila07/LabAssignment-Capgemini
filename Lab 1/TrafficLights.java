import java.util.*;
public class TrafficLights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter your choice:-");
System.out.println("1.Red");
System.out.println("2.Yellow");
System.out.println("3.Green");
int n=sc.nextInt();
switch(n) {
case 1:System.out.println("Stop");
       break;
case 2:System.out.println("Ready");
break;
case 3:System.out.println("Go");
break;
default: System.out.println("Invalid option");
}
sc.close();
	}

}
