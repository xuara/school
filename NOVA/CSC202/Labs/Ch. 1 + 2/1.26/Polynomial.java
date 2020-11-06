package e126.pkg;

// @author Michael Kester
public class Polynomial {

    int degree, coeff;
    double[] coefficients;

    public Polynomial(int degree) {
        this.degree = degree;
        coefficients = new double[degree + 1];
        for (int i = 0; i <= degree; i++) {
            coefficients[i] = 0;
        }
    }

    public void setCoefficient(int deg, int coeff) {
        coefficients[deg] = coeff;
    }

    public float evaluate(float x) {
        float value = (float) coefficients[0];

        double exponent = 1;
        for (int i = 1; i < coefficients.length; i++) {
            value += coefficients[i] * Math.pow(x, exponent);
            exponent++;
        }
        return value;
    }

    public void displayPoly() {
        System.out.print(degree);
        for (int i = coefficients.length - 1; i >= 0; i--) {
            System.out.print(" " + coefficients[i]);
        }
        System.out.println();
    }

    public float getCoefficient(int i) {
        return (float) coefficients[i];
    }

    public int getDegree() {
        return degree;
    }
}
