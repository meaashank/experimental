package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.collection.C1550p;
import kotlin.jvm.internal.V;
import okio.internal.ZipKt;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1354:1\n1028#1:1358\n1027#1:1360\n100#2:1355\n107#2:1356\n114#2:1357\n114#2:1359\n107#2:1361\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n*L\n1029#1:1358\n1029#1:1360\n1025#1:1355\n1027#1:1356\n1028#1:1357\n1029#1:1359\n1029#1:1361\n*E\n"})
@dd.h
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f92198a;

    public /* synthetic */ z(long j10) {
        this.f92198a = j10;
    }

    public static final /* synthetic */ z a(long j10) {
        return new z(j10);
    }

    public static long b(int i10, int i11) {
        return (((long) (i11 + i10)) & ZipKt.f225990j) | (((long) i10) << 32);
    }

    public static long c(long j10) {
        return j10;
    }

    public static boolean d(long j10, Object obj) {
        return (obj instanceof z) && j10 == ((z) obj).f92198a;
    }

    public static final boolean e(long j10, long j11) {
        return j10 == j11;
    }

    public static final int f(long j10) {
        return (int) (j10 & ZipKt.f225990j);
    }

    public static final int h(long j10) {
        return ((int) (ZipKt.f225990j & j10)) - ((int) (j10 >> 32));
    }

    public static final int i(long j10) {
        return (int) (j10 >> 32);
    }

    public static int j(long j10) {
        return C1550p.a(j10);
    }

    public static String k(long j10) {
        return "SpanRange(packedValue=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f92198a, obj);
    }

    public final long g() {
        return this.f92198a;
    }

    public int hashCode() {
        return C1550p.a(this.f92198a);
    }

    public final /* synthetic */ long l() {
        return this.f92198a;
    }

    public String toString() {
        return k(this.f92198a);
    }
}
