public class Ctverec extends GeometrickyUtvar{
    private double strana;

    public Ctverec(double strana) {
        this.strana = strana;
    }

    @Override
    public double spoctiObvod() {
        return 4 * strana;
    }

    @Override
    public double spoctiObsah() {
        return strana * strana;
    }
}
