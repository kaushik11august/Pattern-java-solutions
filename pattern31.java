import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      for(int i=1;i<=n;i++){
          int x =n;
          for(int j=1;j<=n;j++){
              if(i+j==6){
                  System.out.print("* ");
              }else{
                  System.out.print(x + " ");
              }
              
              x--;
          }
          System.out.println();
      }
	}
}
