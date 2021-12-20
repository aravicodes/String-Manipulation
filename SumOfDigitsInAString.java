import java.util.*;

public class SumOfDigitsInAString
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a single/double digit number");
		String str = sc.next();
		sc.close();

		if(str.matches("[0-9]")) System.out.println(str);

		else if(str.matches("[0-9][0-9]"))
		{
			char arr[] = str.toCharArray();

			System.out.println(Character.getNumericValue(arr[0])+Character.getNumericValue(arr[1]));
		}

		else System.out.println("Wrong digit");
	}
}
