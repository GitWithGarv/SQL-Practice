class Students{
    String name;
    int roll;
    Students(String name, int roll){           //parameterised constructor
        this.name = name;
        this.roll = roll;
    }

//    Students(){                                // non parameterised constructor
//        this.name = "Garv";
//        this.roll = 20;
//    }

    Students(Students s1){                       // copy constructor
        this.name = s1.name;
        this.roll = s1.roll;
    }

    void display(){
        System.out.println(name);
        System.out.println(roll);
    }

}

public class constructors {
    public static void main(String[] args) {
        Students s1 = new Students("aman",20);
        s1.display();
        Students s2 = new Students(s1);

        s2.display();
    }
}
