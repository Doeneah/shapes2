package edu.cvtc.java;

import java.awt.Component;

import javax.swing.JOptionPane;

public class Cylinder extends Shape{
	
// attributes
	private float radius = 0;
	private float height = 0;
	
	//constructor
	public Cylinder(float radius, float height) {
		this.radius = radius;
		this.height = height;
	}

	// getters and setters
	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	
	//calculations
	public float surfaceArea() {
		float surfaceArea = (float) (2 * Math.PI * radius * height + (2 * Math.PI) * (radius * radius));
		
		return surfaceArea;
	}

	public float volume() {
		float volume = (float) (Math.PI * (radius * radius) * height);
		
		return volume;
	}

	
	@Override
	public void render() {
		
		Component frame = null;
		
		//Cylinder dialog
		JOptionPane.showMessageDialog(frame,
			    "The surface area of the cylinder is " + this.surfaceArea() + "\nThe volume of the cylinder is " + this.volume(),
			    "- Cylinder -",
			    JOptionPane.PLAIN_MESSAGE);
		
	}
	
	
}
