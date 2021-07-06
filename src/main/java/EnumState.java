public enum EnumState {

    // these variables are constant, final and static type.
   city1{
        @Override
        public void enumAbstractMethod() {
            System.out.println("City 1 abstract method implemented");
        }
    },city2{
        @Override
        public void enumAbstractMethod() {
            System.out.println("City 2 abstract method implemented");
        }
    },city3{
        @Override
        public void enumAbstractMethod() {
            System.out.println("City 3 abstract method implemented");
        }
    },city4{
        @Override
        public void enumAbstractMethod() {
            System.out.println("City 4 abstract method implemented");
        }
    };

   public void printCity(){
       System.out.println("This Method called from in enum");
   }

   public abstract void enumAbstractMethod();

}

