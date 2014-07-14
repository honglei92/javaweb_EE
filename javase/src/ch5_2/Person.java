package ch5_2;

public class Person 
{
	private Person()
	{
		System.out.println("无参构造器");
	}
	private static Person person=new Person();
	public static Person getInstance()
	{
		return person;
	}
	private String name;
	private int age;
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		if(age<0||age>100)
		{
			age=0;
		}
		this.age=age;
	}
	public void Do(Person p)
	{
		name="张三";
		age=23;
		System.out.println("姓名是："+name+",年龄是"+age);
	}
}
