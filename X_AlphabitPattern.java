import java.util.Scanner;
public class X_AlphabitPattern{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter n : ");

		int n = sc.nextInt();

		print_X_Pattern(n);

		sc.close();
	}
	public static void print_X_Pattern(int n){

		for (int i = 0; i < n ; ++i ) {

			for (int j = 0 ; j < n ; ++j ) {

				if(i == j || i+j == n-1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
				
			}
			System.out.println();
			
		}
	}
}