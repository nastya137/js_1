public class ComplexNumber {
    private double real;
    private double imag;
    ComplexNumber Division (ComplexNumber a, ComplexNumber b) {
        ComplexNumber c = new ComplexNumber();
        c.real = (a.real * b.real + a.imag * b.imag)/(b.real * b.real + b.imag * b.imag);
        c.imag = (a.imag * b.real + a.real * b.imag)/(b.real * b.real + b.imag * b.imag);
        return c;
    }
}
