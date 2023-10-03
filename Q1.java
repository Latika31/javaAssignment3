
public class Q1 {
	static String make;
	static String model;
	static int year;
	static String color;
	
	Q1(){
		make="";
		model="";
		year=0;
		color="";
	
	}
	
	Q1(String make, String model,int year,String color){
		this.make=make;
		this.model=model;
		this.year=year;
		this.color=color;
	}
	void display() {
		System.out.println("Make: "+make);
		System.out.println("Model: "+model);
		System.out.println("Year: "+year);
		System.out.println("Color: "+color);
	}
	
	Q1(String make, String model,int year){
		this.make=make;
		this.model=model;
		this.year=year;
		color="unknown";
	}
	public static void main(String[] args) {
		System.out.println("Make "+make+" Model "+model+" Year "+year+" Color "+color);
		Q1 obj=new Q1("ABCD","XYZ",21,"YELLOW");
		obj.display();
		Q1 obj2=new Q1("AUDI","BMW",790);
		obj.display();
	}

}
