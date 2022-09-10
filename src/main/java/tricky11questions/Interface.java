package tricky11questions;

 interface Fruits
{
    public  String FRUIT_TYPE="CITRUS";
}
public class Interface implements Fruits{
    public static void main(String[] args) {
        System.out.println(Interface.FRUIT_TYPE);
    }
}

//variables declared inside interface are public static final ,hence without object creation we can access it
// https://stackoverflow.com/questions/2430756/why-are-interface-variables-static-and-final-by-default