package androidx.compose.foundation.layout;

import androidx.compose.ui.p;
import k0.InterfaceC4814e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C1686j0 extends p.d implements androidx.compose.ui.node.n0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f90923q = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f90924o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f90925p;

    public C1686j0(float f10, boolean z10) {
        this.f90924o = f10;
        this.f90925p = z10;
    }

    public final boolean e3() {
        return this.f90925p;
    }

    public final float f3() {
        return this.f90924o;
    }

    @Override // androidx.compose.ui.node.n0
    @NotNull
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public A0 h0(@NotNull InterfaceC4814e interfaceC4814e, @Nullable Object obj) {
        A0 a02 = obj instanceof A0 ? (A0) obj : null;
        if (a02 == null) {
            a02 = new A0(0.0f, false, null, null, 15, null);
        }
        a02.f90174a = this.f90924o;
        a02.f90175b = this.f90925p;
        return a02;
    }

    public final void h3(boolean z10) {
        this.f90925p = z10;
    }

    public final void i3(float f10) {
        this.f90924o = f10;
    }
}
