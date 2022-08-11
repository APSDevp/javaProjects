package javaProjects.patternPrograms;

public class iNeuronPattern {

	public static void main(String[] args) {
		//To Print Ineuron as patter
		
	//1.To Print I
		int n=8;
		for(int i=0;i<n; i++)
		{
		for(int j=0;j<n; j++)
		{
			if(i==0 || i==(n-1) ||i==0 ||j== (n-1)/2) 
									 {
			    System.out.print("*");
				 }
			else {
				System.out.print(" ");
			 }
		}
			System.out.print("  ");		
		
	//2.To print N
				for(int j=0; j<n ; j++)
				{
					if( j==0 || j==(n-1)|| i==j) 
								 {
							System.out.print("*");
								 }
						else {
							System.out.print(" ");
						}
		          }
				System.out.print(" ");
				
				
	//3.To print E
				for(int j=0;j<n ; j++) {
					if( j==0|| i==0 || i==(n-1)/2|| i==(n-1)  ) 
								 {
							System.out.print("*");
						}else {
							System.out.print(" ");
						}
					}
					
					System.out.print(" ");  
					
	//4.To print U
					
					for(int j=0;j<n ; j++) {
						if( j==0|| j==(n-1) || i==(n-1)  ) 
									 {
								System.out.print("*");
							}else {
								System.out.print(" ");
							}
						}
						
						System.out.print(" ");
					
					
	//5.To print R
						
						for(int j=0;j<n; j++) {
							if(j==0 || i==(n-1)/2 ||i==0 || i-j ==(n-1)/2 || j==n-1 && i<=(n-1)/2 ) 
													 {
												System.out.print("*");
											}else {
												System.out.print(" ");
											}
											
							}
						
						System.out.print(" ");
						
    //6.To print O
						for(int j=0;j<n ; j++) {
							if( i==0&& j!=0 &&j!=n-1 || j==n-1 && i>0 &&i<n-1 || j==0 && i>0 && i<n-1|| i==n-1 && j>0 &&j<n-1) 
										 {
									System.out.print("*");
								}else {
									System.out.print(" ");
								}
							}
							
							System.out.print(" ");
							
					
	//7.To print N
					
					for(int j=0;j<n ; j++) {
						if( j==0 || j==(n-1)|| i==j) 
									 {
								System.out.print("*");
									 }
							else {
								System.out.print(" ");
							}
			          }
					System.out.print(" ");
					
			              
		 System.out.println();
	}


	}

}
