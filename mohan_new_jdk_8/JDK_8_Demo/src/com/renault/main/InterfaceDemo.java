package com.renault.main;

/**
 * @author z017954
 *
 */
public class InterfaceDemo implements SampleDemo {

	public static void main(String[] args) {
		SampleInterface sampleInterface = () -> {
			System.out.println("Sample is Called");
		};
		sampleInterface.sample();
	}

}

interface SampleInterface {
	public void sample();
}

interface SampleDemo {
	default void getValue() {
		System.err.println("getValue is Called");
	}

	public static void getSpeed() {
		System.out.println("GetSpeed is Called");
	}
}