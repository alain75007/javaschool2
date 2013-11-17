// Fichier Car.java
package com.myschool.game.car;

public class Car {
	String couleur;
	int puissance;
	boolean d�marr�e = false;
	String propri�taire;

	public void initialize(String propri�taire, String couleur, int puissance) {
		this.couleur = couleur;
		this.propri�taire = propri�taire;
		this.puissance = puissance;
	}

	public void d�marrer() {
		d�marr�e = true;
		System.out.println("La voiture de " + propri�taire + " d�marre...");
	}
	public void vroomvroom() {
		if (d�marr�e) {
			System.out.println("La voiture de " + propri�taire + " fait Vroom! Vroom!");
		}
	}
}
