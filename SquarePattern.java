import java.util.Scanner;
public class SquarePattern{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("\nEnter n : ");
    int n = sc.nextInt();
    System.out.println("\nSquare Pattern");
    System.out.println("~~~~~~~~~~~~~~~~~~");
    for(int i=0;i<n;++i){
      for(int j=0;j<n;++j){
        System.out.print("*");
      }
      System.out.println();
    }
    sc.close();
  }
}
