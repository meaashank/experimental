package androidx.compose.ui.node;

import kotlin.L0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class ObserverNodeOwnerScope implements m0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f102977c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final g0 f102979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f102976b = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final ed.l<ObserverNodeOwnerScope, L0> f102978d = new ed.l<ObserverNodeOwnerScope, L0>() { // from class: androidx.compose.ui.node.ObserverNodeOwnerScope$Companion$OnObserveReadsChanged$1
        public final void e(@NotNull ObserverNodeOwnerScope observerNodeOwnerScope) {
            if (observerNodeOwnerScope.R0()) {
                observerNodeOwnerScope.f102979a.E1();
            }
        }

        @Override // ed.l
        public /* bridge */ /* synthetic */ L0 invoke(ObserverNodeOwnerScope observerNodeOwnerScope) {
            e(observerNodeOwnerScope);
            return L0.f217464a;
        }
    };

    public static final class a {
        public a() {
        }

        @NotNull
        public final ed.l<ObserverNodeOwnerScope, L0> a() {
            return ObserverNodeOwnerScope.f102978d;
        }

        public a(C4969v c4969v) {
        }
    }

    public ObserverNodeOwnerScope(@NotNull g0 g0Var) {
        this.f102979a = g0Var;
    }

    @Override // androidx.compose.ui.node.m0
    public boolean R0() {
        return this.f102979a.g0().f103127m;
    }

    @NotNull
    public final g0 b() {
        return this.f102979a;
    }
}
