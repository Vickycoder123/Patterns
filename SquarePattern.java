import java.util.Scanner;

public class SquarePattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int noOfLines = sc.nextInt();

        for(int i = 0; i < noOfLines; i++){
            for( int j = 0; j < noOfLines; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}