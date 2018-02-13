import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Person {

	private String name;
	private int age;
	private String jobTitle;
	
	static ArrayList<Person> personArray = new ArrayList<Person>();
	
	public static void main(String[] args) {
		
		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person();
		
		person1.setName("Mike");
		person1.setAge(23);
		person1.setJobTitle("Student");
		
		person2.setName("Sally");
		person2.setAge(25);
		person2.setJobTitle("HR Manager");
		
		person3.setName("Eric");
		person3.setAge(32);
		person3.setJobTitle("Professional Footballer");
		
		personArray.add(person1);
		personArray.add(person2);
		personArray.add(person3);
		
		for (Person person : personArray)
		{
			System.out.println(person);
		}
		
		findName("Eric");
			
	}
	
	public void setName(String enteredName)
	{
		name = enteredName;
	}
	
	public void setAge(int enteredAge)
	{
		age = enteredAge;
	}
	
	public void setJobTitle(String enteredJobTitle)
	{
		jobTitle = enteredJobTitle;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getJobTitle()
	{
		return jobTitle;
	}
	
	public String toString()
	{
		
		return name + " " + age + " " + jobTitle;
		
	}
	
	static void findName(String firstName)
	{
		for (Person person: personArray)
		{
			if (person.getName() == firstName)
			{
				System.out.println("\n" + person);
			}
			else 
			{
				System.out.println("Can't find name");
			}

		}
		
	}
	
}
	
