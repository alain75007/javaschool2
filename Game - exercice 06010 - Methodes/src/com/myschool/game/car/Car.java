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
}
