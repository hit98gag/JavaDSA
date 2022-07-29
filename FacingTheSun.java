package from25th_july;
import java.util.*;
public class FacingTheSun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc = new Scanner(System.in);

int n = sc.nextInt();

int a[] = new int[n];

for(int i=0;i<a.length;i++) {
	a[i]=sc.nextInt();
}

int max = a[0];
int count=0;

for(int i=1;i<a.length;i++) {
	
	if(a[i]>max) {
		count++;

		max=a[i];
	}
	
}
System.out.print(count);

}

	}


