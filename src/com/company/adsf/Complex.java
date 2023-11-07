public class Complex {
    private double real;
    private double imaginary;
    private boolean isFinal;

    static Complex ZERO = new Complex(0,0,true);
    static Complex ONE = new Complex(1,true);
    static Complex I = new Complex(0,1,true);
    public Complex(double real){
        this.real = real;
        imaginary = 0;
    }
    public Complex(double real,boolean isFinal){
        this.real = real;
        imaginary = 0;
        this.isFinal = isFinal;
    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public Complex(double real, double imaginary,boolean isFinal) {
        this.real = real;
        this.imaginary = imaginary;
        this.isFinal = isFinal;
    }

    @Override
    public String toString() {
        return real + imaginary+"i";
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        if (isFinal){
            throw new UnsupportedOperationException("This complex number is final");
        }
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        if (isFinal){
            throw new UnsupportedOperationException("This complex number is final");
        }
        this.imaginary = imaginary;
    }

    public void set(double real, double imaginary){
        if (isFinal){
            throw new UnsupportedOperationException("This complex number is final");
        }
        this.real = real;
        this.imaginary = imaginary;
    }

    public boolean getIsFinal(){
        return isFinal;
    }

    public Complex add(Complex c){
        return new Complex(this.real+c.real,this.imaginary+c.imaginary);
    }

    public Complex mult(Complex c){
        return new Complex((this.real*c.real)-(this.imaginary*c.imaginary),(this.real*c.imaginary)+(c.real-this.imaginary));
    }


}

