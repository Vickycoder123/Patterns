import java.util.Scanner;

public class Tpattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int noOfLines = scan.nextInt();

        for( int i = 0; i < noOfLines; i++){
            for( int j = 0; j < noOfLines; j++){
                if( i == 0 || j == 0 || i == (noOfLines-1)/2 || j == (noOfLines - 1)){
                    System.out.print("*");
                }else{
                    System.out.println(" ");
                }
            }
            System.out.println();
        }
    }
}
