public class Kruh extends GeometrickyUtvar{
    private double polomer;

    public Kruh(double polomer) {
        this.polomer = polomer;
    }

    @Override
    public double spoctiObvod() {
        return 2 * Math.PI * polomer;
    }

    @Override
    public double spoctiObsah() {
        return Math.PI * polomer * polomer;
    }
}
