class Student
{
	
	private int age;
	private String name;
	public int getAge()
	{
		return age;
	}
	public void SetAge(int age)
	{
		this.age=age;
	}	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
}

public class GetterandSetter{
	public static void main(String[] args) throws ClassNotFoundException
	{
		Student s=new Student();
		s.SetAge(22);
		s.setName("Ahsan Ansari");
		System.out.println(s.getName()+" : "+s.getAge());
	
	}
}