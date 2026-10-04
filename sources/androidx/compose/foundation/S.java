package androidx.compose.foundation;

import androidx.compose.ui.layout.InterfaceC2188x;
import androidx.compose.ui.node.B0;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.p;
import kotlin.L0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class S extends p.d implements TraversableNode {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final a f88855q = new a();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f88856r = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public ed.l<? super InterfaceC2188x, L0> f88857o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Object f88858p = f88855q;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    public S(@NotNull ed.l<? super InterfaceC2188x, L0> lVar) {
        this.f88857o = lVar;
    }

    @NotNull
    public final ed.l<InterfaceC2188x, L0> e3() {
        return this.f88857o;
    }

    public final void f3(@Nullable InterfaceC2188x interfaceC2188x) {
        this.f88857o.invoke(interfaceC2188x);
        S s10 = (S) B0.b(this);
        if (s10 != null) {
            s10.f3(interfaceC2188x);
        }
    }

    public final void g3(@NotNull ed.l<? super InterfaceC2188x, L0> lVar) {
        this.f88857o = lVar;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    @NotNull
    public Object v1() {
        return this.f88858p;
    }
}
