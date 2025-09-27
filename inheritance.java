class A {
    int a = 9;
    void display(){
        System.out.println("Value of a is: " + a);
    }
}
class B extends A {
    void display(){
        super.display();
        System.out.println("this is class b");
        System.out.println(super.a);
    }
}

public class inheritance {
    public static void main(String[] args) {
        B obj1 = new B();
        obj1.display();
    }
}
