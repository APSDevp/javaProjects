package javaProjects.patternPrograms;

public class homePattern {
	
	public static void main(String args[]) {
		//3.WAP Pattern design
		int n = 14;
		
		  for(int i =0 ;i <= 13; i++) {
			  
			  for(int j = 0; j <= 13;j++) {
				  
				  if(i==0  || j==0 || i==n-1 || j==n-1 || i+j <= (n-1)/2 || j-i  >= (n-1)/2) {
				  
				  System.out.print("*");
				  } else {
					  System.out.print(" ");
				  }
			  }
			      System.out.println(" ");
		  }
		
	}

}
