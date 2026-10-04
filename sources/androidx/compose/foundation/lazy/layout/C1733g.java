package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.U;
import androidx.compose.ui.node.n0;
import androidx.compose.ui.p;
import k0.InterfaceC4814e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C1733g extends p.d implements n0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f91818r = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public U<Float> f91819o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public U<k0.t> f91820p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public U<Float> f91821q;

    public C1733g(@Nullable U<Float> u10, @Nullable U<k0.t> u11, @Nullable U<Float> u12) {
        this.f91819o = u10;
        this.f91820p = u11;
        this.f91821q = u12;
    }

    @Nullable
    public final U<Float> e3() {
        return this.f91819o;
    }

    @Nullable
    public final U<Float> f3() {
        return this.f91821q;
    }

    @Nullable
    public final U<k0.t> g3() {
        return this.f91820p;
    }

    public final void h3(@Nullable U<Float> u10) {
        this.f91819o = u10;
    }

    public final void i3(@Nullable U<Float> u10) {
        this.f91821q = u10;
    }

    public final void j3(@Nullable U<k0.t> u10) {
        this.f91820p = u10;
    }

    @Override // androidx.compose.ui.node.n0
    @NotNull
    public Object h0(@NotNull InterfaceC4814e interfaceC4814e, @Nullable Object obj) {
        return this;
    }
}
