public class StringFindAllPossibleSubStringsWhoseLengthisFour {

    // Find the all possible substring whose length is 4: input String: racecar output: race,acec, ceca, ecar, etc..

    public static void main(String[] args) {

        String inputString = "racecar";
        int sLength = inputString.length();


        for(int i=0; i<=sLength; i++){
            for(int j= i+1; j<=sLength;j++){
               String temp1= (inputString.substring(i,j));
               if(temp1.length()==4){
                   System.out.println(temp1);
               }
            }

        }



    }
}
