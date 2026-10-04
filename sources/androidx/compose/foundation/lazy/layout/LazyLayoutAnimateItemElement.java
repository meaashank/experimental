package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.U;
import androidx.compose.ui.node.W;
import androidx.compose.ui.platform.C2278s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class LazyLayoutAnimateItemElement extends W<C1733g> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f91590f = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final U<Float> f91591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final U<k0.t> f91592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final U<Float> f91593e;

    public LazyLayoutAnimateItemElement(@Nullable U<Float> u10, @Nullable U<k0.t> u11, @Nullable U<Float> u12) {
        this.f91591c = u10;
        this.f91592d = u11;
        this.f91593e = u12;
    }

    private final U<Float> i() {
        return this.f91591c;
    }

    public static LazyLayoutAnimateItemElement m(LazyLayoutAnimateItemElement lazyLayoutAnimateItemElement, U u10, U u11, U u12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            u10 = lazyLayoutAnimateItemElement.f91591c;
        }
        if ((i10 & 2) != 0) {
            u11 = lazyLayoutAnimateItemElement.f91592d;
        }
        if ((i10 & 4) != 0) {
            u12 = lazyLayoutAnimateItemElement.f91593e;
        }
        lazyLayoutAnimateItemElement.getClass();
        return new LazyLayoutAnimateItemElement(u10, u11, u12);
    }

    @Override // androidx.compose.ui.node.W
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutAnimateItemElement)) {
            return false;
        }
        LazyLayoutAnimateItemElement lazyLayoutAnimateItemElement = (LazyLayoutAnimateItemElement) obj;
        return kotlin.jvm.internal.G.g(this.f91591c, lazyLayoutAnimateItemElement.f91591c) && kotlin.jvm.internal.G.g(this.f91592d, lazyLayoutAnimateItemElement.f91592d) && kotlin.jvm.internal.G.g(this.f91593e, lazyLayoutAnimateItemElement.f91593e);
    }

    @Override // androidx.compose.ui.node.W
    public void f(@NotNull C2278s0 c2278s0) {
        c2278s0.f103927a = "animateItem";
        c2278s0.f103929c.c("fadeInSpec", this.f91591c);
        c2278s0.f103929c.c("placementSpec", this.f91592d);
        c2278s0.f103929c.c("fadeOutSpec", this.f91593e);
    }

    @Override // androidx.compose.ui.node.W
    public int hashCode() {
        U<Float> u10 = this.f91591c;
        int iHashCode = (u10 == null ? 0 : u10.hashCode()) * 31;
        U<k0.t> u11 = this.f91592d;
        int iHashCode2 = (iHashCode + (u11 == null ? 0 : u11.hashCode())) * 31;
        U<Float> u12 = this.f91593e;
        return iHashCode2 + (u12 != null ? u12.hashCode() : 0);
    }

    public final U<k0.t> j() {
        return this.f91592d;
    }

    public final U<Float> k() {
        return this.f91593e;
    }

    @NotNull
    public final LazyLayoutAnimateItemElement l(@Nullable U<Float> u10, @Nullable U<k0.t> u11, @Nullable U<Float> u12) {
        return new LazyLayoutAnimateItemElement(u10, u11, u12);
    }

    @Override // androidx.compose.ui.node.W
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public C1733g c() {
        return new C1733g(this.f91591c, this.f91592d, this.f91593e);
    }

    @Override // androidx.compose.ui.node.W
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void h(@NotNull C1733g c1733g) {
        c1733g.f91819o = this.f91591c;
        c1733g.f91820p = this.f91592d;
        c1733g.f91821q = this.f91593e;
    }

    @NotNull
    public String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.f91591c + ", placementSpec=" + this.f91592d + ", fadeOutSpec=" + this.f91593e + ')';
    }
}
