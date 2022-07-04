interface I1 {
    abstract void m1();

    abstract void m2();

    static void m3() {
        System.out.println("Inteface static method");
    }

    default void m4() {
        System.out.println("Interface Default method");
    }
}

public class FunI implements I1 {
    public void m1() {
        System.out.println("Interface m1");
    }

    public void m2() {
        System.out.println("Interface m2");
    }

    /*
     * public void m4() {
     * System.out.println("m4 overrriding");
     * 
     * }
     */

    public static void main(String[] args) {
        I1 f1 = new FunI();
        f1.m1();
        f1.m2();
        I1.m3();
        f1.m4();
    }
}
