package androidx.compose.ui.text.style;

import androidx.compose.animation.C1571b;
import androidx.compose.runtime.InterfaceC1924k0;
import androidx.compose.runtime.T1;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public final class n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f105036d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f105038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f105039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f105035c = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final n f105037e = new n(1.0f, 0.0f);

    public static final class a {
        public a() {
        }

        @T1
        public static /* synthetic */ void b() {
        }

        @NotNull
        public final n a() {
            return n.f105037e;
        }

        public a(C4969v c4969v) {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public n() {
        float f10 = 0.0f;
        this(f10, f10, 3, null);
    }

    public static n c(n nVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = nVar.f105038a;
        }
        if ((i10 & 2) != 0) {
            f11 = nVar.f105039b;
        }
        nVar.getClass();
        return new n(f10, f11);
    }

    @NotNull
    public final n b(float f10, float f11) {
        return new n(f10, f11);
    }

    public final float d() {
        return this.f105038a;
    }

    public final float e() {
        return this.f105039b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f105038a == nVar.f105038a && this.f105039b == nVar.f105039b;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f105039b) + (Float.floatToIntBits(this.f105038a) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("TextGeometricTransform(scaleX=");
        sb2.append(this.f105038a);
        sb2.append(", skewX=");
        return C1571b.a(sb2, this.f105039b, ')');
    }

    public n(float f10, float f11) {
        this.f105038a = f10;
        this.f105039b = f11;
    }

    public /* synthetic */ n(float f10, float f11, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 0.0f : f11);
    }
}
