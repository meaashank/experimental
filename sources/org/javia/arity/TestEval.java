package org.javia.arity;

import com.android.launcher3.IconCache;
import kotlin.time.j;

/* JADX INFO: loaded from: classes6.dex */
class TestEval {
    static EvalCase[] cases = {new EvalCase(IconCache.EMPTY_CLASS_NAME, 0.0d), new EvalCase("1+.", 1.0d), new EvalCase("1", 1.0d), new EvalCase("π", 3.141592653589793d), new EvalCase("2×3", 6.0d), new EvalCase("1+√9*2", 7.0d), new EvalCase("3√ 4", 6.0d), new EvalCase("√16sin(2π/4)", 4.0d), new EvalCase("1+", -2.0d), new EvalCase("1+1", 2.0d), new EvalCase("1+-1", 0.0d), new EvalCase("-0.5", -0.5d), new EvalCase("+1e2", 100.0d), new EvalCase("1e-1", 0.1d), new EvalCase("1e−2", 0.01d), new EvalCase("-2^3!", -64.0d), new EvalCase("(-2)^3!", 64.0d), new EvalCase("-2^1^2", -2.0d), new EvalCase("--1", 1.0d), new EvalCase("-3^--2", -9.0d), new EvalCase("1+2)(2+3", 15.0d), new EvalCase("1+2)!^-2", 0.027777777777777776d), new EvalCase("sin(0)", 0.0d), new EvalCase("cos(0)", 1.0d), new EvalCase("sin(-1--1)", 0.0d), new EvalCase("-(2+1)*-(4/2)", 6.0d), new EvalCase("-.5E-1", -0.05d), new EvalCase("1E1.5", -2.0d), new EvalCase("2 3 4", 24.0d), new EvalCase("pi", 3.141592653589793d), new EvalCase("e", 2.718281828459045d), new EvalCase("sin(pi/2)", 1.0d), new EvalCase("f=sin(2x)", -3.0d), new EvalCase("f(pi/2)", 0.0d), new EvalCase("a=3", 3.0d), new EvalCase("b=a+1", 4.0d), new EvalCase("f(x, y) = x*(y+1)", -3.0d), new EvalCase("=", -2.0d), new EvalCase("f(a, b-a)", 6.0d), new EvalCase(" f(a pi/4)", -1.0d), new EvalCase("f (  1  +  1  , a+1)", 10.0d), new EvalCase("g(foo) = f (f(foo, 1)pi/2)", -3.0d), new EvalCase("g(.5*2)", 0.0d), new EvalCase("NaN", Double.NaN), new EvalCase("Inf", Double.POSITIVE_INFINITY), new EvalCase(j.f218437k, Double.POSITIVE_INFINITY), new EvalCase("-Inf", Double.NEGATIVE_INFINITY), new EvalCase("0/0", Double.NaN), new EvalCase("comb(11, 9)", 55.0d), new EvalCase("perm(11, 2)", 110.0d), new EvalCase("comb(1000, 999)", 1000.0d), new EvalCase("perm(1000, 1)", 1000.0d), new EvalCase("c(x)=1+x^2", -3.0d), new EvalCase("c(3-1)", 5.0d), new EvalCase("abs(3-4i)", 5.0d), new EvalCase("exp(pi*i)", -1.0d), new EvalCase("5%", 0.05d), new EvalCase("200+5%", 210.0d), new EvalCase("200-5%", 190.0d), new EvalCase("100/200%", 50.0d), new EvalCase("100+200%+5%", 315.0d), new EvalCase("p1(x)=200+5%+x", -3.0d), new EvalCase("p1(0)", 210.0d), new EvalCase("p2(x,y)=x+y%+(2*y)%", -3.0d), new EvalCase("p2(200,5)", 231.0d), new EvalCase("mod(5,3)", 2.0d), new EvalCase("5.2 # 3.2", 2.0d), new EvalCase("f(x)=3", -3.0d), new EvalCase("g(x)=f(x)", -3.0d), new EvalCase("g(1)", 3.0d), new EvalCase("a(x)=i+x-x", -3.0d), new EvalCase("b(x)=a(x)*a(x)", -3.0d), new EvalCase("b(5)", -1.0d), new EvalCase("h(x)=sqrt(-1+x-x)", -3.0d), new EvalCase("k(x)=h(x)*h(x)", -3.0d), new EvalCase("k(5)", -1.0d), new EvalCase("pi=4", 4.0d), new EvalCase("pi", 3.141592653589793d), new EvalCase("fc(x)=e^(i*x^2", -3.0d), new EvalCase("fc(0)", 1.0d), new EvalCase("aa(x)=sin(x)^1+sin(x)^0", -3.0d), new EvalCase("aa(0)", 1.0d), new EvalCase("null(x)=0", -3.0d), new EvalCase("n(x)=null(sin(x))", -3.0d), new EvalCase("n(1)", 0.0d), new EvalCase("(2,", -2.0d), new EvalCase("100.1-100-.1", 0.0d), new EvalCase("1.1-1+(-.1)", 0.0d), new EvalCase("log(2,8)", 3.0d), new EvalCase("log(9,81)", 2.0d), new EvalCase("log(4,2)", 0.5d), new EvalCase("sin'(0)", 1.0d), new EvalCase("cos'(0)", 0.0d), new EvalCase("cos'(pi/2)", -1.0d), new EvalCase("f(x)=2*x^3+x^2+100", -3.0d), new EvalCase("f'(1)", 8.0d), new EvalCase("f'(2)", 28.0d), new EvalCase("abs'(2)", 1.0d), new EvalCase("abs'(-3)", -1.0d), new EvalCase("0x0", 0.0d), new EvalCase("0x100", 256.0d), new EvalCase("0X10", 16.0d), new EvalCase("0b10", 2.0d), new EvalCase("0o10", 8.0d), new EvalCase("0o8", -2.0d), new EvalCase("0xg", -2.0d), new EvalCase("0b20", -2.0d), new EvalCase("sin(0x1*pi/2)", 1.0d), new EvalCase("ln(e)", 1.0d), new EvalCase("log(10)", 1.0d), new EvalCase("log10(100)", 2.0d), new EvalCase("lg(.1)", -1.0d), new EvalCase("log2(2)", 1.0d), new EvalCase("lb(256)", 8.0d)};
    static EvalCase[] casesComplex = {new EvalCase("sqrt(-1)^2", new Complex(-1.0d, 0.0d)), new EvalCase("i", new Complex(0.0d, 1.0d)), new EvalCase("sqrt(-1)", new Complex(0.0d, 1.0d)), new EvalCase("c(2+0i)", new Complex(5.0d, 0.0d)), new EvalCase("c(1+i)", new Complex(1.0d, 2.0d)), new EvalCase("ln(-1)", new Complex(0.0d, -3.141592653589793d)), new EvalCase("i^i", new Complex(0.20787957635076193d, 0.0d)), new EvalCase("gcd(135-14i, 155+34i)", new Complex(12.0d, -5.0d)), new EvalCase("comb(1+.5i, 1)", new Complex(1.0d, 0.5d)), new EvalCase("perm(2+i, 2)", new Complex(1.0d, 3.0d)), new EvalCase("fc(2)", new Complex(-0.6536436208636119d, -0.7568024953079282d))};

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ae A[PHI: r13 r17
      0x00ae: PHI (r13v1 java.lang.String) = (r13v0 java.lang.String), (r13v5 java.lang.String), (r13v5 java.lang.String) binds: [B:35:0x00ba, B:29:0x00a2, B:31:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x00ae: PHI (r17v2 int) = (r17v1 int), (r17v6 int), (r17v6 int) binds: [B:35:0x00ba, B:29:0x00a2, B:31:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010a A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean testEval() throws org.javia.arity.ArityException {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.javia.arity.TestEval.testEval():boolean");
    }
}
