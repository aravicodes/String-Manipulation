import java.util.Scanner;

public class BucketMain
{	
	public static int transfer(String str, Bucket bkt)
	{
		bkt.setData(str);
		return Integer.parseInt(bkt.getData());
	}

	public static int countChars(String str, char c, Bucket bkt)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==c) count++;
		}
		bkt.setCounter(count);
		return count;
	}	

	public static String reverse(String str)
	{
		StringBuilder sb = new StringBuilder(str);
		return (sb.reverse()).toString();
	}
	
	public static void main(String args[])
	{		
		System.out.println("Enter a string: ");
		Scanner sc = new Scanner(System.in);		
		String str1 = sc.nextLine();
		System.out.println("Enter string of only numbers: "); //for transfer method
		String str2 = sc.nextLine();
		sc.close();
		
		Bucket b = new Bucket("1234",5,6);
		
		System.out.println("Transfer: "+transfer(str2,b)); 	//str2 needs to be a number
		System.out.println("Number of characters: "+countChars(str1,'a',b)); //counts 'a'
		System.out.println("Reversed String: "+reverse(str1)); 
	}
}

