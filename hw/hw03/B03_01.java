class Complex {
    private double re;
    private double im;

    public Complex() {
        this.re = 0;
        this.im = 0;
    }

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public Complex(Complex other) {
        this.re = other.re;
        this.im = other.im;
    }

    public double getRe() { return re; }
    public double getIm() { return im; }
    public void setRe(double re) { this.re = re; }
    public void setIm(double im) { this.im = im; }

    // додавання
    public Complex add(Complex c) {
        return new Complex(this.re + c.re, this.im + c.im);
    }

    // віднімання
    public Complex sub(Complex c) {
        return new Complex(this.re - c.re, this.im - c.im);
    }

    // множення
    public Complex mul(Complex c) {
        double r = this.re * c.re - this.im * c.im;
        double i = this.re * c.im + this.im * c.re;
        return new Complex(r, i);
    }

    // ділення
    public Complex div(Complex c) {
        double denom = c.re * c.re + c.im * c.im;
        double r = (this.re * c.re + this.im * c.im) / denom;
        double i = (this.im * c.re - this.re * c.im) / denom;
        return new Complex(r, i);
    }

    public static Complex productArray(Complex[] arr) {
        Complex res = new Complex(1, 0);
        for (Complex c : arr) {
            res = res.mul(c);
        }
        return res;
    }

    @Override
    public String toString() {
        if (im >= 0)
            return re + " + " + im + "i";
        else
            return re + " - " + (-im) + "i";
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Complex) {
            Complex c = (Complex) o;
            return this.re == c.re && this.im == c.im;
        }
        return false;
    }
}

public class B03_01 {
    public static void main(String[] args) {
        Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(c1);
        Complex c3 = new Complex();

        System.out.println("c1 = " + c1);
        System.out.println("c2 (копія c1) = " + c2);
        System.out.println("c3 (за замовчуванням) = " + c3);

        Complex[] arr = {new Complex(1, 1), new Complex(2, -1), new Complex(0, 2)};
        System.out.println("Добуток масиву = " + Complex.productArray(arr));
    }
}
