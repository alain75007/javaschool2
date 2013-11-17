// Fichier Car.java
package com.myschool.game.car;

public class Car {
	String couleur;
	int puissance;
	boolean démarrée = false;
	String propriétaire;
	
	public void initialize(String propriétaire, String couleur, int puissance) {
		this.couleur = couleur;
		this.propriétaire = propriétaire;
		this.puissance = puissance;
	}
}
