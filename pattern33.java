import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int st = 0;
		int sp = n-1;
		for(int i=n;i>=1;i--){
		  for(int j=1;j<=sp;j++){
		      System.out.print("  ");
		  }
		  int cnt = i;
		  for(int j=1;j<=st;j++){
		      System.out.print(cnt+" ");
		      cnt++;
		  }
		  System.out.print(0+" ");
		   int cnt2 = n-1;
		  for(int j=1;j<=st;j++){
		      System.out.print(cnt2+" ");
		      cnt2--;
		  }
		   st++;
		   sp--;
		   
		    System.out.println();
		}
	}
}
