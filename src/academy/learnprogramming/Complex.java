package academy.learnprogramming;

public class Complex {

    private final double real;
    private final double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public static Complex plus(Complex a, Complex b) {
//        double real = a.real + b.real;
//        double imaginary = a.imaginary + b.imaginary;
//        return new Complex(real, imaginary);
        return a.plus(b);
    }

    public static void main(String[] args) {
        Complex a = new Complex(5.0, 6.0);
        Complex b = new Complex(-3.0, 4.0);

        Complex bPlusA = Complex.plus(a, b);

        System.out.println("a real= " + a.real + " imaginary= " + a.imaginary);
        System.out.println("b real= " + b.real + " imaginary= " + b.imaginary);
        System.out.println("b + a real= " + bPlusA.real + " imaginary= " + bPlusA.imaginary);
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public Complex plus(Complex b) {
        double newReal = real + b.real;
        double newImaginary = imaginary + b.imaginary;
        return new Complex(newReal, newImaginary);
    }

    public Complex minus(Complex otherComplex) {
        double newReal = real - otherComplex.real;
        double newImaginary = imaginary - otherComplex.imaginary;
        return new Complex(newReal, newImaginary);
    }

    public Complex times(Complex b) {
        double newReal = real * b.real - imaginary * b.imaginary;
        double newImaginary = real * b.imaginary + imaginary * b.real;
        return new Complex(newReal, newImaginary);
    }
}
