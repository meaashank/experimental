package androidx.compose.ui.graphics;

import androidx.compose.runtime.InterfaceC1924k0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public final class d3 extends AbstractC2131z0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f101064c;

    public d3(long j10) {
        this.f101064c = j10;
    }

    @Override // androidx.compose.ui.graphics.AbstractC2131z0
    public void a(long j10, @NotNull InterfaceC2105s2 interfaceC2105s2, float f10) {
        long jW;
        interfaceC2105s2.h(1.0f);
        if (f10 == 1.0f) {
            jW = this.f101064c;
        } else {
            long j11 = this.f101064c;
            jW = K0.w(j11, K0.A(j11) * f10, 0.0f, 0.0f, 0.0f, 14, null);
        }
        interfaceC2105s2.y(jW);
        if (interfaceC2105s2.C() != null) {
            interfaceC2105s2.L(null);
        }
    }

    public final long c() {
        return this.f101064c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d3) && K0.y(this.f101064c, ((d3) obj).f101064c);
    }

    public int hashCode() {
        return K0.K(this.f101064c);
    }

    @NotNull
    public String toString() {
        return "SolidColor(value=" + ((Object) K0.L(this.f101064c)) + ')';
    }

    public /* synthetic */ d3(long j10, C4969v c4969v) {
        this(j10);
    }
}
