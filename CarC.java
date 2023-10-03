
class CarC extends Vehiclee{
	int numDoor;
	boolean automatic;
	
	CarC(){
		super();
		numDoor=0;
		automatic=false;
	}
	
	
	
	public CarC(String make, String model, int year, String color, int numDoor, boolean automatic) {
		super(make, model, year, color);
		this.numDoor = numDoor;
		this.automatic = automatic;
	}
	
	


	public CarC(String make, String model, int year) {
		super(make, model, year);
		numDoor=0;
		automatic=false;
	}



	public static void main(String[] args) {
		CarC c1=new CarC();
		CarC c2=new CarC("A","BMW",2000);
		CarC c3=new CarC("xyz","Audi",1990,"yellow",2,true);
	}
}
