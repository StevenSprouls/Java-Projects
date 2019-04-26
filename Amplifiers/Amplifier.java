public abstract class Amplifier {

    double R1, R2;

    public Amplifier(double R1, double R2) {
        this.R1 = R1;
        this.R2 = R2;
    }

    public abstract String getDescription();

    public abstract double getGain();

}