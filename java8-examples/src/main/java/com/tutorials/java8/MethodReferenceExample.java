package com.tutorials.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MethodReferenceExample {

	class Shipment {
		public double calculateWeight() {
			double weight = 0;
			// Calculate weight
			return weight;
		}
	}

	public List<Double> calculateOnShipments(List<Shipment> shippmentList, Function<Shipment, Double> functionalInferface) {
		List<Double> results = new ArrayList<>();
		for (Shipment s : shippmentList) {
			results.add(functionalInferface.apply(s));
		}
		return results;
	}

	public static void main(String args[]) {
		MethodReferenceExample example=new MethodReferenceExample();
		
		List<Shipment> l = new ArrayList<Shipment>();
		
		// Using an anonymous class
		List<Double> returnList=example.calculateOnShipments(l, new Function<Shipment, Double>() {
		  public Double apply(Shipment s) { // The object
		    return s.calculateWeight(); // The method
		  }
		});
		
		System.out.println("returnList-"+returnList.size());



	}
}
