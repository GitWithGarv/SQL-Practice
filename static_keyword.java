class Student2 {
    static String college = "ITER"; // static variable to keep track of number of objects
    String name;
    int roll;

    Student2(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
    void display() {
        System.out.println("Name: " + name + " Roll: " + roll + " College: " + college);
    }
}

public class static_keyword {
    public static void main(String[] args) {
        Student2 s1 = new Student2("Alice", 101);
        s1.display();
    }
}

//static variable is used for memory management
//static method can be called without creating object so that is why main method is static.