interface Exam {
	void percent_cal();
	
}
class Student
{
	String name;
	int roll_no, mark1,mark2;
	Student ( String n,int r, int m1, int m2)
	{
		name=n;
		roll_no=r;
		mark1=m1;
		mark2=m2;
	}
	void display() {
		System.out.println("Name of the Students:"+name);
		System.out.println("Roll no of Student:"+roll_no);
		System.out.println("Marks of the subject 1:"+mark1);
		System.out.println("Marks of the Subject 2:"+mark2);
	}


}
class Result extends Student implements Exam
{
	Result(String n,int r,int m1, int m2)
	{
		super(n,r,m1,m2);
	}
	public void percent_cal() 
	{
		int total=(mark1+mark2);
		float percent=total*100/200;
		System.out.println("Percentage : "+percent+"%");
	}
	void display () {
		super.display();
		
	}
}



public class MultipleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Result R = new Result("John",12,93,84);
		 R.display();
		 R.percent_cal();
		 
	}

}
