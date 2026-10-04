package androidx.compose.ui.graphics;

import androidx.collection.C1550p;
import androidx.compose.runtime.InterfaceC1924k0;
import kotlin.InterfaceC4850b0;
import kotlin.jvm.internal.C4969v;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nTransformOrigin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformOrigin.kt\nandroidx/compose/ui/graphics/TransformOrigin\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,83:1\n72#2:84\n86#2:86\n22#3:85\n22#3:87\n*S KotlinDebug\n*F\n+ 1 TransformOrigin.kt\nandroidx/compose/ui/graphics/TransformOrigin\n*L\n46#1:84\n55#1:86\n46#1:85\n55#1:87\n*E\n"})
@dd.h
@InterfaceC1924k0
public final class k3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f101140b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f101141c = l3.a(0.5f, 0.5f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f101142a;

    public static final class a {
        public a() {
        }

        public final long a() {
            return k3.f101141c;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ k3(long j10) {
        this.f101142a = j10;
    }

    public static final /* synthetic */ k3 b(long j10) {
        return new k3(j10);
    }

    @androidx.compose.runtime.T1
    public static final float c(long j10) {
        return k(j10);
    }

    @androidx.compose.runtime.T1
    public static final float d(long j10) {
        return l(j10);
    }

    public static long e(long j10) {
        return j10;
    }

    public static final long f(long j10, float f10, float f11) {
        return l3.a(f10, f11);
    }

    public static long g(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = k(j10);
        }
        if ((i10 & 2) != 0) {
            f11 = l(j10);
        }
        return l3.a(f10, f11);
    }

    public static boolean h(long j10, Object obj) {
        return (obj instanceof k3) && j10 == ((k3) obj).f101142a;
    }

    public static final boolean i(long j10, long j11) {
        return j10 == j11;
    }

    @InterfaceC4850b0
    public static /* synthetic */ void j() {
    }

    public static final float k(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float l(long j10) {
        return Float.intBitsToFloat((int) (j10 & ZipKt.f225990j));
    }

    public static int m(long j10) {
        return C1550p.a(j10);
    }

    public static String n(long j10) {
        return "TransformOrigin(packedValue=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return h(this.f101142a, obj);
    }

    public int hashCode() {
        return C1550p.a(this.f101142a);
    }

    public final /* synthetic */ long o() {
        return this.f101142a;
    }

    public String toString() {
        return n(this.f101142a);
    }
}
