public class Vehiclee {
	static String make;
	static String model;
	static int year;
	static String color;
	
	Vehiclee(){
		make="";
		model="";
		year=0;
		color="";
	
	}
	
	Vehiclee(String make,String model,int year,String color){
		this.make=make;
		this.model=model;
		this.year=year;
		this.color=color;
	}
	
	
	Vehiclee(String make,String model,int year){
		this.make=make;
		this.model=model;
		this.year=year;
		color="unknown";
	}
	
	
	public static void main(String[] args) {
		

	}

}
