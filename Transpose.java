package from25th_july;
import java.util.*;

public class Transpose {
	public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	    int m1 =input.nextInt();
	    int n1 = input.nextInt();
	        int a[][] =new int[m1][n1];
	        
	        for(int i=0;i<m1;i++){
	            for(int j=0;j<n1;j++){
	                
	                a[i][j] = input.nextInt(); 
	            }
	        }
	            
	            for(int i=0;i<m1;i++){
	            for(int j=0;j<n1;j++){
	            System.out.print(a[j][i] + " ");
	                
	            }
	                System.out.println();
	}

}
}