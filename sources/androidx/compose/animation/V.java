package androidx.compose.animation;

import androidx.compose.runtime.InterfaceC1924k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public final class V {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f87537c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ed.l<k0.x, k0.t> f87538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final androidx.compose.animation.core.U<k0.t> f87539b;

    /* JADX WARN: Multi-variable type inference failed */
    public V(@NotNull ed.l<? super k0.x, k0.t> lVar, @NotNull androidx.compose.animation.core.U<k0.t> u10) {
        this.f87538a = lVar;
        this.f87539b = u10;
    }

    public static V d(V v10, ed.l lVar, androidx.compose.animation.core.U u10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = v10.f87538a;
        }
        if ((i10 & 2) != 0) {
            u10 = v10.f87539b;
        }
        v10.getClass();
        return new V(lVar, u10);
    }

    @NotNull
    public final ed.l<k0.x, k0.t> a() {
        return this.f87538a;
    }

    @NotNull
    public final androidx.compose.animation.core.U<k0.t> b() {
        return this.f87539b;
    }

    @NotNull
    public final V c(@NotNull ed.l<? super k0.x, k0.t> lVar, @NotNull androidx.compose.animation.core.U<k0.t> u10) {
        return new V(lVar, u10);
    }

    @NotNull
    public final androidx.compose.animation.core.U<k0.t> e() {
        return this.f87539b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V)) {
            return false;
        }
        V v10 = (V) obj;
        return kotlin.jvm.internal.G.g(this.f87538a, v10.f87538a) && kotlin.jvm.internal.G.g(this.f87539b, v10.f87539b);
    }

    @NotNull
    public final ed.l<k0.x, k0.t> f() {
        return this.f87538a;
    }

    public int hashCode() {
        return this.f87539b.hashCode() + (this.f87538a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "Slide(slideOffset=" + this.f87538a + ", animationSpec=" + this.f87539b + ')';
    }
}
