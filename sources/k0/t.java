package k0;

import androidx.activity.C1477d;
import androidx.collection.C1550p;
import androidx.compose.runtime.InterfaceC1924k0;
import androidx.compose.runtime.T1;
import kotlin.InterfaceC4850b0;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.V;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nIntOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,199:1\n107#2:200\n114#2:201\n100#2:202\n107#2,8:203\n107#2:211\n114#2:212\n100#2:213\n107#2:214\n114#2:215\n100#2:216\n107#2,8:217\n100#2:225\n107#2:226\n114#2:228\n100#2:230\n107#2:231\n114#2:233\n100#2:235\n107#2:236\n114#2:237\n100#2:238\n26#3:227\n26#3:229\n26#3:232\n26#3:234\n*S KotlinDebug\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n48#1:200\n55#1:201\n68#1:202\n67#1:203,8\n77#1:211\n78#1:212\n76#1:213\n89#1:214\n90#1:215\n88#1:216\n97#1:217,8\n97#1:225\n109#1:226\n110#1:228\n108#1:230\n124#1:231\n125#1:233\n123#1:235\n139#1:236\n140#1:237\n138#1:238\n109#1:227\n110#1:229\n124#1:232\n125#1:234\n*E\n"})
@dd.h
@InterfaceC1924k0
public final class t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f214328b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f214329c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f214330a;

    public static final class a {
        public a() {
        }

        public final long a() {
            return t.f214329c;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ t(long j10) {
        this.f214330a = j10;
    }

    public static final /* synthetic */ t b(long j10) {
        return new t(j10);
    }

    @T1
    public static final int c(long j10) {
        return (int) (j10 >> 32);
    }

    @T1
    public static final int d(long j10) {
        return (int) (j10 & ZipKt.f225990j);
    }

    public static final long f(long j10, int i10, int i11) {
        return (((long) i10) << 32) | (((long) i11) & ZipKt.f225990j);
    }

    public static /* synthetic */ long g(long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = (int) (j10 >> 32);
        }
        if ((i12 & 2) != 0) {
            i11 = (int) (ZipKt.f225990j & j10);
        }
        return f(j10, i10, i11);
    }

    @T1
    public static final long h(long j10, float f10) {
        return (((long) Math.round(((int) (j10 >> 32)) / f10)) << 32) | (((long) Math.round(((int) (j10 & ZipKt.f225990j)) / f10)) & ZipKt.f225990j);
    }

    public static boolean i(long j10, Object obj) {
        return (obj instanceof t) && j10 == ((t) obj).f214330a;
    }

    public static final boolean j(long j10, long j11) {
        return j10 == j11;
    }

    public static final int m(long j10) {
        return (int) (j10 >> 32);
    }

    public static final int o(long j10) {
        return (int) (j10 & ZipKt.f225990j);
    }

    public static int p(long j10) {
        return C1550p.a(j10);
    }

    @T1
    public static final long q(long j10, long j11) {
        return (((long) (((int) (j10 >> 32)) - ((int) (j11 >> 32)))) << 32) | (((long) (((int) (j10 & ZipKt.f225990j)) - ((int) (j11 & ZipKt.f225990j)))) & ZipKt.f225990j);
    }

    @T1
    public static final long r(long j10, long j11) {
        return (((long) (((int) (j10 >> 32)) + ((int) (j11 >> 32)))) << 32) | (((long) (((int) (j10 & ZipKt.f225990j)) + ((int) (j11 & ZipKt.f225990j)))) & ZipKt.f225990j);
    }

    @T1
    public static final long s(long j10, int i10) {
        return (((long) (((int) (j10 >> 32)) % i10)) << 32) | (((long) (((int) (j10 & ZipKt.f225990j)) % i10)) & ZipKt.f225990j);
    }

    @T1
    public static final long t(long j10, float f10) {
        return (((long) Math.round(((int) (j10 >> 32)) * f10)) << 32) | (((long) Math.round(((int) (j10 & ZipKt.f225990j)) * f10)) & ZipKt.f225990j);
    }

    @T1
    @NotNull
    public static String u(long j10) {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append((int) (j10 >> 32));
        sb2.append(U6.j.f68738d);
        return C1477d.a(sb2, (int) (j10 & ZipKt.f225990j), ')');
    }

    @T1
    public static final long v(long j10) {
        int i10 = -((int) (j10 >> 32));
        return (((long) (-((int) (j10 & ZipKt.f225990j)))) & ZipKt.f225990j) | (((long) i10) << 32);
    }

    public boolean equals(Object obj) {
        return i(this.f214330a, obj);
    }

    public int hashCode() {
        return C1550p.a(this.f214330a);
    }

    @T1
    @NotNull
    public String toString() {
        return u(this.f214330a);
    }

    public final /* synthetic */ long w() {
        return this.f214330a;
    }

    @InterfaceC4850b0
    public static /* synthetic */ void k() {
    }

    @T1
    public static /* synthetic */ void l() {
    }

    @T1
    public static /* synthetic */ void n() {
    }

    public static long e(long j10) {
        return j10;
    }
}
