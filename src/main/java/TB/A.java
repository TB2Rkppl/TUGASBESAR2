/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TB;

/**
 *
 * @author DIKDIK
 */
public class A implements AddandSub {
    public void A() {
		System.out.println("Ctor A");
	}
    
    public int add(int n1,int n2) {
        return n1+n2;
    }
    public int sub(int n1,int n2){
        return n1-n2;
    }

    @Override
	public String toString() {
		// TODO - implement A.toString
		throw new UnsupportedOperationException();
	}
}
