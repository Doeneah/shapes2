package edu.cvtc.java;

import java.awt.Component;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ShapesTest {

	public static void main(String[] args) {
		
		// Variables
		float cuboidHeight;
		float cuboidWidth;
		float cuboidDepth;
		
		float cylinderRadius;
		float cylinderHeight;
		
		float sphereRadius;
		
		Cuboid cuboidTest = new Cuboid(0, 0, 0);
		Cylinder cylinderTest = new Cylinder(0, 0);
		Sphere sphereTest = new Sphere(0);
		
	
		// scanner 
		Scanner keyboard = new Scanner(System.in);
		
		Component frame = null;

		// input
		System.out.println("- Cuboid -\n\nEnter the height of the Cuboid:");
		cuboidHeight = keyboard.nextFloat();

		System.out.println("Enter the width of the Cuboid:");
		cuboidWidth = keyboard.nextFloat();
		
		System.out.println("Enter the depth of the Cuboid:");
		cuboidDepth = keyboard.nextFloat();
		
		
		System.out.println("- Cylinder -\n\nEnter the radius of the Cylinder:");
		cylinderRadius = keyboard.nextFloat();

		System.out.println("Enter the height of the Cylinder:");
		cylinderHeight = keyboard.nextFloat();
		
	
		System.out.println("- Sphere -\n\nEnter the radius of the Sphere:");
		sphereRadius = keyboard.nextFloat();

		keyboard.close();
		
		// cuboid validation
		if (cuboidHeight <= 0 || cuboidWidth <= 0 || cuboidDepth <= 0) {
			JOptionPane.showMessageDialog(null,
				    "Please only enter positive numbers");
		} else {
			cuboidTest.setHeight(cuboidHeight);
			cuboidTest.setWidth(cuboidWidth);
			cuboidTest.setDepth(cuboidDepth);
			
			cuboidTest.render();
		}
		
		
		
		// cylinder validation
		if (cylinderRadius < 0 || cylinderHeight < 0) {
			JOptionPane.showMessageDialog(null,
				    "Please only enter positive numbers");
		} else {
			cylinderTest.setRadius(cylinderRadius);
			cylinderTest.setHeight(cylinderHeight);
			
			cylinderTest.render();
		}
		
		
		// sphere validation
		if (sphereRadius < 0) {
					JOptionPane.showMessageDialog(null,
						    "Please only enter positive numbers");
		} else {
			sphereTest.setRadius(sphereRadius);
			
			sphereTest.render();
		}
	
		
	}
}
