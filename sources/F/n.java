package F;

import androidx.compose.runtime.internal.r;
import androidx.compose.ui.graphics.AbstractC2098q2;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 1)
public final class n extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f33919f = 0;

    public n(@NotNull f fVar, @NotNull f fVar2, @NotNull f fVar3, @NotNull f fVar4) {
        super(fVar, fVar2, fVar3, fVar4);
    }

    @Override // F.e
    public e c(f fVar, f fVar2, f fVar3, f fVar4) {
        return new n(fVar, fVar2, fVar3, fVar4);
    }

    @Override // F.e
    @NotNull
    public AbstractC2098q2 e(long j10, float f10, float f11, float f12, float f13, @NotNull LayoutDirection layoutDirection) {
        if (f10 + f11 + f12 + f13 == 0.0f) {
            return new AbstractC2098q2.b(P.o.m(j10));
        }
        P.j jVarM = P.o.m(j10);
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        return new AbstractC2098q2.c(P.m.c(jVarM, P.b.b(layoutDirection == layoutDirection2 ? f10 : f11, 0.0f, 2, null), P.b.b(layoutDirection == layoutDirection2 ? f11 : f10, 0.0f, 2, null), P.b.b(layoutDirection == layoutDirection2 ? f12 : f13, 0.0f, 2, null), P.b.b(layoutDirection == layoutDirection2 ? f13 : f12, 0.0f, 2, null)));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return G.g(this.f33908a, nVar.f33908a) && G.g(this.f33909b, nVar.f33909b) && G.g(this.f33910c, nVar.f33910c) && G.g(this.f33911d, nVar.f33911d);
    }

    public int hashCode() {
        return this.f33911d.hashCode() + ((this.f33910c.hashCode() + ((this.f33909b.hashCode() + (this.f33908a.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public n j(@NotNull f fVar, @NotNull f fVar2, @NotNull f fVar3, @NotNull f fVar4) {
        return new n(fVar, fVar2, fVar3, fVar4);
    }

    @NotNull
    public String toString() {
        return "RoundedCornerShape(topStart = " + this.f33908a + ", topEnd = " + this.f33909b + ", bottomEnd = " + this.f33910c + ", bottomStart = " + this.f33911d + ')';
    }
}
