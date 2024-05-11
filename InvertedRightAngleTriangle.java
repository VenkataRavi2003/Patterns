import java.util.Scanner;
public class InvertedRightAngleTriangle{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the number : ");
		int n=sc.nextInt();
		System.out.println("\nInverted Right Angle Triangle");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for(int i=0;i<n;++i){
			for(int j=0;j<n;++j){
				if(i==0||j==n-1||i==j){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
