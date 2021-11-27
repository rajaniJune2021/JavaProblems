
//Print the elements which are common in all the rows and columns of the matrix.
// input
// 1 2 3
//4 1 3
//3 3 1 - // output should be {1,3}

//
//{{1,2,3},
//        {4,1,2},
//        {5,6,1}}
//
//        0,0 - 1,0 1,1 1,2 - 2,0, 21, 2,2
//
//        0,1 - 1,0 1,1 1,2 - 2,0, 21, 2,2
//
//        0,2 - 1,0, 1,1, 1,2 2,0, 21, 2,2
import java.util.HashSet;

public class TwoDimentionalPrintCommonElementsOfRowsAndColumns {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 1, 3}, {3, 3, 1}};
        //int[][] a ={{1,2,3},{4,1,2},{5,6,1}};
        int rowCount = 3;
        int colCount = 3;
        boolean b1 = false;
        int colCounter = 0;
        int colValue = 0;
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                if (j <= 1) {
                    colValue = j + 1;
                } else {
                    colValue = 2;
                }

                if (a[0][colCounter] == a[colValue][j]) {
                    b1 = true;
                    hs.add(a[colValue][j]);
                }

            }
            colCounter++;
        }
        if (b1) {
            System.out.println(hs);

        }
    }
}
