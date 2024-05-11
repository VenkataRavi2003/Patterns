import java.util.Scanner;
public class TrianglePattern{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter n : ");
		int n = sc.nextInt();

		printTrianglePattern(n);

		sc.close();
	}
	public static void printTrianglePattern(int n){

		for (int i = 0 ; i < n  ; ++i) {
			for (int j = 0 ; j <= i ; ++j) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}