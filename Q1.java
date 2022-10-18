package Practice;
public class Q1 {
    public static void main(String[] args) {
        Complex a = new Complex(1,2);
        Complex b = new Complex(2,1);
        a = a.sub(a,b);
        a.display();
    }
}
class Complex
{
    int real,imaginary;
    Complex(int a,int b)
    {
        real = a;
        imaginary = b;
    }
    Complex add(Complex a,Complex b)
    {
        Complex c = new Complex(0,0);
        c.real = a.real + b.real;
        c.imaginary = a.imaginary + b.imaginary;
        return c;
    }
    Complex sub(Complex a,Complex b)
    {
        Complex c = new Complex(0,0);
        c.real = a.real - b.real;
        c.imaginary = a.imaginary - b.imaginary;
        return c;
    }
    void display()
    {
        System.out.println(real+"+ i "+imaginary);
    }
}

