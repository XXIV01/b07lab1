public class Polynomial{

    double[] coefficients;

    public Polynomial(){
        this.coefficients = new double[]{0};
    }

    public Polynomial(double[] coefficients) {
        this.coefficients = coefficients;
    } 

    public Polynomial add(Polynomial other_poly){
        // The assumption for the MAX_LENGTH for an Array is 1024.
        int maxLength = 1024;
        double[] resultCoefficients = new double[maxLength];

        for (int i = 0; i < maxLength; i++) {
            double firstCoeff = i < this.coefficients.length ? this.coefficients[i] : 0;
            double secondCoeff = i < other_poly.coefficients.length ? other_poly.coefficients[i] : 0;
            resultCoefficients[i] = firstCoeff + secondCoeff;
        }

        return new Polynomial(resultCoefficients);
    }

    public double evaluate(double x) {
        double result = 0;
        for (int i = 0; i < coefficients.length; i++) {
            result += coefficients[i] * Math.pow(x, i);
        }
        return result;
    }
    
    public boolean hasRoot(double x) {
        return evaluate(x) == 0;
    }

}