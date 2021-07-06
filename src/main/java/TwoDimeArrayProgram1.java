import java.util.Scanner;

public class TwoDimeArrayProgram1 {
    public static void main(String[] args) {
        //printing of two dimensional array {{1,2}, {{4,5},{6,8}} with foreach loop - first for each loop converts to single dimesion array and second foreach loop converts single dimesional array to variable
        int[][] a;
        int row;
        int col;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row");
        row = sc.nextInt();
        System.out.println("Enter col");
        col = sc.nextInt();
        a = new int[row][col];
        System.out.println("enter the values of array");
        for(int i=0;i<row;i++){
            for(int j=0; j<col;j++){
              a[i][j] = sc.nextInt();
            }
        }

        for(int k[]:a){
            for(int l:k){
                System.out.println(l);
            }
        }


    }
}
