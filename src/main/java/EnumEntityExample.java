public enum EnumEntityExample {

    //enum cannot extend any class, implicitly it's extending Java.lang.EnumClass
    //enum can implements interfaces

    example1,example2,example3;
    private EnumEntityExample(){
        System.out.println(this.toString());
    }
}
