public class EnumImplementationExample {

    public static void main(String[] args) {
      // EnumState[] enumStateObj = EnumState.values();
//        for (EnumState s: enumStateObj ){
//            System.out.println(s);
        EnumState enuObj1 ;
        enuObj1=EnumState.city1;
        enuObj1.printCity();
        enuObj1.enumAbstractMethod();
        switch (enuObj1){
            case city1:
                System.out.println("This is the first city name");
             break;
            case city2:
                System.out.println("This is second city name");
                break;
            case city3:
                System.out.println("This is Third city name");
                break;
            case city4:
                System.out.println("This is fourth city name");
                break;
            default:
                System.out.println("Always first city can be printed");
        }

        }


    }
