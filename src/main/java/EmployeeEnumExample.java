public enum EmployeeEnumExample {

    TELANGANA("karimnagar", 1),
    ANDHRA("Krishna", 2);
   private String s;
   private int i;
    EmployeeEnumExample(String s, int i){
        this.s =s;
        this.i =i;
    }

    public String getS(){
        return s;
    }

    public int getI(){
        return i;
    }
}

