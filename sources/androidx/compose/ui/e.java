package androidx.compose.ui;

import androidx.compose.animation.C1571b;
import androidx.compose.runtime.InterfaceC1924k0;
import androidx.compose.ui.c;
import androidx.compose.ui.unit.LayoutDirection;
import k0.y;
import kotlin.jvm.internal.V;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
@V({"SMAP\nAlignment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAbsoluteAlignment\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,273:1\n26#2:274\n*S KotlinDebug\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAbsoluteAlignment\n*L\n246#1:274\n*E\n"})
public final class e implements c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f100527d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f100528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f100529c;

    @V({"SMAP\nAlignment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAbsoluteAlignment$Horizontal\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,273:1\n26#2:274\n*S KotlinDebug\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAbsoluteAlignment$Horizontal\n*L\n269#1:274\n*E\n"})
    @InterfaceC1924k0
    public static final class a implements c.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f100530b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f100531a;

        public a(float f10) {
            this.f100531a = f10;
        }

        public static a d(a aVar, float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = aVar.f100531a;
            }
            aVar.getClass();
            return new a(f10);
        }

        @Override // androidx.compose.ui.c.b
        public int a(int i10, int i11, @NotNull LayoutDirection layoutDirection) {
            return Math.round((1 + this.f100531a) * ((i11 - i10) / 2.0f));
        }

        public final float b() {
            return this.f100531a;
        }

        @NotNull
        public final a c(float f10) {
            return new a(f10);
        }

        public final float e() {
            return this.f100531a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Float.compare(this.f100531a, ((a) obj).f100531a) == 0;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f100531a);
        }

        @NotNull
        public String toString() {
            return C1571b.a(new StringBuilder("Horizontal(bias="), this.f100531a, ')');
        }
    }

    public e(float f10, float f11) {
        this.f100528b = f10;
        this.f100529c = f11;
    }

    public static e e(e eVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = eVar.f100528b;
        }
        if ((i10 & 2) != 0) {
            f11 = eVar.f100529c;
        }
        eVar.getClass();
        return new e(f10, f11);
    }

    @Override // androidx.compose.ui.c
    public long a(long j10, long j11, @NotNull LayoutDirection layoutDirection) {
        long jA = y.a(((int) (j11 >> 32)) - ((int) (j10 >> 32)), ((int) (j11 & ZipKt.f225990j)) - ((int) (j10 & ZipKt.f225990j)));
        float f10 = 1;
        return k0.u.a(Math.round((this.f100528b + f10) * (((int) (jA >> 32)) / 2.0f)), Math.round((f10 + this.f100529c) * (((int) (jA & ZipKt.f225990j)) / 2.0f)));
    }

    public final float b() {
        return this.f100528b;
    }

    public final float c() {
        return this.f100529c;
    }

    @NotNull
    public final e d(float f10, float f11) {
        return new e(f10, f11);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f100528b, eVar.f100528b) == 0 && Float.compare(this.f100529c, eVar.f100529c) == 0;
    }

    public final float f() {
        return this.f100528b;
    }

    public final float g() {
        return this.f100529c;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f100529c) + (Float.floatToIntBits(this.f100528b) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BiasAbsoluteAlignment(horizontalBias=");
        sb2.append(this.f100528b);
        sb2.append(", verticalBias=");
        return C1571b.a(sb2, this.f100529c, ')');
    }
}
