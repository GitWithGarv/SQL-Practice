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
    void add(Complex c1, Complex c2){
        this.real = c1.real + c2.real;
        this.img = c1.img + c2.img;
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
        Complex c2 = new Complex();
        c2.real = sc.nextInt();
        c2.img = sc.nextInt();
        c2.getdata(c2.real, c2.img);
        c2.display();
        Complex c3 = new Complex();
        c3.add(c1, c2);
        c3.display();
        sc.close();
    }
}
