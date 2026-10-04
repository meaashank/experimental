package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.B;
import androidx.compose.ui.c;
import androidx.compose.ui.p;
import k0.InterfaceC4814e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C1668a0 extends p.d implements androidx.compose.ui.node.n0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f90866p = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public c.b f90867o;

    public C1668a0(@NotNull c.b bVar) {
        this.f90867o = bVar;
    }

    @NotNull
    public final c.b e3() {
        return this.f90867o;
    }

    @Override // androidx.compose.ui.node.n0
    @NotNull
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public A0 h0(@NotNull InterfaceC4814e interfaceC4814e, @Nullable Object obj) {
        A0 a02 = obj instanceof A0 ? (A0) obj : null;
        if (a02 == null) {
            a02 = new A0(0.0f, false, null, null, 15, null);
        }
        B.c cVar = B.f90242a;
        c.b bVar = this.f90867o;
        cVar.getClass();
        a02.f90176c = new B.e(bVar);
        return a02;
    }

    public final void g3(@NotNull c.b bVar) {
        this.f90867o = bVar;
    }
}
