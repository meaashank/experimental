package org.javia.arity;

import U6.j;
import android.support.v4.media.c;
import androidx.compose.foundation.text.C1758e;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
public class CompiledFunction extends ContextFunction {
    private final int arity;
    private final byte[] code;
    private final double[] constsIm;
    private final double[] constsRe;
    private final Function[] funcs;
    private static final IsComplexException IS_COMPLEX = new IsComplexException();
    private static final Random random = new Random();
    private static final double[] EMPTY_DOUBLE = new double[0];
    private static final Function[] EMPTY_FUN = new Function[0];

    public CompiledFunction(int i10, byte[] bArr, double[] dArr, double[] dArr2, Function[] functionArr) {
        this.arity = i10;
        this.code = bArr;
        this.constsRe = dArr;
        this.constsIm = dArr2;
        this.funcs = functionArr;
    }

    private double evalComplexToReal(double[] dArr, EvalContext evalContext) {
        return eval(toComplex(dArr, evalContext), evalContext).asReal();
    }

    private int execComplex(EvalContext evalContext, int i10) {
        int i11 = i10 + 1;
        int iExecWithoutCheckComplex = execWithoutCheckComplex(evalContext, i10, -2);
        if (iExecWithoutCheckComplex != i11) {
            throw new Error(C1758e.a("Stack pointer after exec: expected ", i11, ", got ", iExecWithoutCheckComplex));
        }
        Complex[] complexArr = evalContext.stackComplex;
        complexArr[iExecWithoutCheckComplex - this.arity].set(complexArr[iExecWithoutCheckComplex]);
        return iExecWithoutCheckComplex - this.arity;
    }

    private int execReal(EvalContext evalContext, int i10) throws IsComplexException {
        int i11 = i10 + 1;
        int iExecWithoutCheck = execWithoutCheck(evalContext, i10);
        if (iExecWithoutCheck != i11) {
            throw new Error(C1758e.a("Stack pointer after exec: expected ", i11, ", got ", iExecWithoutCheck));
        }
        double[] dArr = evalContext.stackRe;
        int i12 = this.arity;
        dArr[iExecWithoutCheck - i12] = dArr[iExecWithoutCheck];
        return iExecWithoutCheck - i12;
    }

    public static Function makeOpFunction(int i10) {
        byte[] bArr = VM.arity;
        byte b10 = bArr[i10];
        if (b10 != 1) {
            throw new Error("makeOpFunction expects arity 1, found " + ((int) bArr[i10]));
        }
        double[] dArr = EMPTY_DOUBLE;
        CompiledFunction compiledFunction = new CompiledFunction(b10, new byte[]{38, (byte) i10}, dArr, dArr, EMPTY_FUN);
        if (i10 == 29) {
            compiledFunction.setDerivative(new Function() { // from class: org.javia.arity.CompiledFunction.1
                @Override // org.javia.arity.Function
                public int arity() {
                    return 1;
                }

                @Override // org.javia.arity.Function
                public double eval(double d10) {
                    if (d10 > 0.0d) {
                        return 1.0d;
                    }
                    return d10 < 0.0d ? -1.0d : 0.0d;
                }
            });
        }
        return compiledFunction;
    }

    @Override // org.javia.arity.Function
    public int arity() {
        return this.arity;
    }

    @Override // org.javia.arity.ContextFunction
    public double eval(double[] dArr, EvalContext evalContext) {
        if (this.constsIm != null) {
            return evalComplexToReal(dArr, evalContext);
        }
        checkArity(dArr.length);
        System.arraycopy(dArr, 0, evalContext.stackRe, evalContext.stackBase, dArr.length);
        try {
            execReal(evalContext, (evalContext.stackBase + dArr.length) - 1);
            return evalContext.stackRe[evalContext.stackBase];
        } catch (IsComplexException unused) {
            return evalComplexToReal(dArr, evalContext);
        }
    }

