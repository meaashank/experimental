package androidx.compose.ui.input.pointer;

import androidx.collection.C1550p;

/* JADX INFO: loaded from: classes.dex */
@dd.h
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f102358a;

    public /* synthetic */ z(long j10) {
        this.f102358a = j10;
    }

    public static final /* synthetic */ z a(long j10) {
        return new z(j10);
    }

    public static long b(long j10) {
        return j10;
    }

    public static boolean c(long j10, Object obj) {
        return (obj instanceof z) && j10 == ((z) obj).f102358a;
    }

    public static final boolean d(long j10, long j11) {
        return j10 == j11;
    }

    public static int f(long j10) {
        return C1550p.a(j10);
    }

    public static String g(long j10) {
        return "PointerId(value=" + j10 + ')';
    }

    public final long e() {
        return this.f102358a;
    }

    public boolean equals(Object obj) {
        return c(this.f102358a, obj);
    }

    public final /* synthetic */ long h() {
        return this.f102358a;
    }

    public int hashCode() {
        return C1550p.a(this.f102358a);
    }

    public String toString() {
        return g(this.f102358a);
    }
}
