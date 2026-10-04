package org.javia.arity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Function {
    private Function cachedDerivate = null;
    String comment;

    public abstract int arity();

    public void checkArity(int i10) throws ArityException {
        if (arity() == i10) {
            return;
        }
        throw new ArityException("Expected " + arity() + " arguments, got " + i10);
    }

    public double eval() {
        throw new ArityException(0);
    }

    public Complex evalComplex() {
        checkArity(0);
        return new Complex(eval(), 0.0d);
    }

    public Function getDerivative() {
        if (this.cachedDerivate == null) {
            this.cachedDerivate = new Derivative(this);
        }
        return this.cachedDerivate;
    }

    public void setDerivative(Function function) {
        this.cachedDerivate = function;
    }

    public double eval(double d10) {
        throw new ArityException(1);
    }

    public double eval(double d10, double d11) {
        throw new ArityException(2);
    }

    public double eval(double[] dArr) {
        int length = dArr.length;
        if (length == 0) {
            return eval();
        }
        if (length == 1) {
            return eval(dArr[0]);
        }
        if (length == 2) {
            return eval(dArr[0], dArr[1]);
        }
        throw new ArityException(dArr.length);
    }

    public Complex eval(Complex complex) {
        checkArity(1);
        return new Complex(complex.im == 0.0d ? eval(complex.re) : Double.NaN, 0.0d);
    }

    public Complex eval(Complex complex, Complex complex2) {
        checkArity(2);
        return new Complex((complex.im == 0.0d && complex2.im == 0.0d) ? eval(complex.re, complex2.re) : Double.NaN, 0.0d);
    }

    public Complex eval(Complex[] complexArr) {
        int length = complexArr.length;
        if (length == 0) {
            return evalComplex();
        }
        if (length == 1) {
            return eval(complexArr[0]);
        }
        if (length != 2) {
            int length2 = complexArr.length;
            checkArity(length2);
            double[] dArr = new double[length2];
            for (int length3 = complexArr.length - 1; length3 >= 0; length3--) {
                Complex complex = complexArr[length3];
                if (complex.im != 0.0d) {
                    return new Complex(Double.NaN, 0.0d);
                }
                dArr[length3] = complex.re;
            }
            return new Complex(eval(dArr), 0.0d);
        }
        return eval(complexArr[0], complexArr[1]);
    }
}
