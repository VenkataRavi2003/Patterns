import java.util.Scanner;
public class PlusSymbol{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter N : ");
		int n = sc.nextInt();

		printPlusSymbol(n);

		sc.close();
	}
	public static void printPlusSymbol(int n){

		System.out.println("\nPlus Symbol");
		System.out.println("~~~~~~~~~~~~~~~~~");

		for (int i = 0 ; i < n ; ++i) {
			for (int j = 0 ; j < n; ++j) {

				if(i == n / 2 || j == n / 2){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}