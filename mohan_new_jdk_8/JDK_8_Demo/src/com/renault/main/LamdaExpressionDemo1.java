package com.renault.main;

/**
 * @author z017954
 *
 */
public class LamdaExpressionDemo1 {

	public static void main(String[] args) {

		CarInterface carInterface = (speed) -> {
			System.err.println("Your Car Speed is = " + speed);
		};

		carInterface.getSpeed(100);

		CANInterface canInterface = () -> {
			System.out.println("CAN Data is Inilized");
		};
		canInterface.getMessage();

		// With return type
		StringType stringType = (message) -> {
			return "Say Hello New World" + message;
		};

		System.out.println(stringType.showMessage("I am Mohan"));

		IntegerType integerType = message -> {
			return "What is you Name" + message;
		};
		System.err.println(integerType.showMessage("Mohan"));
	}

}

// With argument method
interface CarInterface {
	void getSpeed(int speed);
}

// Without arguments
interface CANInterface {
	public void getMessage();
}

// With Return Type arguments
interface StringType {
	public String showMessage(String messgae);
}

// With Return Type but NO arguments
interface IntegerType {
	public String showMessage(String messgae);
}