public class ForEachLoopExample {

    public static void main(String[] args) {

        int[] arrayNumber = {1,3,4,6,7,9,8};
        int count=0;
        for(int i : arrayNumber){
            System.out.println(i);
            count++;
        }
        System.out.println(count);
    }
}
