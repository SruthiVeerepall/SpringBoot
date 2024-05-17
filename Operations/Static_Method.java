package Operations;

public class Static_Method {
	public int count=0;
	
	public void Increment()
	{
		count++;
		System.out.println("Count No:"+count);
	}
	public static void main(String args[])
	{
		Static_Method sm=new Static_Method();
		sm.Increment();
		Static_Method sm1=new Static_Method();
		sm1.Increment();
		Static_Method sm2=new Static_Method();
		sm2.Increment();
	}

}
