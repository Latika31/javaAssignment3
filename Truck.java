
class Truck extends Vehiclee{
	double payloadCapacity;
	double towingCapacity;

	Truck(){
		super();
		payloadCapacity=0;
		towingCapacity=0;
	}	
	
	public Truck(String make, String model, int year, String color, double payloadCapacity, double towingCapacity) {
		super(make, model, year, color);
		this.payloadCapacity = payloadCapacity;
		this.towingCapacity = towingCapacity;
	}
	
	public Truck(String make, String model, int year, double payloadCapacity, double towingCapacity) {
		super(make, model, year);
		payloadCapacity=0;
		towingCapacity=0;
	}

	public static void main(String[] args) {
		
	}
}

