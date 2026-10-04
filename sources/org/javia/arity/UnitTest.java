package org.javia.arity;

import androidx.compose.ui.input.pointer.C2151s;
import java.io.PrintStream;

/* JADX INFO: loaded from: classes6.dex */
public class UnitTest {
    private static final String[] profileCases = {"(100.5 + 20009.999)*(7+4+3)/(5/2)^3!)*2", "fun1(x)=(x+2)*(x+3)", "otherFun(x)=(fun1(x-1)*x+1)*(fun1(2-x)+10)", "log(x+30.5, 3)^.7*sin(x+.5)"};
    static boolean allOk = true;
    static int checkCounter = 0;

    public static void check(double d10, double d11) {
        checkCounter++;
        if (equal(d10, d11)) {
            return;
        }
        allOk = false;
        System.out.println("failed check #" + checkCounter + ": expected " + d11 + " got " + d10);
    }

    public static boolean equal(Complex complex, Complex complex2) {
        return equal(complex.re, complex2.re) && equal(complex.im, complex2.im);
    }

    public static void main(String[] strArr) throws ArityException, SyntaxException {
        int length = strArr.length;
        if (length == 0) {
            runUnitTests();
            return;
        }
        if (!strArr[0].equals("-profile")) {
            Symbols symbols = new Symbols();
            for (int i10 = 0; i10 < length; i10++) {
                FunctionAndName functionAndNameCompileWithName = symbols.compileWithName(strArr[i10]);
                symbols.define(functionAndNameCompileWithName);
                Function function = functionAndNameCompileWithName.function;
                System.out.println(strArr[i10] + " : " + function);
            }
            return;
        }
        if (length == 1) {
            profile();
            return;
        }
        Symbols symbols2 = new Symbols();
        int i11 = 1;
        while (true) {
            int i12 = length - 1;
            if (i11 >= i12) {
                profile(symbols2, strArr[i12]);
                return;
            } else {
                symbols2.define(symbols2.compileWithName(strArr[i11]));
                i11++;
            }
        }
    }

    public static void profile(Symbols symbols, String str) throws ArityException, SyntaxException {
        Function functionCompile = symbols.compile(str);
        System.out.println("\n" + str + ": " + functionCompile);
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        runtime.gc();
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (int i10 = 0; i10 < 1000; i10++) {
            symbols.compile(str);
        }
        System.out.println("compilation time: " + (System.currentTimeMillis() - jCurrentTimeMillis) + " us");
        double[] dArr = new double[functionCompile.arity()];
        runtime.gc();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        for (int i11 = 0; i11 < 100000; i11++) {
            functionCompile.eval(dArr);
        }
        long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis2;
        PrintStream printStream = System.out;
        StringBuilder sb2 = new StringBuilder("execution time: ");
        sb2.append(jCurrentTimeMillis3 > 100 ? "" + (jCurrentTimeMillis3 / 100.0d) + " us" : C2151s.a("", jCurrentTimeMillis3, " ns"));
        printStream.println(sb2.toString());
    }

    public static void runUnitTests() {
        checkCounter = 0;
        check(Util.doubleToString(Double.NEGATIVE_INFINITY, 5).equals("-Infinity"));
        check(Util.doubleToString(Double.NaN, 5).equals("NaN"));
        Complex complex = new Complex();
        Complex complex2 = new Complex();
        Complex complex3 = new Complex();
        check(Util.complexToString(complex.set(0.0d, -1.0d), 10, 1).equals("-i"));
        check(Util.complexToString(complex.set(2.123d, 0.0d), 3, 0).equals("2.1"));
        check(Util.complexToString(complex.set(0.0d, 1.0000000000001d), 20, 3).equals("i"));
        check(Util.complexToString(complex.set(1.0d, -1.0d), 10, 1).equals("1-i"));
        check(Util.complexToString(complex.set(1.0d, 1.0d), 10, 1).equals("1+i"));
        check(Util.complexToString(complex.set(1.12d, 1.12d), 9, 0).equals("1.12+1.1i"));
        check(Util.complexToString(complex.set(1.12345d, -1.0d), 7, 0).equals("1.123-i"));
        check(complex.set(-1.0d, 0.0d).pow(complex2.set(0.0d, 1.0d)), complex3.set(0.04321391826377226d, 0.0d));
        check(complex.set(-1.0d, 0.0d).pow(complex2.set(1.0d, 1.0d)), complex3.set(-0.04321391826377226d, 0.0d));
        check(complex.set(-1.0d, 0.0d).abs(), 1.0d);
        check(complex.set(7.3890560989306495d, 0.0d).log(), complex2.set(2.0d, 0.0d));
        check(complex.set(-1.0d, 0.0d).log(), complex2.set(0.0d, 3.141592653589793d));
        check(complex.set(2.0d, 0.0d).exp(), complex2.set(7.3890560989306495d, 0.0d));
        check(complex.set(0.0d, 3.141592653589793d).exp(), complex2.set(-1.0d, 0.0d));
        check(MoreMath.lgamma(1.0d), 0.0d);
        check(complex.set(1.0d, 0.0d).lgamma(), complex2.set(0.0d, 0.0d));
        check(complex.set(0.0d, 0.0d).factorial(), complex2.set(1.0d, 0.0d));
        check(complex.set(1.0d, 0.0d).factorial(), complex2.set(1.0d, 0.0d));
        check(complex.set(0.0d, 1.0d).factorial(), complex2.set(0.49801566811835596d, -0.1549498283018106d));
        check(complex.set(-2.0d, 1.0d).factorial(), complex2.set(-0.17153291990834815d, 0.32648274821006623d));
        check(complex.set(4.0d, 0.0d).factorial(), complex2.set(24.0d, 0.0d));
        check(complex.set(4.0d, 3.0d).factorial(), complex2.set(0.016041882741649555d, -9.433293289755953d));
        check(Math.log(-1.0d), Double.NaN);
        check(Math.log(-0.03d), Double.NaN);
        check(MoreMath.intLog10(-0.03d), 0.0d);
        check(MoreMath.intLog10(0.03d), -2.0d);
        check(MoreMath.intExp10(3), 1000.0d);
        check(MoreMath.intExp10(-1), 0.1d);
        check(Util.shortApprox(1.235d, 0.02d), 1.24d);
        check(Util.shortApprox(1.235d, 0.4d), 1.2000000000000002d);
        check(Util.shortApprox(-1.235d, 0.02d), -1.24d);
        check(Util.shortApprox(-1.235d, 0.4d), -1.2000000000000002d);
        check(TestFormat.testFormat());
        check(TestEval.testEval());
        check(testRecursiveEval());
        check(testFrame());
        check(TestFormat.testSizeCases());
        if (allOk) {
            System.out.println("\n*** All tests passed OK ***\n");
        } else {
            System.out.println("\n*** Some tests FAILED ***\n");
            System.exit(1);
        }
    }

