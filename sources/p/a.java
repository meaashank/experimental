package P;

import androidx.collection.C1550p;
import androidx.compose.runtime.InterfaceC1924k0;
import androidx.compose.runtime.T1;
import kotlin.InterfaceC4850b0;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.V;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nCornerRadius.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,164:1\n72#2:165\n86#2:167\n22#3:166\n22#3:168\n*S KotlinDebug\n*F\n+ 1 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n*L\n49#1:165\n53#1:167\n49#1:166\n53#1:168\n*E\n"})
@dd.h
@InterfaceC1924k0
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C0093a f65487b = new C0093a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f65488c = b.b(0.0f, 0.0f, 2, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f65489a;

    /* JADX INFO: renamed from: P.a$a, reason: collision with other inner class name */
    public static final class C0093a {
        public C0093a() {
        }

        public final long a() {
            return a.f65488c;
        }

        public C0093a(C4969v c4969v) {
        }

        @T1
        public static /* synthetic */ void b() {
        }
    }

    public /* synthetic */ a(long j10) {
        this.f65489a = j10;
    }

    public static final /* synthetic */ a b(long j10) {
        return new a(j10);
    }

    @T1
    public static final float c(long j10) {
        return m(j10);
    }

    @T1
    public static final float d(long j10) {
        return o(j10);
    }

    public static final long f(long j10, float f10, float f11) {
        return b.a(f10, f11);
    }

    public static long g(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = m(j10);
        }
        if ((i10 & 2) != 0) {
            f11 = o(j10);
        }
        return b.a(f10, f11);
    }

    @T1
    public static final long h(long j10, float f10) {
        return b.a(m(j10) / f10, o(j10) / f10);
    }

    public static boolean i(long j10, Object obj) {
        return (obj instanceof a) && j10 == ((a) obj).f65489a;
    }

    public static final boolean j(long j10, long j11) {
        return j10 == j11;
    }

    public static final float m(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float o(long j10) {
        return Float.intBitsToFloat((int) (j10 & ZipKt.f225990j));
    }

    public static int p(long j10) {
        return C1550p.a(j10);
    }

    @T1
    public static final long q(long j10, long j11) {
        return b.a(m(j10) - m(j11), o(j10) - o(j11));
    }

    @T1
    public static final long r(long j10, long j11) {
        return b.a(m(j11) + m(j10), o(j11) + o(j10));
    }

    @T1
    public static final long s(long j10, float f10) {
        return b.a(m(j10) * f10, o(j10) * f10);
    }

    @NotNull
    public static String t(long j10) {
        if (m(j10) == o(j10)) {
            return "CornerRadius.circular(" + c.a(m(j10), 1) + ')';
        }
        return "CornerRadius.elliptical(" + c.a(m(j10), 1) + U6.j.f68738d + c.a(o(j10), 1) + ')';
    }

    @T1
    public static final long u(long j10) {
        return b.a(-m(j10), -o(j10));
    }

    public boolean equals(Object obj) {
        return i(this.f65489a, obj);
    }

    public int hashCode() {
        return C1550p.a(this.f65489a);
    }

    @NotNull
    public String toString() {
        return t(this.f65489a);
    }

    public final /* synthetic */ long v() {
        return this.f65489a;
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
