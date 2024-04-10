import java.util.Scanner;
public class RectangularPattern{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("\nEnter no.of rows : ");
		int rows=sc.nextInt();
		
		System.out.print("\nEnter no.of columns : ");
		int columns=sc.nextInt();
		
		System.out.println("Rectangular Pattern");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		
		for(int i=0;i<rows;++i){
			for(int j=0;j<columns;++j){
				if(i==0||j==0||i==rows-1||j==columns-1)
				System.out.print("*");
			else
				System.out.print(" ");
			}
			System.out.println();
		}
		sc.close();
	}
}