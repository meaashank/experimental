package androidx.compose.animation;

import androidx.compose.runtime.InterfaceC1924k0;
import androidx.compose.ui.graphics.k3;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public final class M {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f87356d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f87357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f87358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final androidx.compose.animation.core.U<Float> f87359c;

    public /* synthetic */ M(float f10, long j10, androidx.compose.animation.core.U u10, C4969v c4969v) {
        this(f10, j10, u10);
    }

    public static M e(M m10, float f10, long j10, androidx.compose.animation.core.U u10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = m10.f87357a;
        }
        if ((i10 & 2) != 0) {
            j10 = m10.f87358b;
        }
        if ((i10 & 4) != 0) {
            u10 = m10.f87359c;
        }
        m10.getClass();
        return new M(f10, j10, u10);
    }

    public final float a() {
        return this.f87357a;
    }

    public final long b() {
        return this.f87358b;
    }

    @NotNull
    public final androidx.compose.animation.core.U<Float> c() {
        return this.f87359c;
    }

    @NotNull
    public final M d(float f10, long j10, @NotNull androidx.compose.animation.core.U<Float> u10) {
        return new M(f10, j10, u10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m10 = (M) obj;
        return Float.compare(this.f87357a, m10.f87357a) == 0 && k3.i(this.f87358b, m10.f87358b) && kotlin.jvm.internal.G.g(this.f87359c, m10.f87359c);
    }

    @NotNull
    public final androidx.compose.animation.core.U<Float> f() {
        return this.f87359c;
    }

    public final float g() {
        return this.f87357a;
    }

    public final long h() {
        return this.f87358b;
    }

    public int hashCode() {
        return this.f87359c.hashCode() + ((k3.m(this.f87358b) + (Float.floatToIntBits(this.f87357a) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "Scale(scale=" + this.f87357a + ", transformOrigin=" + ((Object) k3.n(this.f87358b)) + ", animationSpec=" + this.f87359c + ')';
    }

    public M(float f10, long j10, androidx.compose.animation.core.U<Float> u10) {
        this.f87357a = f10;
        this.f87358b = j10;
        this.f87359c = u10;
    }
}
