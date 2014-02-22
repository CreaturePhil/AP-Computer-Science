import java.math.*; 
 
public class Polynomial { 
	private double aa, bb, cc; 
	private double discriminant, discriminantwr, posd, negd; 
	public Polynomial (double a, double b, double c){ 
		aa=a; 
		bb=b; 
		cc=c; 
		discriminantwr = Math.pow(bb, 2) - 4 * aa * cc; // wr means without root 
		discriminant = (Math.sqrt(discriminantwr)); 
		posd = ((-1 * bb+(discriminant))/(2*aa)); 
		negd = ((-1 * bb-(discriminant))/(2*aa)); 
	 
	} 
	 
	 
	public boolean isDiscriminantNegative(){ 
		return (discriminantwr <= 0); 
	} 
	 
	public double getPositiveSolution(){ 
		return posd; 
	} 
	 
	public double  getNegativeSolution(){ 
		return negd; 
	} 
} 
 
