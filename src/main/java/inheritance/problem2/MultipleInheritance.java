package inheritance.problem2;

 class MultipleInheritance extends A implements  B {

     public String hello()
     {
         return ("Hello from multi");
     }
     @Override
       String method()
     {
         return "Multi";
     }


    public static void main(String[] args) {
        MultipleInheritance multipleInheritance=new MultipleInheritance();
        System.out.println(multipleInheritance.hello());
        A a=new MultipleInheritance();
        System.out.println(a.hello());
        B b=new MultipleInheritance();
        System.out.println(b.hello());
    }
}

class A
{
     String hello()
    {
        return "Hello from A";
    }
     String method()
    {
 return "A"     ;
    }
}

interface B {
    default String hello()
    {
        return "Hello from B";
    }
}
