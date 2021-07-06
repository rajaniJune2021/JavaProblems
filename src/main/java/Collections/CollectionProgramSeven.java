package Collections;

import java.util.LinkedList;
import java.util.List;

// Take LinkedList and whether given linkedList is palindrome list or not. input: I/P: [1,2,2,1]
public class CollectionProgramSeven {
    public static void main(String[] args) {
//        List<Integer> linkedList = new LinkedList<>();
//        linkedList.add(1);
//        linkedList.add(2);
//        linkedList.add(2);
//        linkedList.add(1);

//        List<Integer>  linkedList1 = new LinkedList<>();
//        for (int i=linkedList.size()-1;i>=0; i--){
//            linkedList1.add(linkedList.get(i));
//        }
//        if(linkedList.equals(linkedList1)){
//            System.out.println("given linked is palindrome list");
//        }
//        Integer lengthOfSize = linkedList.get(linkedList.size()-1);
//        boolean b =false;
//
//        for(int i=0; i<linkedList.size()/2;i++){
//            Integer temp = linkedList.get(i);
//            Integer lastValue;
//        try{
//            if(i>0){
//                lastValue =  linkedList.get(lengthOfSize--);
//            }else{
//                lastValue =  linkedList.get(lengthOfSize);
//            }
//           if( lastValue == temp){
//               b= true;
//               lengthOfSize--;
//           }else {
//               b= false;
//           }
//        }catch (IndexOutOfBoundsException e){
//          e.printStackTrace();
//        }
//        }
//        if(b){
//            System.out.println("Given string is palindrome");
//        }else{
//            System.out.println("not palindrome");
//        }


        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(4);
        int sizeOfList = list.size()-1;
        boolean b = false;
        for(int i=0;i<list.size();i++){
            if(list.get(i) == list.get(sizeOfList)){
                b = true;
            }else{
                b= false;
                break;
            }
            sizeOfList--;
        }
        if(b){
            System.out.println("given list is palindrome");
        }else{
            System.out.println("given list is not palindrome");
        }


    }
}
