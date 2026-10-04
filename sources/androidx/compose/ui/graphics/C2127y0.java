package androidx.compose.ui.graphics;

import android.graphics.RenderEffect;
import androidx.compose.runtime.InterfaceC1924k0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public final class C2127y0 extends Q2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Q2 f101789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f101790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f101791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f101792e;

    public /* synthetic */ C2127y0(Q2 q22, float f10, float f11, int i10, C4969v c4969v) {
        this(q22, f10, f11, i10);
    }

    @Override // androidx.compose.ui.graphics.Q2
    @e.T(31)
    @NotNull
    public RenderEffect b() {
        return W2.f100889a.a(this.f101789b, this.f101790c, this.f101791d, this.f101792e);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2127y0)) {
            return false;
        }
        C2127y0 c2127y0 = (C2127y0) obj;
        return this.f101790c == c2127y0.f101790c && this.f101791d == c2127y0.f101791d && this.f101792e == c2127y0.f101792e && kotlin.jvm.internal.G.g(this.f101789b, c2127y0.f101789b);
    }

    public int hashCode() {
        Q2 q22 = this.f101789b;
        return androidx.compose.animation.B.a(this.f101791d, androidx.compose.animation.B.a(this.f101790c, (q22 != null ? q22.hashCode() : 0) * 31, 31), 31) + this.f101792e;
    }

    @NotNull
    public String toString() {
        return "BlurEffect(renderEffect=" + this.f101789b + ", radiusX=" + this.f101790c + ", radiusY=" + this.f101791d + ", edgeTreatment=" + ((Object) i3.j(this.f101792e)) + ')';
    }

    public C2127y0(Q2 q22, float f10, float f11, int i10) {
        this.f101789b = q22;
        this.f101790c = f10;
        this.f101791d = f11;
        this.f101792e = i10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2127y0(Q2 q22, float f10, float f11, int i10, int i11, C4969v c4969v) {
        f11 = (i11 & 4) != 0 ? f10 : f11;
        if ((i11 & 8) != 0) {
            i3.f101130b.getClass();
            i10 = i3.f101131c;
        }
        this(q22, f10, f11, i10);
    }
}
