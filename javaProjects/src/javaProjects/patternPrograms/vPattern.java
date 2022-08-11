package javaProjects.patternPrograms;

public class vPattern {
	
	public static void main(String args[]) {
		//4. 'V' WAP Pattern design
		int n = 15;
		
		  for(int i =0 ;i < n; i++) {	
			  
			  for(int j = 0; j < n;j++) {
				  
				  if(j==0 && i==n-1/2  || j==n-1 && i==n-1/2 || i-j >=(n-1)/2 || i+j >= n-1 + n/2) {
				  
				  System.out.print("*");
				  } else {
					  System.out.print(" ");
				  }
			  }
			      System.out.println(" ");
		  }
}
}