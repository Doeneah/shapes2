package edu.cvtc.java;

import java.awt.Component;
import javax.swing.JOptionPane;

public class Cuboid extends Shape {
	
	// attributes
	private float width = 0;
	private float height = 0;
	private float depth = 0;
	
	// constructor
	public Cuboid(float width, float height, float depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

// getters and setters
	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}


	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}


	public float getDepth() {
		return depth;
	}

	public void setDepth(float depth) {
		this.depth = depth;
	}
	
// sA calculation
	public float surfaceArea() {
		float surfaceArea = 2 * (depth * width + width * height + height * depth);
		
		return surfaceArea;
	}
	
// volume calculation
	public float volume() {
		float volume = (depth * width * height);
		
		return volume;
		
	}

	@Override
	public void render() {
		
		Component frame = null;
		
		//Cuboid dialog
		JOptionPane.showMessageDialog(frame,
			    "The surface area of the cuboid is " + this.surfaceArea() + "\nThe volume of the cuboid is " + this.volume(),
			    "- Cuboid -",
			    JOptionPane.PLAIN_MESSAGE);
		
	}



}
