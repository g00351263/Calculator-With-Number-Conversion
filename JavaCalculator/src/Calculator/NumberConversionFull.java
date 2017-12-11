/*Authour Raja Naseer Ahmed Khan
 * B.Sc 2nd Year, Software Development.
 * G.M.I.T. Dublin Road, Campus, Galway City.
 */
package Calculator;


public class NumberConversionFull{


	public NumberConversionFull() {}

	public static String toOct(double n) {
		String s = Integer.toOctalString((int)n);
		return s;
	}
	
	public String toInt(double in) {
		int num;
		num = (int)in;
		
		return Integer.toString(num);
		
	}


}
