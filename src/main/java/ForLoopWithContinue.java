public class ForLoopWithContinue {

    public static void main(String[] args) {

        for(int i=0;i<=10;i++){
            if(i==3){
                continue;
            }
            System.out.println(i);
        }
    }

    // The importance of "continue" key word always play key role when We have to skp particular condition and proceed with next iteration in loop.
}
