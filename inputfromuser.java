import java.util.Scanner;
class input{
	public static void main(String s[])
	{
		int x;
		float y;
		String z;
		
	    Scanner a=new Scanner(System.in);
		System.out.println("Enter any integer number:");
		x=a.nextInt();
		System.out.println("The number is:"+x);
		
		System.out.println("Enter any float value:");
		y=a.nextFloat();
		System.out.println("The number is:"+y);
		
		System.out.println("Enter any String:");
		z=a.nextLine();
		System.out.println("The number is:"+z);
	}
}