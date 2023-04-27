class Student
{
	
	private int age;
	private String name;
	public int getAge()//getter methode
	{
		return age;
	}
	public void SetAge(int age)//setter methode
	{
		this.age=age;
	}	
	public String getName()//getter methode
	{
		return name;
	}
	public void setName(String name)//setter methode
	{
		this.name=name;
	}
}

public class GetterandSetter{
	public static void main(String[] args) throws 
	{
		Student s=new Student();
		s.SetAge(22);
		s.setName("Ahsan Ansari");
		System.out.println(s.getName()+" : "+s.getAge());
	
	}
}