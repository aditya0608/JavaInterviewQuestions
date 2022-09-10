package inheritance.problem4;

public class A {
    int a;

    public void A(String ele) {
        a = 50;
    }

    public A() {

    }

    public static void main(String[] args) {
        A aObject = new B();
        B bObject = new B();
        System.out.println(aObject.a);
        System.out.println(bObject.a);
    }
}

class B extends A {
    int a = 10;
}
