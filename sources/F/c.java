package F;

import androidx.compose.runtime.internal.r;
import androidx.compose.ui.graphics.AbstractC2098q2;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 1)
public final class c extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f33906f = 0;

    public c(@NotNull f fVar, @NotNull f fVar2, @NotNull f fVar3, @NotNull f fVar4) {
        super(fVar, fVar2, fVar3, fVar4);
    }

    @Override // F.e
    public e c(f fVar, f fVar2, f fVar3, f fVar4) {
        return new c(fVar, fVar2, fVar3, fVar4);
    }

    @Override // F.e
    @NotNull
    public AbstractC2098q2 e(long j10, float f10, float f11, float f12, float f13, @NotNull LayoutDirection layoutDirection) {
        return ((f10 + f11) + f12) + f13 == 0.0f ? new AbstractC2098q2.b(P.o.m(j10)) : new AbstractC2098q2.c(P.m.c(P.o.m(j10), P.b.b(f10, 0.0f, 2, null), P.b.b(f11, 0.0f, 2, null), P.b.b(f12, 0.0f, 2, null), P.b.b(f13, 0.0f, 2, null)));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return G.g(this.f33908a, cVar.f33908a) && G.g(this.f33909b, cVar.f33909b) && G.g(this.f33910c, cVar.f33910c) && G.g(this.f33911d, cVar.f33911d);
    }

    public int hashCode() {
        return this.f33911d.hashCode() + ((this.f33910c.hashCode() + ((this.f33909b.hashCode() + (this.f33908a.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public c j(@NotNull f fVar, @NotNull f fVar2, @NotNull f fVar3, @NotNull f fVar4) {
        return new c(fVar, fVar2, fVar3, fVar4);
    }

    public final long k(float f10) {
        return P.b.b(f10, 0.0f, 2, null);
    }

    @NotNull
    public String toString() {
        return "AbsoluteRoundedCornerShape(topLeft = " + this.f33908a + ", topRight = " + this.f33909b + ", bottomRight = " + this.f33910c + ", bottomLeft = " + this.f33911d + ')';
    }
}
