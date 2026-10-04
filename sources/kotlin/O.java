package kotlin;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

/* JADX INFO: loaded from: classes7.dex */
public class O extends N {
    @InterfaceC4887e0(version = "1.2")
    @Xc.f
    public static final BigInteger A(BigInteger bigInteger, int i10) {
        kotlin.jvm.internal.G.p(bigInteger, "<this>");
        BigInteger bigIntegerShiftRight = bigInteger.shiftRight(i10);
        kotlin.jvm.internal.G.o(bigIntegerShiftRight, "shiftRight(...)");
        return bigIntegerShiftRight;
    }

    @Xc.f
    public static final BigInteger B(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.G.p(bigInteger, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        BigInteger bigIntegerMultiply = bigInteger.multiply(other);
        kotlin.jvm.internal.G.o(bigIntegerMultiply, "multiply(...)");
        return bigIntegerMultiply;
    }

    @InterfaceC4887e0(version = "1.2")
    @Xc.f
    public static final BigDecimal C(BigInteger bigInteger) {
        kotlin.jvm.internal.G.p(bigInteger, "<this>");
        return new BigDecimal(bigInteger);
    }

    @InterfaceC4887e0(version = "1.2")
    @Xc.f
    public static final BigDecimal D(BigInteger bigInteger, int i10, MathContext mathContext) {
        kotlin.jvm.internal.G.p(bigInteger, "<this>");
        kotlin.jvm.internal.G.p(mathContext, "mathContext");
        return new BigDecimal(bigInteger, i10, mathContext);
    }

    public static /* synthetic */ BigDecimal E(BigInteger bigInteger, int i10, MathContext mathContext, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            mathContext = MathContext.UNLIMITED;
            kotlin.jvm.internal.G.o(mathContext, "UNLIMITED");
        }
        kotlin.jvm.internal.G.p(bigInteger, "<this>");
        kotlin.jvm.internal.G.p(mathContext, "mathContext");
        return new BigDecimal(bigInteger, i10, mathContext);
    }

    @InterfaceC4887e0(version = "1.2")
    @Xc.f
    public static final BigInteger F(int i10) {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(i10);
        kotlin.jvm.internal.G.o(bigIntegerValueOf, "valueOf(...)");
        return bigIntegerValueOf;
    }

    @InterfaceC4887e0(version = "1.2")
    @Xc.f
    public static final BigInteger G(long j10) {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(j10);
        kotlin.jvm.internal.G.o(bigIntegerValueOf, "valueOf(...)");
        return bigIntegerValueOf;
    }

    @Xc.f
    public static final BigInteger H(BigInteger bigInteger) {
        kotlin.jvm.internal.G.p(bigInteger, "<this>");
        BigInteger bigIntegerNegate = bigInteger.negate();
        kotlin.jvm.internal.G.o(bigIntegerNegate, "negate(...)");
        return bigIntegerNegate;
    }

    @InterfaceC4887e0(version = "1.2")
    @Xc.f
    public static final BigInteger I(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.G.p(bigInteger, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        BigInteger bigIntegerXor = bigInteger.xor(other);
        kotlin.jvm.internal.G.o(bigIntegerXor, "xor(...)");
        return bigIntegerXor;
    }

    @InterfaceC4887e0(version = "1.2")
    @Xc.f
    public static final BigInteger q(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.G.p(bigInteger, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        BigInteger bigIntegerAnd = bigInteger.and(other);
        kotlin.jvm.internal.G.o(bigIntegerAnd, "and(...)");
        return bigIntegerAnd;
    }

    @InterfaceC4887e0(version = "1.2")
    @Xc.f
    public static final BigInteger r(BigInteger bigInteger) {
        kotlin.jvm.internal.G.p(bigInteger, "<this>");
        BigInteger bigIntegerSubtract = bigInteger.subtract(BigInteger.ONE);
        kotlin.jvm.internal.G.o(bigIntegerSubtract, "subtract(...)");
        return bigIntegerSubtract;
    }

    @Xc.f
    public static final BigInteger s(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.G.p(bigInteger, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        BigInteger bigIntegerDivide = bigInteger.divide(other);
        kotlin.jvm.internal.G.o(bigIntegerDivide, "divide(...)");
        return bigIntegerDivide;
    }

    @InterfaceC4887e0(version = "1.2")
    @Xc.f
    public static final BigInteger t(BigInteger bigInteger) {
        kotlin.jvm.internal.G.p(bigInteger, "<this>");
        BigInteger bigIntegerAdd = bigInteger.add(BigInteger.ONE);
        kotlin.jvm.internal.G.o(bigIntegerAdd, "add(...)");
        return bigIntegerAdd;
    }

    @InterfaceC4887e0(version = "1.2")
    @Xc.f
    public static final BigInteger u(BigInteger bigInteger) {
        kotlin.jvm.internal.G.p(bigInteger, "<this>");
        BigInteger bigIntegerNot = bigInteger.not();
        kotlin.jvm.internal.G.o(bigIntegerNot, "not(...)");
        return bigIntegerNot;
    }

    @Xc.f
    public static final BigInteger v(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.G.p(bigInteger, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        BigInteger bigIntegerSubtract = bigInteger.subtract(other);
        kotlin.jvm.internal.G.o(bigIntegerSubtract, "subtract(...)");
        return bigIntegerSubtract;
    }

    @InterfaceC4887e0(version = "1.2")
    @Xc.f
    public static final BigInteger w(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.G.p(bigInteger, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        BigInteger bigIntegerOr = bigInteger.or(other);
        kotlin.jvm.internal.G.o(bigIntegerOr, "or(...)");
        return bigIntegerOr;
    }

    @Xc.f
    public static final BigInteger x(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.G.p(bigInteger, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        BigInteger bigIntegerAdd = bigInteger.add(other);
        kotlin.jvm.internal.G.o(bigIntegerAdd, "add(...)");
        return bigIntegerAdd;
    }

    @InterfaceC4887e0(version = "1.1")
    @Xc.f
    public static final BigInteger y(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.G.p(bigInteger, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        BigInteger bigIntegerRemainder = bigInteger.remainder(other);
        kotlin.jvm.internal.G.o(bigIntegerRemainder, "remainder(...)");
        return bigIntegerRemainder;
    }

    @InterfaceC4887e0(version = "1.2")
    @Xc.f
    public static final BigInteger z(BigInteger bigInteger, int i10) {
        kotlin.jvm.internal.G.p(bigInteger, "<this>");
        BigInteger bigIntegerShiftLeft = bigInteger.shiftLeft(i10);
        kotlin.jvm.internal.G.o(bigIntegerShiftLeft, "shiftLeft(...)");
        return bigIntegerShiftLeft;
    }
}
