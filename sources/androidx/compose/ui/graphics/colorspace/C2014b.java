package androidx.compose.ui.graphics.colorspace;

import androidx.collection.C1550p;
import androidx.compose.runtime.InterfaceC1924k0;
import androidx.compose.runtime.T1;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.V;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nColorModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorModel.kt\nandroidx/compose/ui/graphics/colorspace/ColorModel\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,91:1\n107#2:92\n100#2:93\n100#2:94\n100#2:95\n100#2:96\n*S KotlinDebug\n*F\n+ 1 ColorModel.kt\nandroidx/compose/ui/graphics/colorspace/ColorModel\n*L\n49#1:92\n58#1:93\n65#1:94\n72#1:95\n80#1:96\n*E\n"})
@dd.h
@InterfaceC1924k0
public final class C2014b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f100979b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f100980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f100981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f100982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f100983f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f100984a;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.b$a */
    public static final class a {
        public a() {
        }

        public final long a() {
            return C2014b.f100983f;
        }

        public final long b() {
            return C2014b.f100982e;
        }

        public final long c() {
            return C2014b.f100980c;
        }

        public final long d() {
            return C2014b.f100981d;
        }

        public a(C4969v c4969v) {
        }
    }

    static {
        long j10 = 3;
        long j11 = j10 << 32;
        f100980c = (((long) 0) & ZipKt.f225990j) | j11;
        f100981d = (((long) 1) & ZipKt.f225990j) | j11;
        f100982e = j11 | (((long) 2) & ZipKt.f225990j);
        f100983f = (j10 & ZipKt.f225990j) | (((long) 4) << 32);
    }

    public /* synthetic */ C2014b(long j10) {
        this.f100984a = j10;
    }

    public static final /* synthetic */ C2014b e(long j10) {
        return new C2014b(j10);
    }

    public static long f(long j10) {
        return j10;
    }

    public static boolean g(long j10, Object obj) {
        return (obj instanceof C2014b) && j10 == ((C2014b) obj).f100984a;
    }

    public static final boolean h(long j10, long j11) {
        return j10 == j11;
    }

    @T1
    public static /* synthetic */ void i() {
    }

    @e.D(from = 1, to = 4)
    public static final int j(long j10) {
        return (int) (j10 >> 32);
    }

    public static int k(long j10) {
        return C1550p.a(j10);
    }

    @NotNull
    public static String l(long j10) {
        return h(j10, f100980c) ? "Rgb" : h(j10, f100981d) ? "Xyz" : h(j10, f100982e) ? "Lab" : h(j10, f100983f) ? "Cmyk" : "Unknown";
    }

    public boolean equals(Object obj) {
        return g(this.f100984a, obj);
    }

    public int hashCode() {
        return C1550p.a(this.f100984a);
    }

    public final /* synthetic */ long m() {
        return this.f100984a;
    }

    @NotNull
    public String toString() {
        return l(this.f100984a);
    }
}
