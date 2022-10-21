public class Programme1One {


        int a= 10;
        int b= 20;
        public void instanceMethod(){
            System.out.println(a);
            System.out.println(b);
        }
    public static void main(String[] args) {
        Programme1One programme_1= new Programme1One();
        programme_1.instanceMethod();
    }
}