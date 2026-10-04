package androidx.compose.runtime.internal;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public static final boolean a(double d10, double d11) {
        return d10 == d11;
    }

    public static final boolean b(float f10, float f11) {
        return f10 == f11;
    }

    public static final boolean c(double d10) {
        return (Double.doubleToRawLongBits(d10) & Long.MAX_VALUE) > 9218868437227405312L;
    }

    public static final boolean d(float f10) {
        return (Float.floatToRawIntBits(f10) & Integer.MAX_VALUE) > 2139095040;
    }
}
