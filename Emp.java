
public class Emp {
int val;String city;
	Emp()
	{
		System.out.println("Default Constructor");
	}
	Emp(int a)
	{
		System.out.println("Parameterized Constructor"+a);
		val=999;
		city="Mysuru";
	}
	void display(int b,int c)
	{
		System.out.println(b+c);
		System.out.println(city=" "+val);
	}
	public static void main(String[] args) {
		Emp e1=new Emp();
		Emp e2=new Emp(10);
		Emp e3=new Emp();
		Emp e4=new Emp();
		e3.display(100, 200);
	}
	}


