import java.util.Scanner;

public class PersonMain {

	public static Person buildPerson(String locationNameSalaryString)
	{		
		String[] splittedArray = locationNameSalaryString.split("NM|SAL");
		double sal = Double.parseDouble(splittedArray[2]);
		
		Person p = new Person(splittedArray[0],splittedArray[1],sal);
		return p;
	}
	
	public static String findGrade(Person person)
	{
		String grade;
		if (person.getSalary()<10000)
		{
			grade = "C grade";
		}
		else if(person.getSalary()>=10000 && person.getSalary()<=25000)
		{
			grade = "B grade";
		}
		else
		{
			grade = "A grade";
		}
		return grade;
	}	

	public static void main(String[] args)
	{			
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: "); //HydNMKiran-KumarSAL25 //ChennaiNMAravindh-VSAL25111
		String str = sc.nextLine();
		sc.close();
		
		System.out.println("Person details : "+buildPerson(str));
		System.out.println("Grade of that person: "+findGrade(buildPerson(str)));		
	}
}
