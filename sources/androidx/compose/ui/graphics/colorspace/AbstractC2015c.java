package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.M0;
import e.Y;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nColorSpace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpace\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,802:1\n63#2,3:803\n*S KotlinDebug\n*F\n+ 1 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpace\n*L\n290#1:803,3\n*E\n"})
public abstract class AbstractC2015c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f100985d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f100986e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f100987f = 63;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f100988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f100989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f100990c;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.c$a */
    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    public AbstractC2015c(String str, long j10) {
        this(str, j10, -1);
    }

    @Y(min = 3)
    @NotNull
    public final float[] a(float f10, float f11, float f12) {
        float[] fArr = new float[C2014b.j(this.f100989b)];
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[2] = f12;
        return b(fArr);
    }

    @Y(min = 3)
    @NotNull
    public abstract float[] b(@Y(min = 3) @NotNull float[] fArr);

    @e.D(from = 1, to = 4)
    public final int c() {
        return C2014b.j(this.f100989b);
    }

    public final int d() {
        return this.f100990c;
    }

    public abstract float e(@e.D(from = 0, to = 3) int i10);

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC2015c abstractC2015c = (AbstractC2015c) obj;
        if (this.f100990c == abstractC2015c.f100990c && G.g(this.f100988a, abstractC2015c.f100988a)) {
            return C2014b.h(this.f100989b, abstractC2015c.f100989b);
        }
        return false;
    }

    public abstract float f(@e.D(from = 0, to = 3) int i10);

    public final long g() {
        return this.f100989b;
    }

    @NotNull
    public final String h() {
        return this.f100988a;
    }

    public int hashCode() {
        return ((C2014b.k(this.f100989b) + (this.f100988a.hashCode() * 31)) * 31) + this.f100990c;
    }

    public boolean i() {
        return false;
    }

    public abstract boolean j();

    public long k(float f10, float f11, float f12) {
        float[] fArrL = l(f10, f11, f12);
        float f13 = fArrL[0];
        float f14 = fArrL[1];
        return (((long) Float.floatToRawIntBits(f13)) << 32) | (((long) Float.floatToRawIntBits(f14)) & ZipKt.f225990j);
    }

    @Y(3)
    @NotNull
    public final float[] l(float f10, float f11, float f12) {
        return m(new float[]{f10, f11, f12});
    }

    @Y(min = 3)
    @NotNull
    public abstract float[] m(@Y(min = 3) @NotNull float[] fArr);

    public float n(float f10, float f11, float f12) {
        return l(f10, f11, f12)[2];
    }

    public long o(float f10, float f11, float f12, float f13, @NotNull AbstractC2015c abstractC2015c) {
        float[] fArrA = a(f10, f11, f12);
        return M0.a(fArrA[0], fArrA[1], fArrA[2], f13, abstractC2015c);
    }

    @NotNull
    public String toString() {
        return this.f100988a + " (id=" + this.f100990c + ", model=" + ((Object) C2014b.l(this.f100989b)) + ')';
    }

    public /* synthetic */ AbstractC2015c(String str, long j10, int i10, C4969v c4969v) {
        this(str, j10, i10);
    }

    public AbstractC2015c(String str, long j10, C4969v c4969v) {
        this(str, j10, -1);
    }

    public AbstractC2015c(String str, long j10, int i10) {
        this.f100988a = str;
        this.f100989b = j10;
        this.f100990c = i10;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i10 < -1 || i10 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }
}
