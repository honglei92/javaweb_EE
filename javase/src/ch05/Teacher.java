package ch05;

public class Teacher 
{
	String tno;
	String tname;
	int age;
	public Teacher(){}
	public Teacher(String tno,String tname,int age)
	{
		this.tno=tno;
		this.tname=tname;
		this.age=age;
	}
	public void Teach()
	{
		System.out.println(tname+"要上课");
	} 
    public void Do()
    {
    	System.out.println(tname+"需要改作业");
    }
}
