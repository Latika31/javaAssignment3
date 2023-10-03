public class Vehicle {
	String make;
	String model;
	int year;
	String color;
	
	Vehicle(){
		String make="";
		String model="";
		int year=0;
		String color="";
	}
	
	public Vehicle(String make, String model,int year,String color){
		this.make=make;
		this.model=model;
		this.year=year;
		this.color=color;
	}
}
	
	class Car extends Vehicle{
		int numDoor;
		boolean automatic;
		
	Car(){
		super();
		int numDoor=0;
		boolean automatic=true;
	}
	
	
	Car(String make, String model, int year,String color, int numDoor, boolean automatic){
		super(make,model,year,color);
		this.numDoor=numDoor;
		this.automatic=automatic;
		
	}
	
	Car(String make, String model, int year){
	super();
		
	}
	
	void display() {
		System.out.println("Make: "+make);
		System.out.println("Model: "+model);
		System.out.println("Year: "+year);
		System.out.println("Color: "+color);
		System.out.println("NumDoor: "+numDoor);
		
	}
	public static void main(String[] args) {
		Car c1=new Car("ABCD","XYZ",21,"YELLOW",234,true);
		c1.display();
	}
}
