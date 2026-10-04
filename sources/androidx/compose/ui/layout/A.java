package androidx.compose.ui.layout;

import androidx.compose.ui.p;
import k0.InterfaceC4814e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class A extends p.d implements androidx.compose.ui.node.n0, B {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f102373p = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public Object f102374o;

    public A(@NotNull Object obj) {
        this.f102374o = obj;
    }

    @Override // androidx.compose.ui.layout.B
    @NotNull
    public Object W1() {
        return this.f102374o;
    }

    public void e3(@NotNull Object obj) {
        this.f102374o = obj;
    }

    @Override // androidx.compose.ui.node.n0
    @Nullable
    public Object h0(@NotNull InterfaceC4814e interfaceC4814e, @Nullable Object obj) {
        return this;
    }
}
