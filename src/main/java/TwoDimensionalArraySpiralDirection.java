public class TwoDimensionalArraySpiralDirection {

    public static void main(String[] args) {
        int A[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //0,0,
        //0,1
        //0,2
        //1,2
        //2,2
        //2,1
        //2,0
        //1,0
        //1,1
        int rowCount = 3;
        int colCount = 3;
        int l = 0, k, j, i;
        int count = 2;
        for (i = 0; i < rowCount - 2; i++) {
            for (j = i + 1; j < rowCount - 1; j++) {
                for (k = j + 1; k < rowCount; k++) {
                    for (l = 0; l < colCount; l++) {
                        System.out.println(A[i][l]);

                    }
                    System.out.println(A[j][count]);
                    System.out.println(A[k][count]);
                    count--;
                    while (count >= 0) {
                        System.out.println(A[k][count]);
                        count--;
                    }
                    count++;
                    while (count < 2) {
                        System.out.println(A[j][count]);
                        count++;
                    }

                }
            }
        }
    }
}
