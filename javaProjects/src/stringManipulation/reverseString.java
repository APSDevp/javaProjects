package stringManipulation;

public class reverseString {
	
	public static void main(String[] args) {
		
		String in = "iNeuron";
		String out= "";

		
		for(int i =in.length()-1;i>=0;i--) {
			char ch = in.charAt(i);
			out +=ch;
		}
		
		System.out.println(out);
		
	}

}
