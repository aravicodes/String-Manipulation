public class Person
{
	private String loc;
	private String name;
	private double salary;
	
	public Person(String loc, String name, double salary) 
	{
		super();
		this.loc = loc;
		this.name = name;
		this.salary = salary;
	}
	
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Person [loc=" + loc + ", name=" + name + ", salary=" + salary + "]";
	}	
}
