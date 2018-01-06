package com.tutorials.java8;

public class DefaultMethodSample {
	
	public static void main(String args[]) {
		DefaultMethodSample sample=new DefaultMethodSample();
		Vehicle vehicle = sample.new Car();
		vehicle.print();
	}

	public interface Vehicle {

		default void print() {
			System.out.println("I am a vehicle!");
		}

		static void blowHorn() {
			System.out.println("Blowing horn!!!");
		}
	}

	/**
	 * 
	 * @author spiderman
	 *
	 */
	public interface FourWheeler {

		default void print() {
			System.out.println("I am a four wheeler!");
		}
	}
	
	/**
	 * 
	 * @author spiderman
	 *
	 */
	public class Car implements Vehicle, FourWheeler {

		public void print() {
			Vehicle.super.print();
			FourWheeler.super.print();
			Vehicle.blowHorn();
			System.out.println("I am a car!");
		}
	}

}
