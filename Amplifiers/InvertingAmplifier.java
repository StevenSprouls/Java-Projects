public class InvertingAmplifier extends Amplifier {

    public InvertingAmplifier(double R1, double R2) {
        super(R1, R2);
    }

    @Override
    public String getDescription() {
        return "Inverting Amplifiers: R1 = " + R1 + " R2 = " + R2;
    }

    @Override
    public double getGain() {
        return (-(R2/R1));
    }
}