package Calculator;

public class ComplexNumber {

    /**
     * Creating a field of the real part of the number Re(z)
     */
    private double real;
    /**
     * Creating a field of the imaginary part of the number Im(z)
     */
    private double imaginary;

    /**
     * Constructor class
     * @param real
     * @param imaginary
     */
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    /**
     *Constructor of a class without arguments
     */
    public ComplexNumber() {
        this.real = 0.0;
        this.imaginary = 0.0;
    }

    /**
     * Returning a value real
     * @return
     */
    public double getReal() {
        return real;
    }

    /**
     * Setting the value real
     * @param real
     */

    public void setReal(double real) {
        this.real = real;
    }

    /**
     * Returning a value Imaginary
     * @return
     */
    public double getImaginary() {
        return imaginary;
    }

    /**
     * Setting the value real
     * @param imaginary
     */
    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {
        if(imaginary < 0) {
            return "z = " + real + imaginary + 'i' + "\n";
        }else {
            return "z = " + real + "+" + imaginary + 'i' + "\n";
        }
    }
}
