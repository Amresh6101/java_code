/*class A {
    void m1() {
        System.out.println("A:m1");
    }

}

class B {
    void m1() {
        System.out.println("B:m1");
    }
}

class C extends A{
   
}
class D extends B{

}
// here we can not acheive multiple inheritance through class level
*/
// multiple inheritance through interface
interface I11 {
    default void m1() {
        System.out.println("I1 m1 method");
    }
}

interface I21 {
    default void m1() {
        System.out.println("I2 method");
    }
}

class A11 implements I11, I21 {
    public void m1() {
        I11.super.m1();
    }

}

public class Multi {
    public static void main(String[] args) {

        I21 a1 = new A11();
        a1.m1();
    }
}
