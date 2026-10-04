package androidx.compose.ui;

import androidx.compose.animation.C1571b;
import androidx.compose.runtime.InterfaceC1924k0;
import androidx.compose.ui.c;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.V;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
@V({"SMAP\nAlignment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAlignment\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,273:1\n26#2:274\n*S KotlinDebug\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAlignment\n*L\n174#1:274\n*E\n"})
public final class f implements c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f100532d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f100533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f100534c;

    @V({"SMAP\nAlignment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAlignment$Horizontal\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,273:1\n26#2:274\n*S KotlinDebug\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAlignment$Horizontal\n*L\n194#1:274\n*E\n"})
    @InterfaceC1924k0
    public static final class a implements c.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f100535b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f100536a;

        public a(float f10) {
            this.f100536a = f10;
        }

        public static a d(a aVar, float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = aVar.f100536a;
            }
            aVar.getClass();
            return new a(f10);
        }

        @Override // androidx.compose.ui.c.b
        public int a(int i10, int i11, @NotNull LayoutDirection layoutDirection) {
            return Math.round((1 + (layoutDirection == LayoutDirection.Ltr ? this.f100536a : (-1) * this.f100536a)) * ((i11 - i10) / 2.0f));
        }

        public final float b() {
            return this.f100536a;
        }

        @NotNull
        public final a c(float f10) {
            return new a(f10);
        }

        public final float e() {
            return this.f100536a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Float.compare(this.f100536a, ((a) obj).f100536a) == 0;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f100536a);
        }

        @NotNull
        public String toString() {
            return C1571b.a(new StringBuilder("Horizontal(bias="), this.f100536a, ')');
        }
    }

    @V({"SMAP\nAlignment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAlignment$Vertical\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,273:1\n26#2:274\n*S KotlinDebug\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAlignment$Vertical\n*L\n213#1:274\n*E\n"})
    @InterfaceC1924k0
    public static final class b implements c.InterfaceC0245c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f100537b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f100538a;

        public b(float f10) {
            this.f100538a = f10;
        }

        public static b d(b bVar, float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = bVar.f100538a;
            }
            bVar.getClass();
            return new b(f10);
        }

        @Override // androidx.compose.ui.c.InterfaceC0245c
        public int a(int i10, int i11) {
            return Math.round((1 + this.f100538a) * ((i11 - i10) / 2.0f));
        }

        public final float b() {
            return this.f100538a;
        }

        @NotNull
        public final b c(float f10) {
            return new b(f10);
        }

        public final float e() {
            return this.f100538a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Float.compare(this.f100538a, ((b) obj).f100538a) == 0;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f100538a);
        }

        @NotNull
        public String toString() {
            return C1571b.a(new StringBuilder("Vertical(bias="), this.f100538a, ')');
        }
    }

    public f(float f10, float f11) {
        this.f100533b = f10;
        this.f100534c = f11;
    }

    public static f e(f fVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = fVar.f100533b;
        }
        if ((i10 & 2) != 0) {
            f11 = fVar.f100534c;
        }
        fVar.getClass();
        return new f(f10, f11);
    }

    @Override // androidx.compose.ui.c
    public long a(long j10, long j11, @NotNull LayoutDirection layoutDirection) {
        float f10 = (((int) (j11 >> 32)) - ((int) (j10 >> 32))) / 2.0f;
        float f11 = (((int) (j11 & ZipKt.f225990j)) - ((int) (j10 & ZipKt.f225990j))) / 2.0f;
        float f12 = 1;
        return k0.u.a(Math.round(((layoutDirection == LayoutDirection.Ltr ? this.f100533b : (-1) * this.f100533b) + f12) * f10), Math.round((f12 + this.f100534c) * f11));
    }

    public final float b() {
        return this.f100533b;
    }

    public final float c() {
        return this.f100534c;
    }

    @NotNull
    public final f d(float f10, float f11) {
        return new f(f10, f11);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Float.compare(this.f100533b, fVar.f100533b) == 0 && Float.compare(this.f100534c, fVar.f100534c) == 0;
    }

    public final float f() {
        return this.f100533b;
    }

    public final float g() {
        return this.f100534c;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f100534c) + (Float.floatToIntBits(this.f100533b) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BiasAlignment(horizontalBias=");
        sb2.append(this.f100533b);
        sb2.append(", verticalBias=");
        return C1571b.a(sb2, this.f100534c, ')');
    }
}
