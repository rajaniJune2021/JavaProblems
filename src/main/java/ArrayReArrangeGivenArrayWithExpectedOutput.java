import java.util.Arrays;

//July 5th:
// Array problem - 2 4 5 0 0 5 4 6 0 6 8 0 0, push all the zeros to the end, if previous matches with next element like 5,5 next elemnt has to be increment with previous element previous ele should be 0 all 0 has to put at end.
//output should be = {2,4,} output - 2 4 10 4 12 8 0 0 0 0 0 0 0
// 2,4,0,0,0,10,4,0,0,12,8,0,0
public class ArrayReArrangeGivenArrayWithExpectedOutput {
    static int[] a = {2, 4, 5, 0, 0, 5, 4, 6, 0, 6, 8, 0, 0};
    static int index;
    static int i = 0;
    static int lastIndex = a.length - 1;
    static int count = 0;

    public static void main(String[] args) {

        for (; i < a.length - 2; i++) {
            int value = a[getIndexOfArray(index)];
            int value1 = a[i];
            if (value == 0 || value > 0) {
                if (value1 == 0) {
                    i = index - 1;
                }
                if (a[i] == a[index]) {
                    int temp1 = a[index];
                    a[index] = temp1 + a[i];
                    temp1 = 0;
                    a[i] = temp1;
                }
            }
        }
       //  Arrays.sort(a);
//        for (int k : a) {
//            System.out.println(k);
//        }

        int n = a.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != 0)
                a[count++] = a[i];}
            while (count < n)
                a[count++] = 0;

        for(int j:a){
            System.out.print(" "+j);
        }

    }

    public static int getIndexOfArray(int j) {
        if (a[i] != 0) {
            index = j + 1;
        } else {
            i = index;
            index = j + 1;
        }
        try {
            if (a[index] == 0 && index < a.length - 1) {
                index = index + 1;
                while (a[index] == 0 && index < a.length - 1) {
                    index++;
                }
            } else {
                if (a[i] != 0) {
                    index = j + 1;
                }
            }

        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        return index;
    }

    public static boolean resetTheIndex(int number) {

        if (a[number] == 0) {
            if (count > 0) {
                lastIndex--;
            }
            int temp2 = a[lastIndex];
            int swap = a[number];
            a[lastIndex] = swap;
            a[number] = temp2;
            count++;
        } else {
            System.out.println(a[number]);
        }
        return false;
    }
}
