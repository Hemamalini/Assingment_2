package assingment2;
//Create a Car class
public class Car {
	//create methods for this class	
	public String applyBreak() {
		return "Break Applied";
	}
	public String applyGear() {
		return "Gear Applied";
	}
	public boolean switchOnAc() {
		return true;
	}
	public void applyAcclerate() {
		System.out.println("Acclerate Applied");
	}
	public static void main(String[] args) {
	//create object and execute for same class
		Car carObject = new Car();
		System.out.println(carObject.applyBreak());
		carObject.applyAcclerate();
		System.out.println(carObject.switchOnAc());
		String carObject2 = carObject.applyGear(); // can call by creating new object
		System.out.println(carObject2);
	}
}

