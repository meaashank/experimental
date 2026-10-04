package kotlin;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes7.dex */
public class N {
    @InterfaceC4887e0(version = "1.2")
    @Xc.f
    public static final BigDecimal a(BigDecimal bigDecimal) {
        kotlin.jvm.internal.G.p(bigDecimal, "<this>");
        BigDecimal bigDecimalSubtract = bigDecimal.subtract(BigDecimal.ONE);
        kotlin.jvm.internal.G.o(bigDecimalSubtract, "subtract(...)");
        return bigDecimalSubtract;
    }

    @Xc.f
    public static final BigDecimal b(BigDecimal bigDecimal, BigDecimal other) {
        kotlin.jvm.internal.G.p(bigDecimal, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        BigDecimal bigDecimalDivide = bigDecimal.divide(other, RoundingMode.HALF_EVEN);
        kotlin.jvm.internal.G.o(bigDecimalDivide, "divide(...)");
        return bigDecimalDivide;
    }

    @InterfaceC4887e0(version = "1.2")
    @Xc.f
    public static final BigDecimal c(BigDecimal bigDecimal) {
        kotlin.jvm.internal.G.p(bigDecimal, "<this>");
        BigDecimal bigDecimalAdd = bigDecimal.add(BigDecimal.ONE);
        kotlin.jvm.internal.G.o(bigDecimalAdd, "add(...)");
        return bigDecimalAdd;
    }

    @Xc.f
    public static final BigDecimal d(BigDecimal bigDecimal, BigDecimal other) {
        kotlin.jvm.internal.G.p(bigDecimal, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        BigDecimal bigDecimalSubtract = bigDecimal.subtract(other);
        kotlin.jvm.internal.G.o(bigDecimalSubtract, "subtract(...)");
        return bigDecimalSubtract;
    }

    @Xc.f
    public static final BigDecimal e(BigDecimal bigDecimal, BigDecimal other) {
        kotlin.jvm.internal.G.p(bigDecimal, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        BigDecimal bigDecimalAdd = bigDecimal.add(other);
        kotlin.jvm.internal.G.o(bigDecimalAdd, "add(...)");
        return bigDecimalAdd;
    }

    @Xc.f
    public static final BigDecimal f(BigDecimal bigDecimal, BigDecimal other) {
        kotlin.jvm.internal.G.p(bigDecimal, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        BigDecimal bigDecimalRemainder = bigDecimal.remainder(other);
        kotlin.jvm.internal.G.o(bigDecimalRemainder, "remainder(...)");
        return bigDecimalRemainder;
    }

    @Xc.f
    public static final BigDecimal g(BigDecimal bigDecimal, BigDecimal other) {
        kotlin.jvm.internal.G.p(bigDecimal, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        BigDecimal bigDecimalMultiply = bigDecimal.multiply(other);
        kotlin.jvm.internal.G.o(bigDecimalMultiply, "multiply(...)");
        return bigDecimalMultiply;
    }

    @InterfaceC4887e0(version = "1.2")
    @Xc.f
    public static final BigDecimal h(double d10) {
        return new BigDecimal(String.valueOf(d10));
    }

    @InterfaceC4887e0(version = "1.2")
    @Xc.f
    public static final BigDecimal i(double d10, MathContext mathContext) {
        kotlin.jvm.internal.G.p(mathContext, "mathContext");
        return new BigDecimal(String.valueOf(d10), mathContext);
    }

    @InterfaceC4887e0(version = "1.2")
    @Xc.f
    public static final BigDecimal j(float f10) {
        return new BigDecimal(String.valueOf(f10));
    }

    @InterfaceC4887e0(version = "1.2")
    @Xc.f
    public static final BigDecimal k(float f10, MathContext mathContext) {
        kotlin.jvm.internal.G.p(mathContext, "mathContext");
        return new BigDecimal(String.valueOf(f10), mathContext);
    }

    @InterfaceC4887e0(version = "1.2")
    @Xc.f
    public static final BigDecimal l(int i10) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(i10);
        kotlin.jvm.internal.G.o(bigDecimalValueOf, "valueOf(...)");
        return bigDecimalValueOf;
    }

    @InterfaceC4887e0(version = "1.2")
    @Xc.f
    public static final BigDecimal m(int i10, MathContext mathContext) {
        kotlin.jvm.internal.G.p(mathContext, "mathContext");
        return new BigDecimal(i10, mathContext);
    }

    @InterfaceC4887e0(version = "1.2")
    @Xc.f
    public static final BigDecimal n(long j10) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(j10);
        kotlin.jvm.internal.G.o(bigDecimalValueOf, "valueOf(...)");
        return bigDecimalValueOf;
    }

    @InterfaceC4887e0(version = "1.2")
    @Xc.f
    public static final BigDecimal o(long j10, MathContext mathContext) {
        kotlin.jvm.internal.G.p(mathContext, "mathContext");
        return new BigDecimal(j10, mathContext);
    }

    @Xc.f
    public static final BigDecimal p(BigDecimal bigDecimal) {
        kotlin.jvm.internal.G.p(bigDecimal, "<this>");
        BigDecimal bigDecimalNegate = bigDecimal.negate();
        kotlin.jvm.internal.G.o(bigDecimalNegate, "negate(...)");
        return bigDecimalNegate;
    }
}
