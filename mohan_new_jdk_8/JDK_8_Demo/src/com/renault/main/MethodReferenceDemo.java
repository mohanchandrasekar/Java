/**
 * 
 */
package com.renault.main;

import java.util.ArrayList;
import java.util.List;

/**
 * @author z017954
 *
 */
public class MethodReferenceDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Mohan");
		list.add("Ben");
		list.add("Chandrasekar");
		list.add("Kannan");
		list.forEach(System.out::println);
	}

}
