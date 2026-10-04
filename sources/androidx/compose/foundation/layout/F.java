package androidx.compose.foundation.layout;

import androidx.compose.ui.p;
import k0.InterfaceC4814e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class F extends p.d implements androidx.compose.ui.node.n0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f90365p = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f90366o;

    public F(float f10) {
        this.f90366o = f10;
    }

    public final float e3() {
        return this.f90366o;
    }

    @Override // androidx.compose.ui.node.n0
    @NotNull
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public A0 h0(@NotNull InterfaceC4814e interfaceC4814e, @Nullable Object obj) {
        A0 a02 = obj instanceof A0 ? (A0) obj : null;
        if (a02 == null) {
            a02 = new A0(0.0f, false, null, null, 15, null);
        }
        P p10 = a02.f90177d;
        if (p10 == null) {
            p10 = new P(this.f90366o);
        }
        a02.f90177d = p10;
        p10.f90607a = this.f90366o;
        return a02;
    }

    public final void g3(float f10) {
        this.f90366o = f10;
    }
}
