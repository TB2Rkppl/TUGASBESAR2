/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TB;

/**
 *
 * @author DIKDIK
 */
public class B implements MulAndDivInterface {
    public void B() {
		// TODO - implement A.B
                System.out.println("Ctor B");
	}
    
    public double mul(double n1,double n2) {
      return n1*n2;
    }
    public double div(double n1,double n2){
        return n1/n2;
    }

    @Override
	public String toString() {
		// TODO - implement A.toString
		throw new UnsupportedOperationException();
	}
}
