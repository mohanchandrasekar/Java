package com.renault.main;

/**
 * @author z017954 Mohan Chandrasekar
 *
 */
public class LamdaExpressionDemo {
	public static void main(String[] args) {
		MathOperation mathOperation = (int a, int b) -> a + b;

		MathOperation operation = (a, b) -> a - b;

		ShowMessage message = output -> System.err.println("" + operation);
		message.showMessage(""+mathOperation);
	}

}

interface MathOperation {
	int add(int a, int b);
}

interface ShowMessage {
	void showMessage(String output);
}