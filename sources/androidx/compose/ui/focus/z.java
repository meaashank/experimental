package androidx.compose.ui.focus;

import androidx.compose.ui.p;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class z extends p.d implements x {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public A f100670o;

    public z(@NotNull A a10) {
        this.f100670o = a10;
    }

    @Override // androidx.compose.ui.focus.x
    public void Z1(@NotNull v vVar) {
        this.f100670o.a(vVar);
    }

    @NotNull
    public final A e3() {
        return this.f100670o;
    }

    public final void f3(@NotNull A a10) {
        this.f100670o = a10;
    }
}
