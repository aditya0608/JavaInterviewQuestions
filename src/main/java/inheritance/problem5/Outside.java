package inheritance.problem5;

public class Outside {

    public static void m1() {
        System.out.println("Inside m1 oustide");
    }

    public static void main(String[] args) {
        Outside outside = new Inner();
        outside.m1();
        // will give an error since m2 is in inner scope
        // outside.m2();
    }
}

class Inner extends Outside {
    public static void m1() {
        System.out.println("Inside m1 inside");
    }

    public void m2() {
        System.out.println("Inside m2 inside");
    }
}
