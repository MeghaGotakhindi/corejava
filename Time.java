
public class Time {
	double hours;
	 double minutes;
	 double seconds;
	
	 public Time(double h,double m,double s)
	 {
		 hours= h;
		 minutes = m;
		 seconds = s;
	 }
	 void add(Time obj2) {
		 
		
		 
		 if((this.seconds+obj2.seconds)>60) {
			 this.minutes++;
			 this.seconds =(this.seconds+obj2.seconds)-60;
			
		 }
			 else {
				 this.seconds+=obj2.seconds;
			 }
		 
		 
		  if ((this.minutes+obj2.seconds)>60) {
			  this.hours++;
			 this.minutes =(this.minutes+obj2.minutes)-60;
			 
		 }
		 else {
			 this.minutes +=obj2.minutes;
		 }
		 
		 this.hours += obj2.hours;
		 
		
	 }
	 void display() {
		System.out.println(this.hours + ":" + this.minutes + ":" + this.seconds);
	 }
		
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Time obj1= new Time(10,30,59) ;
	      Time obj2= new Time(12,30,40) ;
	      obj1.add(obj2);
	      System.out.println("the addition of Time is");
	      obj1.display();
	}

}
