package assingment2;
//Create a class for TwoWheeler and declare below global variables with appropriate values
public class TwoWheeler {
	int noOfWheels = 2; 
	short noOfMirrors = 3;
	long chassisNumber = 123456723412L;
	boolean isPunctured = false;
	String bikeName = "Yamaha" ;
	double runningKM = 1234.456;
	public static void main(String[] args) {
//create object for TwoWheeler and call all the variables inside main method and print the values.
		TwoWheeler TwoWheelerObj = new TwoWheeler();
		System.out.println(TwoWheelerObj.noOfWheels);
		System.out.println(TwoWheelerObj.noOfMirrors);
		System.out.println(TwoWheelerObj.chassisNumber);
		System.out.println(TwoWheelerObj.isPunctured);
		System.out.println(TwoWheelerObj.bikeName);
		System.out.println(TwoWheelerObj.runningKM);
	}
}
