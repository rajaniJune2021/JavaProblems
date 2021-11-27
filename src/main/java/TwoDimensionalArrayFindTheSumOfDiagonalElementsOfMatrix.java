//June24th
// wap to find the sum of the diagonal elements of a matrix
//        1 2 3
//        4 5 6    (diagonal values 1+5+9)
//        7 8 9
//0,2
//1,1
//2,0
public class TwoDimensionalArrayFindTheSumOfDiagonalElementsOfMatrix {

    public static void main(String[] args) {
        int A [][] = {{1,2,3},{4,5,6},{7,8,9}};

        int rowCount =3;
        int colCount =3;
        int sum =0;
        for(int i=0;i<rowCount;i++){
            for(int j=0; j<colCount;j++){
                if(i==j){
                    sum = sum+A[i][j];
                }
            }
        }
        System.out.println(sum);
         int sumTwo =0;
         int rowIndex =0;

            for(int j=colCount-1;j>=0;j--){
                sumTwo = sumTwo+A[rowIndex][j];
              rowIndex++;
            }
        System.out.println(sumTwo);
    }
}
