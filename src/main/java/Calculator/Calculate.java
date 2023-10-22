package Calculator;

public class Calculate implements Add, Subtract, Multiply {
    /**
     * Method of finding the sum of complex numbers
     * @param z1 - complex number
     * @param z2 - complex number
     * @return new complex number
     */
    @Override
    public ComplexNumber add(ComplexNumber z1, ComplexNumber z2) {
        return new ComplexNumber(z1.getReal()+z2.getReal(),
                z1.getImaginary() + z2.getImaginary());
    }

    /**
     * Method of multiplication of complex numbers
     * @param z1 - complex number
     * @param z2 - complex number
     * @return new complex number
     */
    @Override
    public ComplexNumber multiply(ComplexNumber z1, ComplexNumber z2) {
        double _real = z1.getReal()*z2.getReal() - z1.getImaginary()*z2.getImaginary();
        double _imaginary = z1.getReal()*z2.getImaginary() + z1.getImaginary()*z2.getReal();
        return new ComplexNumber(_real,_imaginary);
    }

    /**
     *The method of subtracting complex numbers
     * @param z1 - complex number
     * @param z2 - complex number
     * @return new complex number
     */
    @Override
    public ComplexNumber subtract(ComplexNumber z1, ComplexNumber z2) {
        return new ComplexNumber(z1.getReal() - z2.getReal(),
                z1.getImaginary() - z2.getImaginary());
    }
}
