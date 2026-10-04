package androidx.compose.foundation;

import androidx.compose.ui.layout.InterfaceC2188x;
import androidx.compose.ui.node.B0;
import androidx.compose.ui.node.InterfaceC2213q;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.p;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class Q extends p.d implements TraversableNode, InterfaceC2213q {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public static final a f88850r = new a();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f88851s = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f88852o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f88853p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public InterfaceC2188x f88854q;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    @Override // androidx.compose.ui.p.d
    public boolean H2() {
        return this.f88853p;
    }

    public final S e3() {
        if (this.f103127m) {
            TraversableNode traversableNodeA = B0.a(this, S.f88855q);
            if (traversableNodeA instanceof S) {
                return (S) traversableNodeA;
            }
        }
        return null;
    }

    public final void f3() {
        S sE3;
        InterfaceC2188x interfaceC2188x = this.f88854q;
        if (interfaceC2188x == null || !interfaceC2188x.H() || (sE3 = e3()) == null) {
            return;
        }
        sE3.f3(this.f88854q);
    }

    public final void g3(boolean z10) {
        if (z10 == this.f88852o) {
            return;
        }
        if (z10) {
            f3();
        } else {
            S sE3 = e3();
            if (sE3 != null) {
                sE3.f3(null);
            }
        }
        this.f88852o = z10;
    }

    @Override // androidx.compose.ui.node.InterfaceC2213q
    public void n0(@NotNull InterfaceC2188x interfaceC2188x) {
        this.f88854q = interfaceC2188x;
        if (this.f88852o) {
            if (interfaceC2188x.H()) {
                f3();
                return;
            }
            S sE3 = e3();
            if (sE3 != null) {
                sE3.f3(null);
            }
        }
    }

    @Override // androidx.compose.ui.node.TraversableNode
    @NotNull
    public Object v1() {
        return f88850r;
    }
}
