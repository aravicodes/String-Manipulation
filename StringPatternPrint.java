import java.util.Scanner;

public class StringPatternPrint
{	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence that has a word that starts like c_m... or c_p..."); //That company sells copper.
		String str = sc.nextLine();

		String arr[] = str.split(" ");

		sc.close();

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].matches("[c][a-z][m|p][a-z]*[A-Z]*"))
			{
				System.out.println(arr[i].toLowerCase());
			}
		}
    
	}
}
