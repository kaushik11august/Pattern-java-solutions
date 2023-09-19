import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
   // int sp = 1;
    int st = 1;
    for(int i=1;i<=n;i++){
         for(int j=1;j<=st;j++){
            System.out.print("* ");
        }
       st++;
      System.out.println();
    }
    st = n;
     for(int i=1;i<=n;i++){
         for(int j=2;j<=st;j++){
            System.out.print("* ");
        }
       st--;
      System.out.println();
    }
	}
}