    public static boolean testFrame() {
        try {
            Symbols symbols = new Symbols();
            symbols.define("a", 1.0d);
            boolean z10 = symbols.eval("a") == 1.0d;
            symbols.pushFrame();
            boolean z11 = z10 && symbols.eval("a") == 1.0d;
            symbols.define("a", 2.0d);
            boolean z12 = z11 && symbols.eval("a") == 2.0d;
            symbols.define("a", 3.0d);
            boolean z13 = z12 && symbols.eval("a") == 3.0d;
            symbols.popFrame();
            boolean z14 = z13 && symbols.eval("a") == 1.0d;
            Symbols symbols2 = new Symbols();
            symbols2.pushFrame();
            symbols2.add(Symbol.makeArg("base", 0));
            symbols2.add(Symbol.makeArg("x", 1));
            boolean z15 = z14 && symbols2.lookupConst("x").op == 39;
            symbols2.pushFrame();
            boolean z16 = z15 && symbols2.lookupConst("base").op == 38 && symbols2.lookupConst("x").op == 39;
            symbols2.popFrame();
            boolean z17 = z16 && symbols2.lookupConst("base").op == 38 && symbols2.lookupConst("x").op == 39;
            symbols2.popFrame();
            if (z17) {
                if (symbols2.lookupConst("x").op == 38) {
                    return true;
                }
            }
        } catch (SyntaxException unused) {
        }
        return false;
    }

    public static boolean testRecursiveEval() {
        Symbols symbols = new Symbols();
        symbols.define("myfun", new MyFun());
        try {
            Function functionCompile = symbols.compile("1+myfun(x)");
            if (functionCompile.eval(0.0d) == 2.0d && functionCompile.eval(1.0d) == 1.0d && functionCompile.eval(2.0d) == 0.0d) {
                if (functionCompile.eval(3.0d) == -1.0d) {
                    return true;
                }
            }
            return false;
        } catch (SyntaxException e10) {
            System.out.println("" + e10);
            allOk = false;
            return false;
        }
    }

    public static boolean equal(double d10, Complex complex) {
        if (!equal(d10, complex.re)) {
            return false;
        }
        if (equal(0.0d, complex.im)) {
            return true;
        }
        return Double.isNaN(d10) && Double.isNaN(complex.im);
    }

    public static boolean equal(double d10, double d11) {
        if (d10 == d11) {
            return true;
        }
        if (Double.isNaN(d10) && Double.isNaN(d11)) {
            return true;
        }
        double d12 = d10 - d11;
        return Math.abs(d12 / d11) < 1.0E-15d || Math.abs(d12) < 1.0E-15d;
    }

    public static void check(Complex complex, Complex complex2) {
        checkCounter++;
        if (equal(complex.re, complex2.re) && equal(complex.im, complex2.im)) {
            return;
        }
        allOk = false;
        System.out.println("failed check #" + checkCounter + ": expected " + complex2 + " got " + complex);
    }

    public static void check(boolean z10) {
        checkCounter++;
        if (z10) {
            return;
        }
        allOk = false;
    }

    private static void profile() {
        String[] strArr = profileCases;
        Symbols symbols = new Symbols();
        for (int i10 = 0; i10 < strArr.length; i10++) {
            try {
                symbols.define(symbols.compileWithName(strArr[i10]));
                profile(symbols, strArr[i10]);
            } catch (SyntaxException e10) {
                throw new Error("" + e10);
            }
        }
    }
}
