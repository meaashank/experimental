package androidx.compose.ui.graphics;

import androidx.collection.C1550p;
import androidx.compose.animation.C1571b;
import androidx.compose.runtime.InterfaceC1924k0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public final class a3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f100930d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a3 f100931e = new a3(0, 0, 0.0f, 7, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f100932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f100933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f100934c;

    public static final class a {
        public a() {
        }

        @androidx.compose.runtime.T1
        public static /* synthetic */ void b() {
        }

        @NotNull
        public final a3 a() {
            return a3.f100931e;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ a3(long j10, long j11, float f10, C4969v c4969v) {
        this(j10, j11, f10);
    }

    public static a3 c(a3 a3Var, long j10, long j11, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = a3Var.f100932a;
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            j11 = a3Var.f100933b;
        }
        long j13 = j11;
        if ((i10 & 4) != 0) {
            f10 = a3Var.f100934c;
        }
        a3Var.getClass();
        return new a3(j12, j13, f10);
    }

    @androidx.compose.runtime.T1
    public static /* synthetic */ void e() {
    }

    @androidx.compose.runtime.T1
    public static /* synthetic */ void g() {
    }

    @androidx.compose.runtime.T1
    public static /* synthetic */ void i() {
    }

    @NotNull
    public final a3 b(long j10, long j11, float f10) {
        return new a3(j10, j11, f10);
    }

    public final float d() {
        return this.f100934c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3)) {
            return false;
        }
        a3 a3Var = (a3) obj;
        return K0.y(this.f100932a, a3Var.f100932a) && P.g.l(this.f100933b, a3Var.f100933b) && this.f100934c == a3Var.f100934c;
    }

    public final long f() {
        return this.f100932a;
    }

    public final long h() {
        return this.f100933b;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f100934c) + ((C1550p.a(this.f100933b) + (K0.K(this.f100932a) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Shadow(color=");
        sb2.append((Object) K0.L(this.f100932a));
        sb2.append(", offset=");
        sb2.append((Object) P.g.y(this.f100933b));
        sb2.append(", blurRadius=");
        return C1571b.a(sb2, this.f100934c, ')');
    }

    public a3(long j10, long j11, float f10) {
        this.f100932a = j10;
        this.f100933b = j11;
        this.f100934c = f10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a3(long j10, long j11, float f10, int i10, C4969v c4969v) {
        long jD = (i10 & 1) != 0 ? M0.d(4278190080L) : j10;
        if ((i10 & 2) != 0) {
            P.g.f65503b.getClass();
            j11 = P.g.f65504c;
        }
        this(jD, j11, (i10 & 4) != 0 ? 0.0f : f10);
    }
}
