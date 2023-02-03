import java.util.Scanner;

public class HollowSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfLines = sc.nextInt();

        for( int i = 1; i <= noOfLines; i++){
            for( int j = 1; j <= noOfLines; j++){
                if( i == 1 ||j == 1 || i == noOfLines || j == noOfLines ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
