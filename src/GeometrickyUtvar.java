public abstract class GeometrickyUtvar {
    public abstract double spoctiObvod();
    public abstract double spoctiObsah();

    public double spoctiDeleniObvoduAObsahu(){
        return spoctiObvod() / spoctiObsah();
    }
}
