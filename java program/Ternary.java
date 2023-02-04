import java.util.Scanner;
public class Ternary{
	public static void main(String[] args){
		int a;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number to find odd or even:");
		a = in.nextInt();
		String b;
		b = (a%2!=0)?"odd":"even";
		System.out.println("The number you have entered is:"+b);
	}
}