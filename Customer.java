public class Customer 
{
	private String name;
	private int age;
	
	//contrustor
	public Customer(String name, int age)
	{
		this.age = age;
		this.name = name;
	}
	//copy constructer
	public Customer(Customer c)
	{
		this.age  = c.age;
		this.name = c.name;
	}
	
	
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public String toString()
	{
		return "Name: " + name + " Age:" + age;
	}
 
	
	
	
	
	
	
}
