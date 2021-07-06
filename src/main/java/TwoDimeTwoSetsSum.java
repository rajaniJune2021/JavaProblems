import java.util.Scanner;

public class TwoDimeTwoSetsSum {

    public static void main(String[] args) {
        int[][] a;
        int[][] b;
        int firstArrayRow;
        int FirstArrayCol;
        int SecondArrayRow;
        int SecondArrayCol;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter firstArrayRow ");
        firstArrayRow = sc.nextInt();
        System.out.println("Enter firstArrayCol ");
        FirstArrayCol = sc.nextInt();

        a = new int[firstArrayRow][FirstArrayCol];
        System.out.println("enter the values of array");
        for(int i=0;i<firstArrayRow;i++){
            for(int j=0; j<FirstArrayCol;j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter secondArrayRow ");
        SecondArrayRow = sc.nextInt();
        System.out.println("Enter SecondArrayCol ");
        SecondArrayCol = sc.nextInt();

        b = new int[SecondArrayRow][SecondArrayCol];
        System.out.println("enter the values of array");
        for(int k=0;k<SecondArrayRow;k++){
            for(int l=0; l<SecondArrayCol;l++){
                b[k][l] = sc.nextInt();
            }
        }

        int[][] sum = new int[firstArrayRow][FirstArrayCol];

        if(firstArrayRow==SecondArrayRow && FirstArrayCol == SecondArrayCol) {
            for (int m = 0; m < firstArrayRow; m++) {
                 for(int n=0; n<FirstArrayCol; n++){
                     sum[m][n] = a[m][n]+b[m][n];
                     System.out.println(sum[m][n]);
                 }
            }
        }else{
            System.out.println("Thest two matrixes ca not be added");
        }
    }
}
