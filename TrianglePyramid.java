import java.util.Scanner;

public class TrianglePyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfLines = sc.nextInt();

        for( int i = 1; i <= noOfLines; i++){
            for( int j = 1; j <= i; j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }    
}