    public int execWithoutCheck(EvalContext evalContext, int i10) throws IsComplexException {
        int i11;
        double dEval;
        int i12;
        if (this.constsIm != null) {
            throw IS_COMPLEX;
        }
        double[] dArr = evalContext.stackRe;
        int i13 = i10 - this.arity;
        int length = this.code.length;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = -2;
        int iExecReal = i10;
        while (i15 < length) {
            int i19 = this.code[i15];
            double d10 = -1.0d;
            switch (i19) {
                case 1:
                    iExecReal++;
                    dArr[iExecReal] = this.constsRe[i16];
                    i16++;
                    continue;
                    i15++;
                    i14 = 0;
                    break;
                case 2:
                    int i20 = i17 + 1;
                    Function function = this.funcs[i17];
                    if (function instanceof CompiledFunction) {
                        iExecReal = ((CompiledFunction) function).execReal(evalContext, iExecReal);
                        i17 = i20;
                        continue;
                    } else {
                        int iArity = function.arity();
                        int i21 = iExecReal - iArity;
                        int i22 = evalContext.stackBase;
                        int i23 = i21 + 1;
                        try {
                            evalContext.stackBase = i23;
                            if (iArity == 0) {
                                i11 = i20;
                                dEval = function.eval();
                            } else if (iArity == 1) {
                                i11 = i20;
                                dEval = function.eval(dArr[i23]);
                            } else if (iArity != 2) {
                                double[] dArr2 = new double[iArity];
                                System.arraycopy(dArr, i23, dArr2, i14, iArity);
                                dEval = function.eval(dArr2);
                                i11 = i20;
                            } else {
                                i11 = i20;
                                dEval = function.eval(dArr[i23], dArr[i21 + 2]);
                            }
                            evalContext.stackBase = i22;
                            dArr[i23] = dEval;
                            i17 = i11;
                            iExecReal = i23;
                        } catch (Throwable th) {
                            evalContext.stackBase = i22;
                            throw th;
                        }
                    }
                    i15++;
                    i14 = 0;
                    break;
                case 3:
                    i12 = iExecReal - 1;
                    double d11 = dArr[i12];
                    double d12 = (i18 == i15 + (-1) ? dArr[iExecReal] * d11 : dArr[iExecReal]) + d11;
                    dArr[i12] = Math.abs(d12) >= Math.ulp(d11) * 1024.0d ? d12 : 0.0d;
                    break;
                case 4:
                    i12 = iExecReal - 1;
                    double d13 = dArr[i12];
                    double d14 = d13 - (i18 == i15 + (-1) ? dArr[iExecReal] * d13 : dArr[iExecReal]);
                    dArr[i12] = Math.abs(d14) >= Math.ulp(d13) * 1024.0d ? d14 : 0.0d;
                    break;
                case 5:
                    i12 = iExecReal - 1;
                    dArr[i12] = dArr[i12] * dArr[iExecReal];
                    break;
                case 6:
                    i12 = iExecReal - 1;
                    dArr[i12] = dArr[i12] / dArr[iExecReal];
                    break;
                case 7:
                    i12 = iExecReal - 1;
                    dArr[i12] = dArr[i12] % dArr[iExecReal];
                    break;
                case 8:
                    iExecReal++;
                    dArr[iExecReal] = random.nextDouble();
                    continue;
                    i15++;
                    i14 = 0;
                    break;
                case 9:
                    dArr[iExecReal] = -dArr[iExecReal];
                    continue;
                    i15++;
                    i14 = 0;
                    break;
                case 10:
                    i12 = iExecReal - 1;
                    dArr[i12] = Math.pow(dArr[i12], dArr[iExecReal]);
                    break;
                case 11:
                    dArr[iExecReal] = MoreMath.factorial(dArr[iExecReal]);
                    continue;
                    i15++;
                    i14 = 0;
                    break;
                case 12:
                    dArr[iExecReal] = dArr[iExecReal] * 0.01d;
                    i18 = i15;
                    continue;
                    i15++;
                    i14 = 0;
                    break;
                case 13:
                    double d15 = dArr[iExecReal];
                    if (d15 < 0.0d) {
                        throw IS_COMPLEX;
                    }
                    dArr[iExecReal] = Math.sqrt(d15);
                    continue;
                    i15++;
                    i14 = 0;
                    break;
                    break;
                case 14:
                    dArr[iExecReal] = Math.cbrt(dArr[iExecReal]);
                    continue;
                    i15++;
                    i14 = 0;
                    break;
                case 15:
                    dArr[iExecReal] = Math.exp(dArr[iExecReal]);
                    continue;
                    i15++;
                    i14 = 0;
                    break;
                case 16:
                    dArr[iExecReal] = Math.log(dArr[iExecReal]);
                    continue;
                    i15++;
                    i14 = 0;
                    break;
                case 17:
                    dArr[iExecReal] = MoreMath.sin(dArr[iExecReal]);
                    continue;
                    i15++;
                    i14 = 0;
                    break;
                case 18:
                    dArr[iExecReal] = MoreMath.cos(dArr[iExecReal]);
                    continue;
                    i15++;
                    i14 = 0;
                    break;
                case 19:
                    dArr[iExecReal] = MoreMath.tan(dArr[iExecReal]);
                    continue;
                    i15++;
                    i14 = 0;
                    break;
                case 20:
                    double d16 = dArr[iExecReal];
                    if (d16 < -1.0d || d16 > 1.0d) {
                        throw IS_COMPLEX;
                    }
                    dArr[iExecReal] = Math.asin(d16);
                    continue;
                    i15++;
                    i14 = 0;
                    break;
                case 21:
                    double d17 = dArr[iExecReal];
                    if (d17 < -1.0d || d17 > 1.0d) {
                        throw IS_COMPLEX;
                    }
                    dArr[iExecReal] = Math.acos(d17);
                    continue;
                    i15++;
                    i14 = 0;
                    break;
                case 22:
                    dArr[iExecReal] = Math.atan(dArr[iExecReal]);
                    continue;
                    i15++;
                    i14 = 0;
                    break;
                case 23:
                    dArr[iExecReal] = Math.sinh(dArr[iExecReal]);
                    continue;
                    i15++;
                    i14 = 0;
                    break;
                case 24:
                    dArr[iExecReal] = Math.cosh(dArr[iExecReal]);
                    continue;
                    i15++;
                    i14 = 0;
                    break;
                case 25:
                    dArr[iExecReal] = Math.tanh(dArr[iExecReal]);
                    continue;
                    i15++;
                    i14 = 0;
                    break;
                case 26:
                    dArr[iExecReal] = MoreMath.asinh(dArr[iExecReal]);
                    continue;
                    i15++;
                    i14 = 0;
                    break;
                case 27:
                    dArr[iExecReal] = MoreMath.acosh(dArr[iExecReal]);
                    continue;
                    i15++;
                    i14 = 0;
                    break;
                case 28:
                    dArr[iExecReal] = MoreMath.atanh(dArr[iExecReal]);
                    continue;
                    i15++;
                    i14 = 0;
                    break;
                case 29:
                    dArr[iExecReal] = Math.abs(dArr[iExecReal]);
                    continue;
                    i15++;
                    i14 = 0;
                    break;
                case 30:
                    dArr[iExecReal] = Math.floor(dArr[iExecReal]);
                    continue;
                    i15++;
                    i14 = 0;
                    break;
                case 31:
                    dArr[iExecReal] = Math.ceil(dArr[iExecReal]);
                    continue;
                    i15++;
                    i14 = 0;
                    break;
                case 32:
                    double d18 = dArr[iExecReal];
                    if (d18 > 0.0d) {
                        d10 = 1.0d;
                    } else if (d18 >= 0.0d) {
                        d10 = 0.0d;
                    }
                    dArr[iExecReal] = d10;
                    continue;
                    i15++;
                    i14 = 0;
                    break;
                case 33:
                    i12 = iExecReal - 1;
                    dArr[i12] = Math.min(dArr[i12], dArr[iExecReal]);
                    break;
                case 34:
                    i12 = iExecReal - 1;
                    dArr[i12] = Math.min(dArr[i12], dArr[iExecReal]);
                    break;
                case 35:
                    i12 = iExecReal - 1;
                    dArr[i12] = MoreMath.gcd(dArr[i12], dArr[iExecReal]);
                    break;
                case 36:
                    i12 = iExecReal - 1;
                    dArr[i12] = MoreMath.combinations(dArr[i12], dArr[iExecReal]);
                    break;
                case 37:
                    i12 = iExecReal - 1;
                    dArr[i12] = MoreMath.permutations(dArr[i12], dArr[iExecReal]);
                    break;
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                    iExecReal++;
                    dArr[iExecReal] = dArr[(i19 + i13) - 37];
                    continue;
                    i15++;
                    i14 = 0;
                    break;
                default:
                    throw new Error(c.a("Unknown opcode ", i19));
            }
            iExecReal = i12;
            i15++;
            i14 = 0;
        }
        return iExecReal;
    }

