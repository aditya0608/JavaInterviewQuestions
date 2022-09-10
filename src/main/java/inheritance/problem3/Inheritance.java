package inheritance.problem3;

public class Inheritance {

Inheritance()
{
    System.out.println("Parent invoked");
}
      public void hello()
    {
        System.out.println("Hello inheritance");
    }

    public static void main(String[] args) {
        Inheritance inheritance=new child();
        inheritance.hello();

        Inheritance inheritance1=new Inheritance();
        inheritance1.hello();
    }
}
class child extends Inheritance
{
    @Override
    public void hello()
    {
        System.out.println("hello child");
    }
}
