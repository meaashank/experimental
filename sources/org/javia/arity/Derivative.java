package org.javia.arity;

/* JADX INFO: loaded from: classes6.dex */
public class Derivative extends Function {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final double f226139H = 1.0E-12d;
    private static final double INVH = 1.0E12d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Complex f226140c = new Complex();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Function f226141f;

    public Derivative(Function function) throws ArityException {
        this.f226141f = function;
        function.checkArity(1);
    }

    @Override // org.javia.arity.Function
    public int arity() {
        return 1;
    }

    @Override // org.javia.arity.Function
    public double eval(double d10) {
        return this.f226141f.eval(this.f226140c.set(d10, f226139H)).im * INVH;
    }
}
