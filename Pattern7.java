 import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		int n = 5;
		for(int i=1;i<=n;i++){
            if(i>=2 && i<=n-1){
                System.out.print("*\t");
                for(int j=2;j<=n-1;j++){
                    System.out.print("\t");
                }
                System.out.print("*\t");
		    }
            else{
                for(int j=1;j<=n;j++){
                    System.out.print("*\t");
                }
            }	    
		    System.out.println();
		}
	}
}