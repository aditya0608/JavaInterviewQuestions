package inheritance.problem1;

public class Inheritance {


    Inheritance(String name)
    {
        System.out.println("param parent");
    }

    Inheritance()
    {
        System.out.println("parent");
    }

    public static void main(String[] args) {

        Lower lower=new Lower();
        Lower lower1=new Lower("aditya");

    }
}

class Lower extends Inheritance
{
   public Lower()
   {
       super();
       System.out.println("child");
   }
   public Lower(String name)
   {
       super();
       System.out.println("param child");
   }
}
