package F;

import G0.C1162y;
import androidx.compose.animation.C1571b;
import androidx.compose.ui.platform.InterfaceC2275r0;
import e.InterfaceC4348w;
import k0.InterfaceC4814e;
import kotlin.sequences.C4994g;
import kotlin.sequences.InterfaceC5000m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class l implements f, InterfaceC2275r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f33917a;

    public l(@InterfaceC4348w(from = 0.0d, to = C1162y.f40124b) float f10) {
        this.f33917a = f10;
        if (f10 < 0.0f || f10 > 100.0f) {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    private final float e() {
        return this.f33917a;
    }

    public static l g(l lVar, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = lVar.f33917a;
        }
        lVar.getClass();
        return new l(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC2275r0
    public InterfaceC5000m b() {
        return C4994g.f218169a;
    }

    @Override // F.f
    public float c(long j10, @NotNull InterfaceC4814e interfaceC4814e) {
        return (this.f33917a / 100.0f) * P.n.q(j10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC2275r0
    public /* synthetic */ String d() {
        return null;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Float.compare(this.f33917a, ((l) obj).f33917a) == 0;
    }

    @NotNull
    public final l f(@InterfaceC4348w(from = 0.0d, to = C1162y.f40124b) float f10) {
        return new l(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC2275r0
    @NotNull
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public String a() {
        return C1571b.a(new StringBuilder(), this.f33917a, '%');
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f33917a);
    }

    @NotNull
    public String toString() {
        return "CornerSize(size = " + this.f33917a + "%)";
    }
}
