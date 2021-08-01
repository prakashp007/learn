import java.util.Scanner;
public class hello
{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String name;
		System.out.println("Enter your name");
		name = s.nextLine();
		System.out.println("your name is " + name);
}
