package Bp1;

class Test 
{
	int x=10;
	static int y=20;
	public static void main(String[] args) 
	{
		Test t1=new Test();
		t1.x=1000;
		t1.y=200000;
		Test t2=new Test();
		t2.x=50;
		t2.y=2;
		System.out.println(t1.x);//100
		System.out.println(t2.y);//200
	}
}
