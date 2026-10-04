package k0;

import androidx.collection.C1550p;
import androidx.compose.runtime.InterfaceC1924k0;
import androidx.compose.runtime.T1;
import kotlin.InterfaceC4850b0;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.V;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nIntSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,146:1\n107#2:147\n114#2:148\n107#2:149\n114#2:150\n100#2:151\n107#2:152\n114#2:153\n100#2:154\n*S KotlinDebug\n*F\n+ 1 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n46#1:147\n53#1:148\n67#1:149\n68#1:150\n66#1:151\n78#1:152\n79#1:153\n77#1:154\n*E\n"})
@dd.h
@InterfaceC1924k0
public final class x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f214338b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f214339c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f214340a;

    public static final class a {
        public a() {
        }

        public final long a() {
            return x.f214339c;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ x(long j10) {
        this.f214340a = j10;
    }

    public static final /* synthetic */ x b(long j10) {
        return new x(j10);
    }

    @T1
    public static final int c(long j10) {
        return (int) (j10 >> 32);
    }

    @T1
    public static final int d(long j10) {
        return (int) (j10 & ZipKt.f225990j);
    }

    @T1
    public static final long f(long j10, int i10) {
        return (((long) (((int) (j10 >> 32)) / i10)) << 32) | (((long) (((int) (j10 & ZipKt.f225990j)) / i10)) & ZipKt.f225990j);
    }

    public static boolean g(long j10, Object obj) {
        return (obj instanceof x) && j10 == ((x) obj).f214340a;
    }

    public static final boolean h(long j10, long j11) {
        return j10 == j11;
    }

    public static final int j(long j10) {
        return (int) (j10 & ZipKt.f225990j);
    }

    public static final int m(long j10) {
        return (int) (j10 >> 32);
    }

    public static int n(long j10) {
        return C1550p.a(j10);
    }

    @T1
    public static final long o(long j10, int i10) {
        return (((long) (((int) (j10 >> 32)) * i10)) << 32) | (((long) (((int) (j10 & ZipKt.f225990j)) * i10)) & ZipKt.f225990j);
    }

    @T1
    @NotNull
    public static String p(long j10) {
        return ((int) (j10 >> 32)) + " x " + ((int) (j10 & ZipKt.f225990j));
    }

    public boolean equals(Object obj) {
        return g(this.f214340a, obj);
    }

    public int hashCode() {
        return C1550p.a(this.f214340a);
    }

    public final /* synthetic */ long q() {
        return this.f214340a;
    }

    @T1
    @NotNull
    public String toString() {
        return p(this.f214340a);
    }

    @T1
    public static /* synthetic */ void i() {
    }

    @InterfaceC4850b0
    public static /* synthetic */ void k() {
    }

    @T1
    public static /* synthetic */ void l() {
    }

    public static long e(long j10) {
        return j10;
    }
}
