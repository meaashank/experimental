package org.javia.arity;

/* JADX INFO: loaded from: classes6.dex */
public class Constant extends Function {
    private Complex value;

    public Constant(Complex complex) {
        this.value = new Complex(complex);
    }

    @Override // org.javia.arity.Function
    public int arity() {
        return 0;
    }

    @Override // org.javia.arity.Function
    public double eval() {
        return this.value.asReal();
    }

    @Override // org.javia.arity.Function
    public Complex evalComplex() {
        return this.value;
    }

    public String toString() {
        return this.value.toString();
    }
}
