package org.javia.arity;

/* JADX INFO: loaded from: classes6.dex */
class EvalCase {
    static final double ERR = -2.0d;
    static final double FUN = -3.0d;
    Complex cResult;
    String expr;
    double result;

    public EvalCase(String str, double d10) {
        this.expr = str;
        this.result = d10;
    }

    public EvalCase(String str, Complex complex) {
        this.expr = str;
        this.cResult = complex;
    }
}
