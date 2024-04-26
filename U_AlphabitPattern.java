import java.util.Scanner;
public class U_AlphabitPattern{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter n : ");

		int n = sc.nextInt();

		print_U_Pattern(n);

		sc.close();
	}
	public static void print_U_Pattern(int n){

		for (int i = 0; i < n ; ++i ) {

			for (int j = 0 ; j < n ; ++j ) {

				if((j == 0 && i != n-1)||(j == n-1 && i != n-1)||(i == n-1 && j != 0 && j != n-1)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
				
			}
			System.out.println();
			
		}
	}
}