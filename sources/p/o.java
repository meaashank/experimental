package P;

import androidx.compose.runtime.T1;
import ed.InterfaceC4376a;
import kotlin.jvm.internal.V;
import n0.C5238e;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,285:1\n198#1:289\n63#2,3:286\n72#2:290\n86#2:292\n63#2,3:294\n72#2:297\n86#2:299\n22#3:291\n22#3:293\n22#3:298\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n212#1:289\n34#1:286,3\n239#1:290\n240#1:292\n238#1:294,3\n283#1:297\n283#1:299\n239#1:291\n240#1:293\n283#1:298\n*E\n"})
public final class o {
    @T1
    public static final long a(float f10, float f11) {
        return (((long) Float.floatToRawIntBits(f11)) & ZipKt.f225990j) | (Float.floatToRawIntBits(f10) << 32);
    }

    public static final long b(long j10) {
        if (j10 != d.f65493d) {
            return h.a(Float.intBitsToFloat((int) (j10 >> 32)) / 2.0f, Float.intBitsToFloat((int) (j10 & ZipKt.f225990j)) / 2.0f);
        }
        d.b("Size is unspecified");
        throw null;
    }

    public static final boolean d(long j10) {
        return j10 != d.f65493d;
    }

    public static final boolean f(long j10) {
        return j10 == d.f65493d;
    }

    @T1
    public static final long h(long j10, long j11, float f10) {
        if (j10 == d.f65493d || j11 == d.f65493d) {
            d.b("Offset is unspecified");
            throw null;
        }
        float fJ = C5238e.j(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j11 >> 32)), f10);
        float fJ2 = C5238e.j(Float.intBitsToFloat((int) (j10 & ZipKt.f225990j)), Float.intBitsToFloat((int) (j11 & ZipKt.f225990j)), f10);
        return (((long) Float.floatToRawIntBits(fJ)) << 32) | (((long) Float.floatToRawIntBits(fJ2)) & ZipKt.f225990j);
    }

    public static final long i(long j10, @NotNull InterfaceC4376a<n> interfaceC4376a) {
        return j10 != d.f65493d ? j10 : interfaceC4376a.invoke().f65530a;
    }

    @T1
    public static final long j(double d10, long j10) {
        return n.w(j10, (float) d10);
    }

    @T1
    public static final long k(float f10, long j10) {
        return n.w(j10, f10);
    }

    @T1
    public static final long l(int i10, long j10) {
        return n.w(j10, i10);
    }

    @T1
    @NotNull
    public static final j m(long j10) {
        g.f65503b.getClass();
        return k.c(g.f65504c, j10);
    }

    @T1
    public static /* synthetic */ void c(long j10) {
    }

    @T1
    public static /* synthetic */ void e(long j10) {
    }

    @T1
    public static /* synthetic */ void g(long j10) {
    }
}
