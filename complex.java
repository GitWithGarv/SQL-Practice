import java.util.*;
class Complex{
    int real;
    int img;

    void getdata(int real, int img){
        this.real = real;
        this.img = img;
    }
    void display(){
        System.out.println(real + " + " + img + "i");
    }
}

public class complex {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter real and imaginary part of complex number");
        Complex c1 = new Complex();
        c1.real = sc.nextInt();
        c1.img = sc.nextInt();
        c1.getdata(c1.real, c1.img);
        c1.display();
        sc.close();
    }
}
