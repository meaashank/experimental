package androidx.compose.foundation.lazy.grid;

import androidx.collection.C1550p;
import androidx.compose.runtime.InterfaceC1924k0;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
@dd.h
public final class C1722c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f91427a;

    public /* synthetic */ C1722c(long j10) {
        this.f91427a = j10;
    }

    public static final /* synthetic */ C1722c a(long j10) {
        return new C1722c(j10);
    }

    public static long b(long j10) {
        return j10;
    }

    public static boolean c(long j10, Object obj) {
        return (obj instanceof C1722c) && j10 == ((C1722c) obj).f91427a;
    }

    public static final boolean d(long j10, long j11) {
        return j10 == j11;
    }

    public static final int e(long j10) {
        return (int) j10;
    }

    public static int f(long j10) {
        return C1550p.a(j10);
    }

    public static String g(long j10) {
        return "GridItemSpan(packedValue=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f91427a, obj);
    }

    public final /* synthetic */ long h() {
        return this.f91427a;
    }

    public int hashCode() {
        return C1550p.a(this.f91427a);
    }

    public String toString() {
        return g(this.f91427a);
    }
}
