import java.util.Scanner;
public class Arithmetic{
	public static void main(String[] args){
		
		int a,b;
		float c;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the first number:");
		a = in.nextInt();
		System.out.println("enter the second number:");
		b = in.nextInt();
		c=a+b;
		System.out.println("addition of two numbers is:"+c);
	}
	
}