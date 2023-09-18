 import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	Scanner sc = new Scanner(System.in);
		int rows = 5;
		for (int i = 1; i <= rows; i++) {
            
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("\t"); 
            }
            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*\t");
            }
            System.out.println(); 
        }
}
}