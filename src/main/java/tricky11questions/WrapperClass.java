package tricky11questions;

import jdk.swing.interop.SwingInterOpUtils;

public class WrapperClass {
    public static void main(String[] args) {
        Integer i=127;
        Integer i2=127;
        System.out.println(i==i2);
        //first sout gives true as both variables point to same location
        Integer i3=128;
        Integer i4=128;
        //caching happens only until value from -127 to  127 value for integers,byte,short,long for above values a new variable will be created
        //for characters 0 to 127
        //float double don't have the concept of caching
        System.out.println(i3==i4);

        System.out.println(Math.min(Double.MIN_VALUE,0.0d));
        //ABS VALUE Double.MIN_VALUE hence greater than 0.0d but not in Integer.MIN_VALUE;
        System.out.println(Double.MIN_VALUE);
        //return true
        System.out.println(Double.MIN_VALUE>0);
    }
}
