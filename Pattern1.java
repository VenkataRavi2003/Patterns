import java.util.Scanner;
public class Pattern1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter n : ");
		int n = sc.nextInt();

		char ch = 'A';
		for (int i = 0; i < n ; ++i) {
			for (int j = 0 ; j < n ; ++j) {
				if(i == j || i + j == n-1){
					System.out.print((ch++));
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}