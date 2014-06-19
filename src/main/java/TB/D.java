/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TB;

/**
 *
 * @author DIKDIK
 */
public class D implements PowInterface {
    double n1;
            double n2;
    public D() {
            System.out.println("Ctor D");
	}
    
    
    public double pow(double n1,double n2){
        
        return n1*n2;
    }
    public double mul(double n1, double n2)
    {
        return n1*n2;
    }
    
    public double div(double n1,double n2)
    {
        return n1/n2;
    }

    @Override
	public String toString() {
		// TODO - implement D.toString
		throw new UnsupportedOperationException();
	}
}
