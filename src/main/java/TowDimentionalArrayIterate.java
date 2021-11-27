import java.util.Arrays;
import java.util.Scanner;

public class TowDimentionalArrayIterate {

    public static void main(String[] args) {

        System.out.println("Please enter row number");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();


        int col = sc.nextInt();
        System.out.println("Please enter col number");

        int[][] data = new int[row][col];

        for(int i =0;i<row; i++ ){
            for (int j=0; j<col;j++){
                 data[i][j] = sc.nextInt();
            }
        }

        for(int r[] : data){
            System.out.print(Arrays.toString(r));
        }

    }
}