    /* JADX WARN: Finally extract failed */
    public int execWithoutCheckComplex(EvalContext evalContext, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int iExecComplex;
        int i15;
        int i16;
        Complex complex;
        int i17;
        int i18;
        Complex[] complexArr = evalContext.stackComplex;
        int i19 = i10 - this.arity;
        int length = this.code.length;
        int i20 = i10;
        int i21 = i11;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        while (i22 < length) {
            int i25 = this.code[i22];
            switch (i25) {
                case 1:
                    int i26 = i22;
                    int i27 = i20;
                    i12 = i26;
                    i13 = i19;
                    i14 = length;
                    int i28 = i23;
                    iExecComplex = i27 + 1;
                    Complex complex2 = complexArr[iExecComplex];
                    int i29 = i24;
                    double d10 = this.constsRe[i28];
                    double[] dArr = this.constsIm;
                    complex2.set(d10, dArr != null ? dArr[i28] : 0.0d);
                    i23 = i28 + 1;
                    i24 = i29;
                    i22 = i12 + 1;
                    i20 = iExecComplex;
                    i19 = i13;
                    length = i14;
                    break;
                case 2:
                    i13 = i19;
                    i14 = length;
                    int i30 = i20;
                    i12 = i22;
                    int i31 = i23;
                    int i32 = i24 + 1;
                    Function function = this.funcs[i24];
                    if (function instanceof CompiledFunction) {
                        iExecComplex = ((CompiledFunction) function).execComplex(evalContext, i30);
                        i23 = i31;
                        i24 = i32;
                        i22 = i12 + 1;
                        i20 = iExecComplex;
                        i19 = i13;
                        length = i14;
                    } else {
                        int iArity = function.arity();
                        int i33 = i30 - iArity;
                        int i34 = evalContext.stackBase;
                        i15 = i33 + 1;
                        try {
                            evalContext.stackBase = i15;
                            if (iArity != 0) {
                                if (iArity == 1) {
                                    complex = function.eval(complexArr[i15]);
                                } else if (iArity != 2) {
                                    Complex[] complexArr2 = new Complex[iArity];
                                    System.arraycopy(complexArr, i15, complexArr2, 0, iArity);
                                    complex = function.eval(complexArr2);
                                } else {
                                    complex = function.eval(complexArr[i15], complexArr[i33 + 2]);
                                }
                                i16 = i32;
                            } else {
                                i16 = i32;
                                complex = new Complex(function.eval(), 0.0d);
                            }
                            evalContext.stackBase = i34;
                            complexArr[i15].set(complex);
                            i24 = i16;
                            i23 = i31;
                            iExecComplex = i15;
                            i22 = i12 + 1;
                            i20 = iExecComplex;
                            i19 = i13;
                            length = i14;
                        } catch (Throwable th) {
                            evalContext.stackBase = i34;
                            throw th;
                        }
                    }
                    break;
                case 3:
                    i13 = i19;
                    i14 = length;
                    int i35 = i20;
                    i12 = i22;
                    i17 = i23;
                    iExecComplex = i35 - 1;
                    Complex complex3 = complexArr[iExecComplex];
                    complex3.add(i21 == i12 + (-1) ? complexArr[i35].mul(complex3) : complexArr[i35]);
                    i23 = i17;
                    i22 = i12 + 1;
                    i20 = iExecComplex;
                    i19 = i13;
                    length = i14;
                    break;
                case 4:
                    i13 = i19;
                    i14 = length;
                    int i36 = i20;
                    i12 = i22;
                    i17 = i23;
                    iExecComplex = i36 - 1;
                    Complex complex4 = complexArr[iExecComplex];
                    complex4.sub(i21 == i12 + (-1) ? complexArr[i36].mul(complex4) : complexArr[i36]);
                    i23 = i17;
                    i22 = i12 + 1;
                    i20 = iExecComplex;
                    i19 = i13;
                    length = i14;
                    break;
                case 5:
                    i13 = i19;
                    i14 = length;
                    int i37 = i20;
                    i12 = i22;
                    iExecComplex = i37 - 1;
                    complexArr[iExecComplex].mul(complexArr[i37]);
                    i22 = i12 + 1;
                    i20 = iExecComplex;
                    i19 = i13;
                    length = i14;
                    break;
                case 6:
                    i13 = i19;
                    i14 = length;
                    int i38 = i20;
                    i12 = i22;
                    iExecComplex = i38 - 1;
                    complexArr[iExecComplex].div(complexArr[i38]);
                    i22 = i12 + 1;
                    i20 = iExecComplex;
                    i19 = i13;
                    length = i14;
                    break;
                case 7:
                    i13 = i19;
                    i14 = length;
                    int i39 = i20;
                    i12 = i22;
                    iExecComplex = i39 - 1;
                    complexArr[iExecComplex].mod(complexArr[i39]);
                    i22 = i12 + 1;
                    i20 = iExecComplex;
                    i19 = i13;
                    length = i14;
                    break;
                case 8:
                    i13 = i19;
                    i14 = length;
                    int i40 = i20;
                    i12 = i22;
                    i17 = i23;
                    iExecComplex = i40 + 1;
                    complexArr[iExecComplex].set(random.nextDouble(), 0.0d);
                    i23 = i17;
                    i22 = i12 + 1;
                    i20 = iExecComplex;
                    i19 = i13;
                    length = i14;
                    break;
                case 9:
                    i13 = i19;
                    i14 = length;
                    i18 = i20;
                    i12 = i22;
                    i17 = i23;
                    complexArr[i18].negate();
                    iExecComplex = i18;
                    i23 = i17;
                    i22 = i12 + 1;
                    i20 = iExecComplex;
                    i19 = i13;
                    length = i14;
                    break;
                case 10:
                    i13 = i19;
                    i14 = length;
                    int i41 = i20;
                    i12 = i22;
                    iExecComplex = i41 - 1;
                    complexArr[iExecComplex].pow(complexArr[i41]);
                    i22 = i12 + 1;
                    i20 = iExecComplex;
                    i19 = i13;
                    length = i14;
                    break;
                case 11:
                    i13 = i19;
                    i14 = length;
                    i18 = i20;
                    i12 = i22;
                    i17 = i23;
                    complexArr[i18].factorial();
                    iExecComplex = i18;
                    i23 = i17;
                    i22 = i12 + 1;
                    i20 = iExecComplex;
                    i19 = i13;
                    length = i14;
                    break;
                case 12:
                    i13 = i19;
                    i14 = length;
                    int i42 = i20;
                    i12 = i22;
                    complexArr[i42].mul(0.01d);
                    iExecComplex = i42;
                    i21 = i12;
                    i22 = i12 + 1;
                    i20 = iExecComplex;
                    i19 = i13;
                    length = i14;
                    break;
                case 13:
                    i13 = i19;
                    i14 = length;
                    i18 = i20;
                    i12 = i22;
                    i17 = i23;
                    complexArr[i18].sqrt();
                    iExecComplex = i18;
                    i23 = i17;
                    i22 = i12 + 1;
                    i20 = iExecComplex;
                    i19 = i13;
                    length = i14;
                    break;
                case 14:
                    i13 = i19;
                    i14 = length;
                    i18 = i20;
                    i12 = i22;
                    i17 = i23;
                    complexArr[i18].pow(new Complex(3.3333333333333335d, 0.0d));
                    iExecComplex = i18;
                    i23 = i17;
                    i22 = i12 + 1;
                    i20 = iExecComplex;
                    i19 = i13;
                    length = i14;
                    break;
                case 15:
                    i13 = i19;
                    i14 = length;
                    i18 = i20;
                    complexArr[i18].exp();
                    i12 = i22;
                    i17 = i23;
                    iExecComplex = i18;
                    i23 = i17;
                    i22 = i12 + 1;
                    i20 = iExecComplex;
                    i19 = i13;
                    length = i14;
                    break;
                case 16:
                    i13 = i19;
                    i14 = length;
                    i18 = i20;
                    complexArr[i18].log();
                    i12 = i22;
                    i17 = i23;
                    iExecComplex = i18;
                    i23 = i17;
                    i22 = i12 + 1;
                    i20 = iExecComplex;
                    i19 = i13;
                    length = i14;
                    break;
                case 17:
                    i13 = i19;
                    i14 = length;
                    i18 = i20;
                    complexArr[i18].sin();
                    i12 = i22;
                    i17 = i23;
                    iExecComplex = i18;
                    i23 = i17;
                    i22 = i12 + 1;
                    i20 = iExecComplex;
                    i19 = i13;
                    length = i14;
                    break;
                case 18:
                    i13 = i19;
                    i14 = length;
                    i18 = i20;
                    complexArr[i18].cos();
                    i12 = i22;
                    i17 = i23;
                    iExecComplex = i18;
                    i23 = i17;
                    i22 = i12 + 1;
                    i20 = iExecComplex;
                    i19 = i13;
                    length = i14;
                    break;
                case 19:
                    i13 = i19;
                    i14 = length;
                    i18 = i20;
                    complexArr[i18].tan();
                    i12 = i22;
                    i17 = i23;
                    iExecComplex = i18;
                    i23 = i17;
                    i22 = i12 + 1;
                    i20 = iExecComplex;
                    i19 = i13;
                    length = i14;
                    break;
                case 20:
                    i13 = i19;
                    i14 = length;
                    i18 = i20;
                    complexArr[i18].asin();
                    i12 = i22;
                    i17 = i23;
                    iExecComplex = i18;
                    i23 = i17;
                    i22 = i12 + 1;
                    i20 = iExecComplex;
                    i19 = i13;
                    length = i14;
                    break;
                case 21:
                    i13 = i19;
                    i14 = length;
                    i18 = i20;
                    complexArr[i18].acos();
                    i12 = i22;
                    i17 = i23;
                    iExecComplex = i18;
                    i23 = i17;
                    i22 = i12 + 1;
                    i20 = iExecComplex;
                    i19 = i13;
                    length = i14;
                    break;
                case 22:
                    i13 = i19;
                    i14 = length;
                    i18 = i20;
                    complexArr[i18].atan();
                    i12 = i22;
                    i17 = i23;
                    iExecComplex = i18;
                    i23 = i17;
                    i22 = i12 + 1;
                    i20 = iExecComplex;
                    i19 = i13;
                    length = i14;
                    break;
                case 23:
                    i13 = i19;
                    i14 = length;
                    i18 = i20;
                    complexArr[i18].sinh();
                    i12 = i22;
                    i17 = i23;
                    iExecComplex = i18;
                    i23 = i17;
                    i22 = i12 + 1;
                    i20 = iExecComplex;
                    i19 = i13;
                    length = i14;
                    break;
                case 24:
                    i13 = i19;
                    i14 = length;
                    i18 = i20;
                    complexArr[i18].cosh();
                    i12 = i22;
                    i17 = i23;
                    iExecComplex = i18;
                    i23 = i17;
                    i22 = i12 + 1;
                    i20 = iExecComplex;
                    i19 = i13;
                    length = i14;
                    break;
                case 25:
                    i13 = i19;
                    i14 = length;
                    i18 = i20;
                    complexArr[i18].tanh();
                    i12 = i22;
                    i17 = i23;
                    iExecComplex = i18;
                    i23 = i17;
                    i22 = i12 + 1;
                    i20 = iExecComplex;
                    i19 = i13;
                    length = i14;
                    break;
                case 26:
                    i13 = i19;
                    i14 = length;
                    i18 = i20;
                    complexArr[i18].asinh();
                    i12 = i22;
                    i17 = i23;
                    iExecComplex = i18;
                    i23 = i17;
                    i22 = i12 + 1;
                    i20 = iExecComplex;
                    i19 = i13;
                    length = i14;
                    break;
                case 27:
                    i13 = i19;
                    i14 = length;
                    i18 = i20;
                    complexArr[i18].acosh();
                    i12 = i22;
                    i17 = i23;
                    iExecComplex = i18;
                    i23 = i17;
                    i22 = i12 + 1;
                    i20 = iExecComplex;
                    i19 = i13;
                    length = i14;
                    break;
                case 28:
                    i13 = i19;
                    i14 = length;
                    i18 = i20;
                    complexArr[i18].atanh();
                    i12 = i22;
                    i17 = i23;
                    iExecComplex = i18;
                    i23 = i17;
                    i22 = i12 + 1;
                    i20 = iExecComplex;
                    i19 = i13;
                    length = i14;
                    break;
                case 29:
                    i13 = i19;
                    i14 = length;
                    i18 = i20;
                    Complex complex5 = complexArr[i18];
                    complex5.set(complex5.abs(), 0.0d);
                    i12 = i22;
                    i17 = i23;
                    iExecComplex = i18;
                    i23 = i17;
                    i22 = i12 + 1;
                    i20 = iExecComplex;
                    i19 = i13;
                    length = i14;
                    break;
                case 30:
                    i13 = i19;
                    i14 = length;
                    i18 = i20;
                    Complex complex6 = complexArr[i18];
                    complex6.set(Math.floor(complex6.re), 0.0d);
                    i12 = i22;
                    i17 = i23;
                    iExecComplex = i18;
                    i23 = i17;
                    i22 = i12 + 1;
                    i20 = iExecComplex;
                    i19 = i13;
                    length = i14;
                    break;
                case 31:
                    i13 = i19;
                    i14 = length;
                    i18 = i20;
                    Complex complex7 = complexArr[i18];
                    complex7.set(Math.ceil(complex7.re), 0.0d);
                    i12 = i22;
                    i17 = i23;
                    iExecComplex = i18;
                    i23 = i17;
                    i22 = i12 + 1;
                    i20 = iExecComplex;
                    i19 = i13;
                    length = i14;
                    break;
                case 32:
                    i13 = i19;
                    i14 = length;
                    Complex complex8 = complexArr[i20];
                    i18 = i20;
                    double d11 = complex8.re;
                    complex8.set(d11 > 0.0d ? 1.0d : d11 < 0.0d ? -1.0d : 0.0d, 0.0d);
                    i12 = i22;
                    i17 = i23;
                    iExecComplex = i18;
                    i23 = i17;
                    i22 = i12 + 1;
                    i20 = iExecComplex;
                    i19 = i13;
                    length = i14;
                    break;
                case 33:
                    i13 = i19;
                    i14 = length;
                    iExecComplex = i20 - 1;
                    Complex complex9 = complexArr[i20];
                    double d12 = complex9.re;
                    Complex complex10 = complexArr[iExecComplex];
                    if (d12 < complex10.re) {
                        complex10.set(complex9);
                    }
                    i12 = i22;
                    i22 = i12 + 1;
                    i20 = iExecComplex;
                    i19 = i13;
                    length = i14;
                    break;
                case 34:
                    i15 = i20 - 1;
                    Complex complex11 = complexArr[i15];
                    double d13 = complex11.re;
                    Complex complex12 = complexArr[i20];
                    i13 = i19;
                    i14 = length;
                    if (d13 < complex12.re) {
                        complex11.set(complex12);
                    }
                    i12 = i22;
                    iExecComplex = i15;
                    i22 = i12 + 1;
                    i20 = iExecComplex;
                    i19 = i13;
                    length = i14;
                    break;
                case 35:
                    i15 = i20 - 1;
                    complexArr[i15].gcd(complexArr[i20]);
                    i13 = i19;
                    i14 = length;
                    i12 = i22;
                    iExecComplex = i15;
                    i22 = i12 + 1;
                    i20 = iExecComplex;
                    i19 = i13;
                    length = i14;
                    break;
                case 36:
                    i15 = i20 - 1;
                    complexArr[i15].combinations(complexArr[i20]);
                    i13 = i19;
                    i14 = length;
                    i12 = i22;
                    iExecComplex = i15;
                    i22 = i12 + 1;
                    i20 = iExecComplex;
                    i19 = i13;
                    length = i14;
                    break;
                case 37:
                    i15 = i20 - 1;
                    complexArr[i15].permutations(complexArr[i20]);
                    i13 = i19;
                    i14 = length;
                    i12 = i22;
                    iExecComplex = i15;
                    i22 = i12 + 1;
                    i20 = iExecComplex;
                    i19 = i13;
                    length = i14;
                    break;
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                    int i43 = i20 + 1;
                    complexArr[i43].set(complexArr[(i25 + i19) - 37]);
                    i13 = i19;
                    i14 = length;
                    iExecComplex = i43;
                    i12 = i22;
                    i22 = i12 + 1;
                    i20 = iExecComplex;
                    i19 = i13;
                    length = i14;
                    break;
                default:
                    throw new Error(c.a("Unknown opcode ", i25));
            }
        }
        return i20;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.arity != 0) {
            stringBuffer.append("arity ");
            stringBuffer.append(this.arity);
            stringBuffer.append("; ");
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            byte[] bArr = this.code;
            if (i10 >= bArr.length) {
                break;
            }
            byte b10 = bArr[i10];
            stringBuffer.append(VM.opcodeName[b10]);
            if (b10 == 1) {
                stringBuffer.append(' ');
                if (this.constsIm == null) {
                    stringBuffer.append(this.constsRe[i11]);
                } else {
                    stringBuffer.append('(');
                    stringBuffer.append(this.constsRe[i11]);
                    stringBuffer.append(j.f68738d);
                    stringBuffer.append(this.constsIm[i11]);
                    stringBuffer.append(')');
                }
                i11++;
            } else if (b10 == 2) {
                i12++;
            }
            stringBuffer.append("; ");
            i10++;
        }
        if (i11 != this.constsRe.length) {
            stringBuffer.append("\nuses only ");
            stringBuffer.append(i11);
            stringBuffer.append(" consts out of ");
            stringBuffer.append(this.constsRe.length);
        }
        if (i12 != this.funcs.length) {
            stringBuffer.append("\nuses only ");
            stringBuffer.append(i12);
            stringBuffer.append(" funcs out of ");
            stringBuffer.append(this.funcs.length);
        }
        return stringBuffer.toString();
    }

    @Override // org.javia.arity.ContextFunction
    public Complex eval(Complex[] complexArr, EvalContext evalContext) {
        checkArity(complexArr.length);
        Complex[] complexArr2 = evalContext.stackComplex;
        int i10 = evalContext.stackBase;
        for (int i11 = 0; i11 < complexArr.length; i11++) {
            complexArr2[i11 + i10].set(complexArr[i11]);
        }
        execComplex(evalContext, (complexArr.length + i10) - 1);
        return complexArr2[i10];
    }
}
