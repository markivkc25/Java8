package com.tutorials.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateStringExample {
	
	public static void main(String args[]) {
	      List<String> nameList = Arrays.asList("Arun","Ganesh", "VIKRAM", "Anish", "Brijesh");
	      
	      evalStringl(nameList,n->n.startsWith("G"));

		
	}
	
	/**
	 * 
	 * @param list
	 * @param predicate
	 */
	 public static void evalStringl(List<String> list, Predicate<String> predicate) {
	      for(String n: list) {
	         if(predicate.test(n)) {
	            System.out.println(n + " ");
	         }
	      }
	   }

}
