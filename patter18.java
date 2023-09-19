import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sp = n-4;
      int st = 1;
        for( int i=1; i<=(n/2)+1; i++){
            for(int j=1; j<=sp; j++){
            System.out.print(" ");
            }
            for(int j=1; j<=st; j++){
            System.out.print("*");
            }
            sp--;
            st+=2;
            System.out.println();
        }
       
        sp=1;
        st=n-2;
         for( int i=2; i<=n; i++){
            for(int j=1; j<=sp; j++){
            System.out.print(" ");
            }
            for(int j=1; j<=st; j++){
            System.out.print("*");
            }
            sp++;
            st-=2;
            System.out.println();
        }
	}
}
