public class NoninvertingAmplifier extends Amplifier {
    public NoninvertingAmplifier(double R1, double R2) {
        super(R1, R2);
    }

    @Override
    public String getDescription() {
        return "Noninverting Amplifiers: R1 = " + R1 + " R2 = " + R2;
    }

    @Override
    public double getGain() {
        return 1+(R2/R1);
    }
}