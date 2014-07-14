package ch05;
public class Test2
{
	public static void main(String[] args)
	{
		Teacher t1=new Teacher();
		System.out.println(t1.tname);
		t1.Teach();
		System.out.println("++++++++++++");
		Teacher t2=new Teacher("345","盛唐人科技",32);
		System.out.println(t2.tname);
		System.out.println(t2.tno);
		System.out.println(t2.age);
		t2.Teach();
		t2.Do();
	}
}