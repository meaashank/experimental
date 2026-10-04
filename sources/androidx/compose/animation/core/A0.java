package androidx.compose.animation.core;

import androidx.collection.C1550p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C4969v;

/* JADX INFO: loaded from: classes.dex */
@dd.h
public final class A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f87571a;

    public /* synthetic */ A0(long j10) {
        this.f87571a = j10;
    }

    public static final /* synthetic */ A0 a(long j10) {
        return new A0(j10);
    }

    public static long b(int i10, int i11) {
        return i10 * i11;
    }

    public static long c(long j10) {
        return j10;
    }

    public static long d(int i10, int i11, int i12, C4969v c4969v) {
        if ((i12 & 2) != 0) {
            B0.f87640b.getClass();
            i11 = B0.f87641c;
        }
        return i10 * i11;
    }

    public static boolean e(long j10, Object obj) {
        return (obj instanceof A0) && j10 == ((A0) obj).f87571a;
    }

    public static final boolean f(long j10, long j11) {
        return j10 == j11;
    }

    public static final int g(long j10) {
        return Math.abs((int) j10);
    }

    public static final int h(long j10) {
        boolean z10 = j10 > 0;
        if (z10) {
            B0.f87640b.getClass();
            return B0.f87642d;
        }
        if (z10) {
            throw new NoWhenBranchMatchedException();
        }
        B0.f87640b.getClass();
        return B0.f87641c;
    }

    public static int i(long j10) {
        return C1550p.a(j10);
    }

    public static String j(long j10) {
        return "StartOffset(value=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return e(this.f87571a, obj);
    }

    public int hashCode() {
        return C1550p.a(this.f87571a);
    }

    public final /* synthetic */ long k() {
        return this.f87571a;
    }

    public String toString() {
        return j(this.f87571a);
    }
}
