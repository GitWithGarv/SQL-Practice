class Student {
    String name;
    int roll;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
    }
}

public class classes {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Garv";
        s1.roll = 20;
        s1.display();

        Student s2 = new Student();
        s2.name = "Aman";
        s2.roll = 30;
        s2.display();
    }
}