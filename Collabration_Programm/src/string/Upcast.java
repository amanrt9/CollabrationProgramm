package string;

interface I {
    void methodI();
}

class A {
    void methodA() {
        System.out.println("Method A");
    }
}

class B extends A implements I {
    public void methodI() {
        System.out.println("Method I");
    }
    public void method2() {
    	System.out.println("class");
    }
}

public class Upcast {
    public static void main(String[] args) {
        A a = new B(); // Upcasting B to A
        I i = new B(); // Upcasting B to I

        // Access methods using upcasted references
        a.methodA(); // Output: Method A
        // a.methodI(); // This would not compile, as 'a' is of type A, not I
      
        i.methodI(); // Output: Method I
        // i.methodA(); // This would not compile, as 'i' is of type I, not A
     // i.method2();
        ((B) a).method2();
    }
}
