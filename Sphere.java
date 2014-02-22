import java.math.*; 
 
public class Sphere { 
 
	private double diameter; 
	private double radius, volume, surfaceArea; 
	public Sphere (double diameterValue){ 
		diameter = diameterValue; 
	} 
	 
	public double getDiameter(){ 
		return diameter; 
	} 
	 
	public void setDiameter(double newDiameter){ 
		diameter = newDiameter; 
	} 
	 
	public double getVolume(){ 
		radius = diameter/2; 
		volume = (4 * Math.PI * Math.pow(radius, 3))/3; 
		return volume; 
	} 
	 
	public double getSurfaceArea(){ 
		surfaceArea = 4 * Math.PI * Math.pow(radius, 2); 
		return surfaceArea; 
	} 
	 
	public String toString(){ 
		return "Sphere" + "\t" + "Diameter: " + diameter + "\t" + "Radius: " + radius + "\t" + "Volume: "   
		+ volume + "\t" + "Surface Area: " + surfaceArea; 
	} 
} 
 
