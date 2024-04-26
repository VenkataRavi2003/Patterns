import java.util.Scanner;
public class H_AlphabitPattern{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter n : ");

		int n = sc.nextInt();

		print_H_Pattern(n);

		sc.close();
	}
	public static void print_H_Pattern(int n){

		for (int i = 0; i < n ; ++i ) {

			for (int j = 0 ; j < n ; ++j ) {

				if(j == 0 || j == n-1 || i == n/2){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
				
			}
			System.out.println();
			
		}
	}
}