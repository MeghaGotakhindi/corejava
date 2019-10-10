
public class shapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Shape shape = new Circle(10);
shape.draw();
System.out.println("Area="+shape.getArea());
shape = new Rectangle(10,10);
shape.draw();
System.out.println("Area="+shape.getArea());
		
	}

}
