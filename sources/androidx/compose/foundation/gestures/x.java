package androidx.compose.foundation.gestures;

import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.p;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class x extends p.d implements TraversableNode {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final a f90112q = new a();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f90113r = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Object f90114o = f90112q;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f90115p;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    public x(boolean z10) {
        this.f90115p = z10;
    }

    public final boolean e3() {
        return this.f90115p;
    }

    public final void f3(boolean z10) {
        this.f90115p = z10;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    @NotNull
    public Object v1() {
        return this.f90114o;
    }
}
