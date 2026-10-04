package org.javia.arity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ContextFunction extends Function {
    private static EvalContext context = new EvalContext();
    private static final double[] NO_ARGS = new double[0];
    private static final Complex[] NO_ARGS_COMPLEX = new Complex[0];

    @Override // org.javia.arity.Function
    public double eval() {
        return eval(NO_ARGS);
    }

    public abstract double eval(double[] dArr, EvalContext evalContext);

    public abstract Complex eval(Complex[] complexArr, EvalContext evalContext);

    @Override // org.javia.arity.Function
    public Complex evalComplex() {
        return eval(NO_ARGS_COMPLEX);
    }

    public Complex[] toComplex(double[] dArr, EvalContext evalContext) {
        int length = dArr.length;
        if (length == 0) {
            return NO_ARGS_COMPLEX;
        }
        if (length == 1) {
            Complex[] complexArr = evalContext.args1c;
            complexArr[0].set(dArr[0], 0.0d);
            return complexArr;
        }
        if (length == 2) {
            Complex[] complexArr2 = evalContext.args2c;
            complexArr2[0].set(dArr[0], 0.0d);
            complexArr2[1].set(dArr[1], 0.0d);
            return complexArr2;
        }
        Complex[] complexArr3 = new Complex[dArr.length];
        for (int i10 = 0; i10 < dArr.length; i10++) {
            complexArr3[i10] = new Complex(dArr[i10], 0.0d);
        }
        return complexArr3;
    }

    @Override // org.javia.arity.Function
    public double eval(double d10) {
        double dEval;
        synchronized (context) {
            dEval = eval(d10, context);
        }
        return dEval;
    }

    @Override // org.javia.arity.Function
    public double eval(double d10, double d11) {
        double dEval;
        synchronized (context) {
            dEval = eval(d10, d11, context);
        }
        return dEval;
    }

    @Override // org.javia.arity.Function
    public double eval(double[] dArr) {
        double dEval;
        synchronized (context) {
            dEval = eval(dArr, context);
        }
        return dEval;
    }

    public double eval(double d10, EvalContext evalContext) {
        double[] dArr = evalContext.args1;
        dArr[0] = d10;
        return eval(dArr, evalContext);
    }

    public double eval(double d10, double d11, EvalContext evalContext) {
        double[] dArr = evalContext.args2;
        dArr[0] = d10;
        dArr[1] = d11;
        return eval(dArr, evalContext);
    }

    @Override // org.javia.arity.Function
    public Complex eval(Complex complex) {
        Complex complexEval;
        synchronized (context) {
            complexEval = eval(complex, context);
        }
        return complexEval;
    }

    @Override // org.javia.arity.Function
    public Complex eval(Complex complex, Complex complex2) {
        Complex complexEval;
        synchronized (context) {
            complexEval = eval(complex, complex2, context);
        }
        return complexEval;
    }

    @Override // org.javia.arity.Function
    public Complex eval(Complex[] complexArr) {
        Complex complexEval;
        synchronized (context) {
            complexEval = eval(complexArr, context);
        }
        return complexEval;
    }

    public Complex eval(Complex complex, EvalContext evalContext) {
        Complex[] complexArr = evalContext.args1c;
        complexArr[0] = complex;
        return eval(complexArr, evalContext);
    }

    public Complex eval(Complex complex, Complex complex2, EvalContext evalContext) {
        Complex[] complexArr = evalContext.args2c;
        complexArr[0] = complex;
        complexArr[1] = complex2;
        return eval(complexArr, evalContext);
    }
}
