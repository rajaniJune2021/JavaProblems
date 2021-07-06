public class Practice {

    public static void main(String[] args) {
        int[] a = {15,4,3,18,5,1};
        int l=0;
        for(int i=0;i<a.length;i++){


            try{

              l = a[i];
                int j = a[i+1];

                if(j> l){
                    System.out.println("next largestnumeber "+ j);
                }
            }catch (Exception e){
                System.out.println("-1");
            }


        }

    }
}
