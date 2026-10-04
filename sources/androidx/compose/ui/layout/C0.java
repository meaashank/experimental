package androidx.compose.ui.layout;

import androidx.collection.C1550p;
import androidx.compose.runtime.InterfaceC1924k0;
import androidx.compose.runtime.T1;
import kotlin.InterfaceC4850b0;
import kotlin.jvm.internal.C4969v;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nScaleFactor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactor\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,199:1\n42#2,7:200\n42#2,7:209\n72#3:207\n86#3:216\n22#4:208\n22#4:217\n*S KotlinDebug\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactor\n*L\n49#1:200,7\n63#1:209,7\n52#1:207\n66#1:216\n52#1:208\n66#1:217\n*E\n"})
@dd.h
@InterfaceC1924k0
public final class C0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f102390b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f102391c = D0.a(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f102392a;

    public static final class a {
        public a() {
        }

        @T1
        public static /* synthetic */ void b() {
        }

        public final long a() {
            return C0.f102391c;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ C0(long j10) {
        this.f102392a = j10;
    }

    public static final /* synthetic */ C0 b(long j10) {
        return new C0(j10);
    }

    @T1
    public static final float c(long j10) {
        return m(j10);
    }

    @T1
    public static final float d(long j10) {
        return o(j10);
    }

    public static long e(long j10) {
        return j10;
    }

    public static final long f(long j10, float f10, float f11) {
        return D0.a(f10, f11);
    }

    public static long g(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = m(j10);
        }
        if ((i10 & 2) != 0) {
            f11 = o(j10);
        }
        return D0.a(f10, f11);
    }

    @T1
    public static final long h(long j10, float f10) {
        return D0.a(m(j10) / f10, o(j10) / f10);
    }

    public static boolean i(long j10, Object obj) {
        return (obj instanceof C0) && j10 == ((C0) obj).f102392a;
    }

    public static final boolean j(long j10, long j11) {
        return j10 == j11;
    }

    @InterfaceC4850b0
    public static /* synthetic */ void k() {
    }

    @T1
    public static /* synthetic */ void l() {
    }

    public static final float m(long j10) {
        if (j10 != f102391c) {
            return Float.intBitsToFloat((int) (j10 >> 32));
        }
        W.a.g("ScaleFactor is unspecified");
        throw null;
    }

    @T1
    public static /* synthetic */ void n() {
    }

    public static final float o(long j10) {
        if (j10 != f102391c) {
            return Float.intBitsToFloat((int) (j10 & ZipKt.f225990j));
        }
        W.a.g("ScaleFactor is unspecified");
        throw null;
    }

    public static int p(long j10) {
        return C1550p.a(j10);
    }

    @T1
    public static final long q(long j10, float f10) {
        return D0.a(m(j10) * f10, o(j10) * f10);
    }

    @NotNull
    public static String r(long j10) {
        return "ScaleFactor(" + D0.i(m(j10)) + U6.j.f68738d + D0.i(o(j10)) + ')';
    }

    public boolean equals(Object obj) {
        return i(this.f102392a, obj);
    }

    public int hashCode() {
        return C1550p.a(this.f102392a);
    }

    public final /* synthetic */ long s() {
        return this.f102392a;
    }

    @NotNull
    public String toString() {
        return r(this.f102392a);
    }
}
