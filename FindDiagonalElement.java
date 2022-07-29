package from25th_july;

import java.util.Scanner;

public class FindDiagonalElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	    int m1 =input.nextInt();
	    int n1 = input.nextInt();
	    int max =0;
	        int a[][] =new int[m1][n1];
	        
	        for(int i=0;i<m1;i++){
	            for(int j=0;j<n1;j++){
	                
	                a[i][j] = input.nextInt(); 
	            }
	        }
	        for(int i=0;i<m1;i++){
	        	
            for(int j=0;j<n1;j++){
            	
            	System.out.print(a[i][j] + " ");
            }
            System.out.println();
	        }
	        for(int i=0;i<m1;i++){
	        	
	            for(int j=0;j<n1;j++){
	            	
	            	if(i==j) {
		            	System.out.println(a[i][j]);

	            	}
	            }
	            	
	            }
	        
	}
	

}
