import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
       int space = -1;
	    int star = n/2 +1;
	    
	    for(int row =1; row<=n; row++){
	        
	        for(int i=1; i<=star; i++){
	            System.out.print("* ");
	        }
	        
	        for(int i=1; i<=space; i++){
	            System.out.print("  ");
	        }
	        
	        for(int i=1; i<=star; i++){
	            if(row ==1 && i==star) continue;
	            if(row ==n && i==star) continue;
	            System.out.print("* ");
	        }
	        
	        if(row <= n/2){
	            space+=2;
	            star--;
	        }else {
	            space-=2;
	            star++;
	        }
	        System.out.println();
	        
	    }
	    
	}
}
