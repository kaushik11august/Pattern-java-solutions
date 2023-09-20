import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
       int space = n-1;
	    int star = 1;
	    
	    for(int row =1; row<=n; row++){
	        
	        for(int i=1; i<=space; i++){
	            System.out.print("  ");
	        }
	        int x = row;
	        for(int i=1; i<=star; i++){
	            System.out.print(x +" ");
	             if(i<=star/2){
	                 x++;
	             }else{
	                 x--;
	             }
	        }
	       
	       star+=2;
	       space--;
	        System.out.println();
	       
	    }
	   
	}
}
