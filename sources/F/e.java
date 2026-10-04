package F;

import androidx.compose.runtime.internal.r;
import androidx.compose.ui.graphics.AbstractC2098q2;
import androidx.compose.ui.graphics.c3;
import androidx.compose.ui.unit.LayoutDirection;
import k0.InterfaceC4814e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 1)
public abstract class e implements c3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f33907e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final f f33908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final f f33909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final f f33910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final f f33911d;

    public e(@NotNull f fVar, @NotNull f fVar2, @NotNull f fVar3, @NotNull f fVar4) {
        this.f33908a = fVar;
        this.f33909b = fVar2;
        this.f33910c = fVar3;
        this.f33911d = fVar4;
    }

    public static /* synthetic */ e d(e eVar, f fVar, f fVar2, f fVar3, f fVar4, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i10 & 1) != 0) {
            fVar = eVar.f33908a;
        }
        if ((i10 & 2) != 0) {
            fVar2 = eVar.f33909b;
        }
        if ((i10 & 4) != 0) {
            fVar3 = eVar.f33910c;
        }
        if ((i10 & 8) != 0) {
            fVar4 = eVar.f33911d;
        }
        return eVar.c(fVar, fVar2, fVar3, fVar4);
    }

    @Override // androidx.compose.ui.graphics.c3
    @NotNull
    public final AbstractC2098q2 a(long j10, @NotNull LayoutDirection layoutDirection, @NotNull InterfaceC4814e interfaceC4814e) {
        float fC = this.f33908a.c(j10, interfaceC4814e);
        float fC2 = this.f33909b.c(j10, interfaceC4814e);
        float fC3 = this.f33910c.c(j10, interfaceC4814e);
        float fC4 = this.f33911d.c(j10, interfaceC4814e);
        float fQ = P.n.q(j10);
        float f10 = fC + fC4;
        if (f10 > fQ) {
            float f11 = fQ / f10;
            fC *= f11;
            fC4 *= f11;
        }
        float f12 = fC2 + fC3;
        if (f12 > fQ) {
            float f13 = fQ / f12;
            fC2 *= f13;
            fC3 *= f13;
        }
        if (fC >= 0.0f && fC2 >= 0.0f && fC3 >= 0.0f && fC4 >= 0.0f) {
            return e(j10, fC, fC2, fC3, fC4, layoutDirection);
        }
        throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + fC + ", topEnd = " + fC2 + ", bottomEnd = " + fC3 + ", bottomStart = " + fC4 + ")!").toString());
    }

    @NotNull
    public final e b(@NotNull f fVar) {
        return c(fVar, fVar, fVar, fVar);
    }

    @NotNull
    public abstract e c(@NotNull f fVar, @NotNull f fVar2, @NotNull f fVar3, @NotNull f fVar4);

    @NotNull
    public abstract AbstractC2098q2 e(long j10, float f10, float f11, float f12, float f13, @NotNull LayoutDirection layoutDirection);

    @NotNull
    public final f f() {
        return this.f33910c;
    }

    @NotNull
    public final f g() {
        return this.f33911d;
    }

    @NotNull
    public final f h() {
        return this.f33909b;
    }

    @NotNull
    public final f i() {
        return this.f33908a;
    }
}
