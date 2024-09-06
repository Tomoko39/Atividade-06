public class SerialCircuit extends CompositeCircuit {
    public SerialCircuit(Circuit[] circuits) {
        super(circuits);
    }

    public double getResistance() {
        double resistance = 0;
        for (Circuit c : circuits) {
            resistance += c.getResistance();
        }
        return resistance;
    }
}
