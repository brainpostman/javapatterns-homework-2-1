public class IntsCalculator implements Ints {

    protected final Calculator calc;

    public IntsCalculator() {
        this.calc = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        Calculator.Formula form = calc.newFormula();
        return (int) form.addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result();
    }

    @Override
    public int mult(int arg0, int arg1) {
        Calculator.Formula form = calc.newFormula();
        return (int) form.addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result();
    }

    @Override
    public int pow(int a, int b) {
        Calculator.Formula form = calc.newFormula();
        return (int) form.addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result();
    }
}
