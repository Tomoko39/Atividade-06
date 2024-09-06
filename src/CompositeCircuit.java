public abstract class CompositeCircuit implements Circuit {
    protected final Circuit[] circuits;
    public CompositeCircuit (Circuit[] circuits) {
        Circuit[] c = new Circuit[circuits.length];
        for (int i = 0; i < circuits.length; i++) {
            c[i] = circuits[i];
        }
        this.circuits = c;
    }

    protected Circuit[] getCircuits() {
        Circuit[] c = new Circuit[circuits.length];
        for (int i = 0; i < circuits.length; i++) {
            c[i] = circuits[i];
        } 
        return c;
    }
}
