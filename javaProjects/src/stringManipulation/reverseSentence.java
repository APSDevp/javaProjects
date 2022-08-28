package stringManipulation;

public class reverseSentence {

	public static void main(String[] args) {
		
		String in = "Think Twice";
		String out ="";
		
		String[] split = in.split(" ");
		
		for(int i=split.length-1; i>=0;i--) {
			out+=split[i]+" ";
		}
		System.out.println(out);

	}

}
