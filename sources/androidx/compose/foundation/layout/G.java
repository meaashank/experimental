package androidx.compose.foundation.layout;

import androidx.compose.foundation.C1749o;
import androidx.compose.runtime.InterfaceC1924k0;
import androidx.compose.ui.unit.LayoutDirection;
import k0.InterfaceC4814e;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
@kotlin.jvm.internal.V({"SMAP\nWindowInsets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/FixedDpInsets\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,748:1\n1#2:749\n*E\n"})
public final class G implements P0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f90515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f90516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f90517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f90518e;

    public /* synthetic */ G(float f10, float f11, float f12, float f13, C4969v c4969v) {
        this(f10, f11, f12, f13);
    }

    @Override // androidx.compose.foundation.layout.P0
    public int a(@NotNull InterfaceC4814e interfaceC4814e) {
        return interfaceC4814e.I1(this.f90516c);
    }

    @Override // androidx.compose.foundation.layout.P0
    public int b(@NotNull InterfaceC4814e interfaceC4814e, @NotNull LayoutDirection layoutDirection) {
        return interfaceC4814e.I1(this.f90517d);
    }

    @Override // androidx.compose.foundation.layout.P0
    public int c(@NotNull InterfaceC4814e interfaceC4814e, @NotNull LayoutDirection layoutDirection) {
        return interfaceC4814e.I1(this.f90515b);
    }

    @Override // androidx.compose.foundation.layout.P0
    public int d(@NotNull InterfaceC4814e interfaceC4814e) {
        return interfaceC4814e.I1(this.f90518e);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g10 = (G) obj;
        return k0.i.l(this.f90515b, g10.f90515b) && k0.i.l(this.f90516c, g10.f90516c) && k0.i.l(this.f90517d, g10.f90517d) && k0.i.l(this.f90518e, g10.f90518e);
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f90518e) + androidx.compose.animation.B.a(this.f90517d, androidx.compose.animation.B.a(this.f90516c, Float.floatToIntBits(this.f90515b) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Insets(left=");
        C1749o.a(this.f90515b, sb2, ", top=");
        C1749o.a(this.f90516c, sb2, ", right=");
        C1749o.a(this.f90517d, sb2, ", bottom=");
        sb2.append((Object) k0.i.u(this.f90518e));
        sb2.append(')');
        return sb2.toString();
    }

    public G(float f10, float f11, float f12, float f13) {
        this.f90515b = f10;
        this.f90516c = f11;
        this.f90517d = f12;
        this.f90518e = f13;
    }
}
