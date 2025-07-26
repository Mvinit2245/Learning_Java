package day2;

public class NamePattern {

	
	public static void main(String args[]) {
		
		
		// printing A
		for(int i=1; i<=5;i++) {
			
			for(int j=1; j<=5;j++) {
				
				if((i==1 || i==3) && (j==3))  {
					System.out.print("*");
				}else if((i==2 || i==3 || i==4 || i==5 ) && (j==2 || j==4)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.print(" ");
			
			// printing I
			
              for(int j=1; j<=5;j++) {
				
				if(i==1 || i==5)   {
					System.out.print("*");
				}else if((i==2 || i==3 || i==4 || i==5 ) && j==3) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
              System.out.print("  ");
              
              
           // printing M
              
              for(int j=1; j<=5;j++) {
  				
  				if(j==1 )  {
  					System.out.print("*");
  				}else if (j==5) {
  					System.out.print("*");
  				}
  				else if((i==2) && (j==2 || j==4)) {
  					System.out.print("*");
  				}else if(i==3 && j==3) {
  					System.out.print("*");
  				}
  				
  				else {
  					System.out.print(" ");
  				}
  				
  			}
              System.out.print("  ");
              
              
           // printing E
              
              for(int j=1; j<=5;j++) {
  				
  				if(j==1 )  {
  					System.out.print("*");
  				}else if((i==1 || i==3 || i==5) && (j==2 || j==3 || j==4 || j==5)) {
  					System.out.print("*");
  				}else {
  					System.out.print(" ");
  				}
  				
  			}
              System.out.print("  ");
              
              
           // printing R
              
              for(int j=1; j<=5;j++) {
  				
  				if(j==1 )  {
  					System.out.print("*");
  				}else if(i==1) {
  					System.out.print("*");
  				}
  				else if((i==2 ) && (j==5)) {
  					System.out.print("*");
  				}else if((i==3 ) && ( j==2 ||j==3 || j==4 || j==5)) {
  					System.out.print("*");
  				}
  				else if((i== 4) && (j==4) ) {
  					System.out.print("*");
  				}else if((i== 5) && (j==5) ) {
  					System.out.print("*");
  				}
  				else {
  					System.out.print(" ");
  				}
  				System.out.print("");
  			}
              System.out.print("  ");
              
           // printing Z
              
              for(int j=1; j<=5;j++) {
  				
  				if(i==1 || i==5)  {
  					System.out.print("*");
  				}else if((i==2) && (j==4)) {
  					System.out.print("*");
  				}else if((i==3) && (j==3)) {
  					System.out.print("*");
  				}else if((i==4) && (j==2)) {
  					System.out.print("*");
  				}
  				else {
  					System.out.print(" ");
  				}
  				System.out.print("");
  			}
			
			
			
			
			System.out.println();
		}
		
		
		
		
		
	}
	
	
}
