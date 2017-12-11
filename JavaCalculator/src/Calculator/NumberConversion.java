package Calculator;

public abstract class NumberConversion{
	
	public static  String toHex(int i) {
		String s = Integer.toHexString(i);
		return s.toUpperCase();
	}
	public String toBinary(int n) {
		String s = Integer.toBinaryString(n);
		return s;
	}
	
	public abstract String toOct(int n);
	
	}
