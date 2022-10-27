
public class Z18_OOP {

	public static void main(String[] args) {
		
		
		// object = an instance of class that may contain attributes (characteristics) and methods (action that this object can perform) 
		// example: (phone, desk, computer, coffee cup)

		Car myCar1 = new Car();
		Car myCar2 = new Car();
				
		System.out.println(myCar1.make);
		System.out.println(myCar1.model);
		System.out.println();
		myCar1.drive();
		System.out.println();
		System.out.println(myCar2.make);
		System.out.println(myCar2.make);
		System.out.println();
		myCar2.brake();
		
	}

}
