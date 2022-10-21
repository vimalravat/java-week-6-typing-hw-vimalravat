public class Programme_4 {

//instance variable
    String name="Prime";
    String surname= "Testing";
    //static variable
    static boolean a= true;
    static boolean b= false;

    public void instanceMethod(){
        System.out.println(name);
        System.out.println(surname);
        System.out.println(Programme_4.a);
        System.out.println(Programme_4.b);


    }
    public static void staticMethod(){
        Programme_4 programme_4=new Programme_4();
        System.out.println(programme_4.name);
        System.out.println(programme_4.surname);
        System.out.println(a);
        System.out.println(b);


    }

    public static void main(String[] args) {
        Programme_4 programme_4= new Programme_4();
        programme_4.instanceMethod();
        staticMethod();
    }

}
