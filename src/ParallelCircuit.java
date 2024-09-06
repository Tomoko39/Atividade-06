public class ParallelCircuit extends CompositeCircuit {
    public ParallelCircuit(Circuit[] circuits) {
        super(circuits);
    }

    public double getResistance() {
        double transmittance = 0;
        for (Circuit c: circuits) {
            transmittance += 1/c.getResistance();
        }
        return 1/transmittance;
    }
}
