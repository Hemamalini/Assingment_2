package assingment2;
//create new class as MyCar class and create object for existing class and excute
public class MyCar {
	public static void main(String[] args) {
		Car childObject = new Car();
		System.out.println(childObject.applyBreak());
		System.out.println(childObject.applyGear());
		System.out.println(childObject.switchOnAc());
		childObject.applyAcclerate();
	}
}
