package androidx.compose.runtime;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class AtomicInt extends AtomicInteger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f98981a = 0;

    public AtomicInt(int i10) {
        super(i10);
    }

    public final int a(int i10) {
        return addAndGet(i10);
    }

    @Override // java.lang.Number
    public final byte byteValue() {
        return (byte) super.intValue();
    }

    public byte d() {
        return (byte) super.intValue();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final /* bridge */ double doubleValue() {
        return super.doubleValue();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final /* bridge */ float floatValue() {
        return super.floatValue();
    }

    public char g() {
        return (char) super.intValue();
    }

    public /* bridge */ double h() {
        return super.doubleValue();
    }

    public /* bridge */ float i() {
        return super.floatValue();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final /* bridge */ int intValue() {
        return super.intValue();
    }

    public /* bridge */ int j() {
        return super.intValue();
    }

    public /* bridge */ long k() {
        return super.longValue();
    }

    public short l() {
        return (short) super.intValue();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final /* bridge */ long longValue() {
        return super.longValue();
    }

    @Override // java.lang.Number
    public final short shortValue() {
        return (short) super.intValue();
    }
}
