
public class Emp100 {
 int id;
 String name;
 Address address;   //aggregation
 public Emp100(int id , String name, Address address) {
	 this.id=id;
	 this.name=name;
	 this.address=address;
	 
 }
 void display() {
	 System.out.println(id+"" +name);
	 System.out.println(address.city+"" +address.state+" "+address.country);
	 
 }
 public static void main(String[] args) {
	 Address address1= new Address("bangalore", "karnataka", "india");
			 Address address2= new Address("Mumbai","Maharastra","india"); 
	 Emp100 e1= new Emp100(111, "varun", address1);
	 Emp100 e2= new Emp100(112, "Singh", address2);
	 e1.display();
	 e2.display();
 }
}
