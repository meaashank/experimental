package androidx.compose.ui.node;

import androidx.compose.ui.p;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class A0 extends p.d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f102644p = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f102645o;

    public A0() {
        this.f103118d = 0;
    }

    @Override // androidx.compose.ui.p.d
    public void O2() {
        this.f102645o = true;
    }

    @Override // androidx.compose.ui.p.d
    public void P2() {
        this.f102645o = false;
    }

    public final boolean e3() {
        return this.f102645o;
    }

    public final void f3(boolean z10) {
        this.f102645o = z10;
    }

    @NotNull
    public String toString() {
        return "<tail>";
    }
}
