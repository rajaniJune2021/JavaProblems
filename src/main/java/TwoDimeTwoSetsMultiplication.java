import java.util.Scanner;

public class TwoDimeTwoSetsMultiplication {

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

        int[][] multiply = new int[firstArrayRow][SecondArrayCol];
        if(firstArrayRow==SecondArrayCol) {
            for (int m = 0; m < firstArrayRow; m++) {
                for (int n = 0; n <SecondArrayCol;n++) {
                    for(int p =0;p<SecondArrayRow;p++) {
                        multiply[m][n] +=(a[m][p] * b[p][n]);

                    }
                    System.out.println(multiply[m][n]);
                }
            }
        }
    }
}
