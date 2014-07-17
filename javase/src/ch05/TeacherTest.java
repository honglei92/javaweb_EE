package ch05;
public class TeacherTest
{
	public static void main(String args[])
	{
		Teacher t1=new Teacher();
		t1.tname="刘老师";
		t1.tno="23987958";
		t1.age=43;
		System.out.println(t1.tname);
		System.out.println(t1.tno);
		System.out.println(t1.age);
		t1.Teach();
		t1.Do();
		System.out.println(t1);
		System.out.println("==================");
		Teacher t2=new Teacher();
		System.out.println(t2.tname);
		System.out.println(t2.tno);
		System.out.println(t2.age);
		t2.Teach();
		t2.Do();
		System.out.println(t2);
		}
}
