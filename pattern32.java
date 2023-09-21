import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int st = 1;
		int x = 1;
		for(int i=1;i<=2*n-1;i++){
		    
		    for(int j=1;j<=st;j++){
		       if(j%2==1) System.out.print(x+" ");
		       else System.out.print("* ");
		    }
		    if(i<=(2*n-1)/2){
		         st+=2;
		         x++;
		    }else{
		        st-=2;
		        x--;
		    }
		   
		    System.out.println();
		}
	}
}
