// Fichier Start.java
package com.myschool.game.car;

public class Start {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Car Game lanc�!");
		Car car1 = new Car();
		car1.initialize("Maxime", "rouge", 10);
		Car car2 = new Car();
		car2.initialize("Ma�lis", "bleu", 11);
		car2.d�marrer();
		car2.vroomvroom();
	}

}
