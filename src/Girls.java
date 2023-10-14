public class Girls extends Human{

    void value(){
        System.out.println("this is current value");
    }

    void getSuperMethod(){
        Girls girl=new Girls();
        this.value();
        super.value();
    }

    public static void main(String[] args) {
        Girls girl=new Girls();
        girl.getSuperMethod();




    }
}
