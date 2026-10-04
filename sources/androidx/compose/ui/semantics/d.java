package androidx.compose.ui.semantics;

import androidx.compose.ui.node.x0;
import androidx.compose.ui.p;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class d extends p.d implements x0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f104109r = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f104110o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f104111p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public ed.l<? super u, L0> f104112q;

    public d(boolean z10, boolean z11, @NotNull ed.l<? super u, L0> lVar) {
        this.f104110o = z10;
        this.f104111p = z11;
        this.f104112q = lVar;
    }

    @Override // androidx.compose.ui.node.x0
    public boolean B1() {
        return this.f104111p;
    }

    public final boolean e3() {
        return this.f104110o;
    }

    @NotNull
    public final ed.l<u, L0> f3() {
        return this.f104112q;
    }

    public final boolean g3() {
        return this.f104111p;
    }

    public final void h3(boolean z10) {
        this.f104111p = z10;
    }

    public final void i3(boolean z10) {
        this.f104110o = z10;
    }

    public final void j3(@NotNull ed.l<? super u, L0> lVar) {
        this.f104112q = lVar;
    }

    @Override // androidx.compose.ui.node.x0
    public void o0(@NotNull u uVar) {
        this.f104112q.invoke(uVar);
    }

    @Override // androidx.compose.ui.node.x0
    public boolean q1() {
        return this.f104110o;
    }
}
