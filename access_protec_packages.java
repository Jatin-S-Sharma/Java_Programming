// Package 1: p1
package p1;

public class ClassA {
    private int privateVar = 10;
    int defaultVar = 20;
    protected int protectedVar = 30;
    public int publicVar = 40;

    private void privateMethod() {
        System.out.println("ClassA: privateMethod()");
    }

    void defaultMethod() {
        System.out.println("ClassA: defaultMethod()");
    }

    protected void protectedMethod() {
        System.out.println("ClassA: protectedMethod()");
    }

    public void publicMethod() {
        System.out.println("ClassA: publicMethod()");
    }
}

class ClassB {
    public static void main(String[] args) {
        ClassA obj = new ClassA();
        System.out.println("ClassA.privateVar: " + obj.privateVar);  // Compile error: privateVar is not visible
        System.out.println("ClassA.defaultVar: " + obj.defaultVar);
        System.out.println("ClassA.protectedVar: " + obj.protectedVar);
        System.out.println("ClassA.publicVar: " + obj.publicVar);

        obj.privateMethod();  // Compile error: privateMethod() is not visible
        obj.defaultMethod();
        obj.protectedMethod();
        obj.publicMethod();
    }
}




//second package for checking how access modifiers works
// Package 2: p2
package p2;

import p1.ClassA;

class ClassC extends ClassA {
    public static void main(String[] args) {
        ClassC obj = new ClassC();
        System.out.println("ClassA.privateVar: " + obj.privateVar);  // Compile error: privateVar is not visible
        System.out.println("ClassA.defaultVar: " + obj.defaultVar);  // Compile error: defaultVar is not visible
        System.out.println("ClassA.protectedVar: " + obj.protectedVar);
        System.out.println("ClassA.publicVar: " + obj.publicVar);

        obj.privateMethod();  // Compile error: privateMethod() is not visible
        obj.defaultMethod();  // Compile error: defaultMethod() is not visible
        obj.protectedMethod();
        obj.publicMethod();
    }
}
