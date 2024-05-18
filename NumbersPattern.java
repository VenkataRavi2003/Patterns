import java.util.Scanner;
public class NumbersPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter N : ");
		int n = sc.nextInt();

		printPattern(n);
		sc.close();
	}
	public static void printPattern(int n){
		int x = 1;
		for (int i=0;i<n;++i) {
			for (int j=0;j<=i ; ++j) {
				System.out.print((x++)+" ");
			}
			System.out.println();
		}
	}
}