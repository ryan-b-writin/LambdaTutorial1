package tutorial;

public class LambdaDemo {

	public static void main(String[] args) {
		MyValue myVal;
		
		myVal = () -> 98.6 ;
		
		System.out.println("A constant value: " + myVal.getValue());
		
		MyParamValue myPval = (n) -> 1.0 / n; 

		System.out.println("Recriprocal of 4 is: "+ myPval.getValue(4.0));
		System.out.println("Recriprocal of 8 is: "+ myPval.getValue(8.0));
	}

}
