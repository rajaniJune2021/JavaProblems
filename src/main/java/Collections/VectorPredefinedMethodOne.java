package Collections;

// Try all the pre-defined methods in vector class.

import java.util.Iterator;
import java.util.Vector;

public class VectorPredefinedMethodOne {

    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(800);
        vector.add(400);
        vector.add(300);

        Vector<Integer> vector1 = new Vector<>();
        vector1.add(5);
        vector1.addAll(vector);

        Iterator<Integer> iterator = vector1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(vector.firstElement());
        vector.addElement(312);
        System.out.println(vector.get(3));
        Boolean b = vector.contains(800);
        System.out.println(b);
        Boolean b1= vector1.containsAll(vector);
        System.out.println(b1);

    }
}
