
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e1=new Employee();
Employee e2=new Employee();
e1.input();
e1.calculateSal();

e1.display();

e2.input();
float s1=e2.calculateSal();
e2.display();
System.out.println("The total salary displayed from main:"+s1);


	}

}
