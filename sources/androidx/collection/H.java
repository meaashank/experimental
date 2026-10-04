package androidx.collection;

import androidx.activity.C1477d;
import kotlin.InterfaceC4850b0;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nIntIntPair.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntIntPair.kt\nandroidx/collection/IntIntPair\n+ 2 PackingUtils.kt\nandroidx/collection/PackingUtilsKt\n*L\n1#1,83:1\n33#2:84\n*S KotlinDebug\n*F\n+ 1 IntIntPair.kt\nandroidx/collection/IntIntPair\n*L\n41#1:84\n*E\n"})
@dd.h
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dd.g
    public final long f86706a;

    public /* synthetic */ H(long j10) {
        this.f86706a = j10;
    }

    public static final /* synthetic */ H a(long j10) {
        return new H(j10);
    }

    public static final int b(long j10) {
        return (int) (j10 >> 32);
    }

    public static final int c(long j10) {
        return (int) (j10 & ZipKt.f225990j);
    }

    public static long d(int i10, int i11) {
        return (((long) i11) & ZipKt.f225990j) | (((long) i10) << 32);
    }

    public static long e(long j10) {
        return j10;
    }

    public static boolean f(long j10, Object obj) {
        return (obj instanceof H) && j10 == ((H) obj).f86706a;
    }

    public static final boolean g(long j10, long j11) {
        return j10 == j11;
    }

    public static final int h(long j10) {
        return (int) (j10 >> 32);
    }

    @InterfaceC4850b0
    public static /* synthetic */ void i() {
    }

    public static final int j(long j10) {
        return (int) (j10 & ZipKt.f225990j);
    }

    public static int k(long j10) {
        return C1550p.a(j10);
    }

    @NotNull
    public static String l(long j10) {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append((int) (j10 >> 32));
        sb2.append(U6.j.f68738d);
        return C1477d.a(sb2, (int) (j10 & ZipKt.f225990j), ')');
    }

    public boolean equals(Object obj) {
        return f(this.f86706a, obj);
    }

    public int hashCode() {
        return C1550p.a(this.f86706a);
    }

    public final /* synthetic */ long m() {
        return this.f86706a;
    }

    @NotNull
    public String toString() {
        return l(this.f86706a);
    }
}
