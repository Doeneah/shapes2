package edu.cvtc.java;

import java.awt.Component;

import javax.swing.JOptionPane;

public class Sphere extends Shape {

	// attributes
	private float radius = 0;

	//constructor
	public Sphere(float radius) {
		this.radius = radius;
	}

	// getters and setters 
	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	
	// calculations
	public float surfaceArea() {
		float surfaceArea = (float) (4 * 3.14 * (radius * radius));
		
		return surfaceArea;
	}
	
	public float volume() {
		float volume = (float) (4 / 3 * Math.PI * (radius * radius * radius));
		
		return volume;
	}

	// to string
	@Override
	public void render() {
		
	Component frame = null;
		
	//Sphere dialog
	JOptionPane.showMessageDialog(frame,
			    "The surface area of the sphere is " + this.surfaceArea() + "\nThe volume of the sphere is " + this.volume(),
			    "- Sphere -",
			    JOptionPane.PLAIN_MESSAGE);
	}

	
	
}
