package com.tutorials.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambadaExpSample {

	public static void main(String args[]) {

		List<String> names1 = new ArrayList<String>();
		names1.add("Mahesh ");
		names1.add("Suresh ");
		names1.add("Ramesh ");
		names1.add("Naresh ");
		names1.add("Kalpesh ");
		
		LambadaExpSample sample=new LambadaExpSample();
		sample.sortUsingJava8(names1);
		
		 System.out.println(names1);

	}

	// sort using java 8
	private void sortUsingJava8(List<String> names) {
		Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
	}
}
