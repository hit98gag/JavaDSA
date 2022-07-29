package from25th_july;

import java.util.Scanner;

public class MinimumInEachRow {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
		    int m1 =input.nextInt();
		    int n1 = input.nextInt();
		    int min =0;
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
	                min = a[i][0];

		        
		            for(int j=0;j<n1;j++){
		            	if(a[i][j]<min)
		            	{
		            		min=a[i][j];
		            	}

		            }

		           
		                System.out.print(min);
		}
		}

	

	

}
