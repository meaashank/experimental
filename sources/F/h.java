package F;

import androidx.compose.runtime.internal.r;
import androidx.compose.ui.graphics.AbstractC2098q2;
import androidx.compose.ui.graphics.C2031g0;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Z;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 1)
public final class h extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f33913f = 0;

    public h(@NotNull f fVar, @NotNull f fVar2, @NotNull f fVar3, @NotNull f fVar4) {
        super(fVar, fVar2, fVar3, fVar4);
    }

    @Override // F.e
    public e c(f fVar, f fVar2, f fVar3, f fVar4) {
        return new h(fVar, fVar2, fVar3, fVar4);
    }

    @Override // F.e
    @NotNull
    public AbstractC2098q2 e(long j10, float f10, float f11, float f12, float f13, @NotNull LayoutDirection layoutDirection) {
        if (f10 + f11 + f13 + f12 == 0.0f) {
            return new AbstractC2098q2.b(P.o.m(j10));
        }
        Path pathA = C2031g0.a();
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        float f14 = layoutDirection == layoutDirection2 ? f10 : f11;
        Z z10 = (Z) pathA;
        z10.q(0.0f, f14);
        z10.s(f14, 0.0f);
        if (layoutDirection == layoutDirection2) {
            f10 = f11;
        }
        z10.s(P.n.t(j10) - f10, 0.0f);
        z10.s(P.n.t(j10), f10);
        float f15 = layoutDirection == layoutDirection2 ? f12 : f13;
        z10.s(P.n.t(j10), P.n.m(j10) - f15);
        z10.s(P.n.t(j10) - f15, P.n.m(j10));
        if (layoutDirection == layoutDirection2) {
            f12 = f13;
        }
        z10.s(f12, P.n.m(j10));
        z10.s(0.0f, P.n.m(j10) - f12);
        z10.close();
        return new AbstractC2098q2.a(pathA);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return G.g(this.f33908a, hVar.f33908a) && G.g(this.f33909b, hVar.f33909b) && G.g(this.f33910c, hVar.f33910c) && G.g(this.f33911d, hVar.f33911d);
    }

    public int hashCode() {
        return this.f33911d.hashCode() + ((this.f33910c.hashCode() + ((this.f33909b.hashCode() + (this.f33908a.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public h j(@NotNull f fVar, @NotNull f fVar2, @NotNull f fVar3, @NotNull f fVar4) {
        return new h(fVar, fVar2, fVar3, fVar4);
    }

    @NotNull
    public String toString() {
        return "CutCornerShape(topStart = " + this.f33908a + ", topEnd = " + this.f33909b + ", bottomEnd = " + this.f33910c + ", bottomStart = " + this.f33911d + ')';
    }
}
