package org.javia.arity;

/* JADX INFO: loaded from: classes6.dex */
public class EvalContext {
    static final int MAX_STACK_SIZE = 128;
    Complex[] args1c;
    Complex[] args2c;
    double[] stackRe = new double[128];
    final Complex[] stackComplex = new Complex[128];
    int stackBase = 0;
    double[] args1 = new double[1];
    double[] args2 = new double[2];

    public EvalContext() {
        for (int i10 = 0; i10 < 128; i10++) {
            this.stackComplex[i10] = new Complex();
        }
        this.args1c = new Complex[]{new Complex()};
        this.args2c = new Complex[]{new Complex(), new Complex()};
    }
}
