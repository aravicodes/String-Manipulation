import java.util.*;

public class StringTesting
{
	public static String concatAdd(String s1, String s2)
	{
		return s1.replaceAll("\\s","")+s2.replaceAll("\\s","");
	}

	public static String reverse(String s)
	{
		StringBuilder sb = new StringBuilder(s);
		String reversed = sb.reverse().toString();
		return reversed;
	}

	protected static int paddingIndex(String s1, String s2)
	{
		if(s1.contains(s2))
		{
			return s1.indexOf(s2.charAt(0));
		}
		else return 0;
	}

	public static boolean isDigit(String s)
	{
		try
		{
			Integer.parseInt(s);
			return true;
		}
		catch(NumberFormatException ne)
		{
			return false;
		}
	}
	
	//driver code
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence with spaces b/w words");
		String s1 = sc.nextLine();
		System.out.println("Enter a sentence with spaces b/w words");
		String s2 = sc.nextLine();
		System.out.println("gonna check whether it is Digit");
		String s3 = sc.nextLine();
		System.out.println("Enter a string to reverse");
		String s4 = sc.nextLine();
		sc.close();

		System.out.println("Concatenated String : "+concatAdd(s1,s2));
		System.out.println("Reversed String : "+reverse(s4));
		System.out.println("paddingIndex : "+paddingIndex(s1,s2));
		System.out.println("Is it a digit? : "+isDigit(s3));
	}	
	
}
