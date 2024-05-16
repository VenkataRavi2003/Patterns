import java.util.Scanner;
public class ABC_Pattern{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter N : ");
		int n = sc.nextInt();

		print_ABC_Pattern(n);

		sc.close();
	}
	public static void print_ABC_Pattern(int n){

		System.out.println("\nABC_Pattern");
		System.out.println("~~~~~~~~~~~~~~~~~");

		for (int i = 0 ; i < n ; ++i) {
			//A
			for (int j = 0 ; j < n; ++j) {
				
				if((i == 0 && j != 0 && j != n-1)||(j == 0 && i != 0)||(i == n/2)||(j == n-1 && i != 0))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			//B
			for (int j = 0 ; j < n; ++j) {
				
				if((j == 0)||(i == n /2 )||( i == 0 && j != n-1)||(i == n-1 && j != n-1)||(j == n-1 && i != 0 && i != n-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");

			//C
			for (int j = 0 ; j < n; ++j) {
				
				if((j == 0 && i != 0 && i != n-1)||(i == 0 && j != 0)||(i == n-1 && j != 0))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();


		}
	}
}
