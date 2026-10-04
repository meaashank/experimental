package androidx.compose.ui;

import androidx.compose.runtime.D;
import androidx.compose.ui.node.C2204h;
import androidx.compose.ui.p;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class h extends p.d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f101803p = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public D f101804o;

    public h(@NotNull D d10) {
        this.f101804o = d10;
    }

    @Override // androidx.compose.ui.p.d
    public void O2() {
        C2204h.r(this).n(this.f101804o);
    }

    @NotNull
    public final D e3() {
        return this.f101804o;
    }

    public final void f3(@NotNull D d10) {
        this.f101804o = d10;
        C2204h.r(this).n(d10);
    }
}
