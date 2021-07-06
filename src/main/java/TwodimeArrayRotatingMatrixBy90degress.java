import java.util.Scanner;

public class TwodimeArrayRotatingMatrixBy90degress {

    public static void main(String[] args) {
        int[][] a;
        int firstArrayRow;
        int FirstArrayCol;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter firstArrayRow ");
        firstArrayRow = sc.nextInt();
        System.out.println("Enter firstArrayCol ");
        FirstArrayCol = sc.nextInt();

        a = new int[firstArrayRow][FirstArrayCol];
        System.out.println("enter the values of array");
        for(int i=0;i<firstArrayRow;i++){
            for(int j=0; j<FirstArrayCol;j++){
                a[i][j]= sc.nextInt();
            }
        }

        int[][] resultRotateMatrixArray = new int[firstArrayRow][FirstArrayCol];

        for(int i=0;i<firstArrayRow;i++){
            for(int j=FirstArrayCol-1;j>=0;j--){
                resultRotateMatrixArray[j][i] +=a[j][i];
                System.out.println(resultRotateMatrixArray[j][i]);
            }
        }
    }
}
