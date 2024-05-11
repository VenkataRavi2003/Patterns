import java.util.Scanner;
class InvertedRight_LeftAngleTriangles{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the number : ");
		int n=sc.nextInt();
		System.out.println("\nInverted Left & Right Angle Triangles");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for(int i=0;i<n;++i){
			for(int j=0;j<n;++j){
				if(i==0||j==0||i-j==n-1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int j=0;j<n;++j){
				if(i==0||j==n-1||i==j){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}