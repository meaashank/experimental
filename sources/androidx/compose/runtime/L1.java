package androidx.compose.runtime;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class L1 {
    @NotNull
    public static final <T> H1<T> a() {
        M0 m02 = M0.f99140a;
        kotlin.jvm.internal.G.n(m02, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>");
        return m02;
    }

    @NotNull
    public static final <T> H1<T> b() {
        C1925k1 c1925k1 = C1925k1.f99948a;
        kotlin.jvm.internal.G.n(c1925k1, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy>");
        return c1925k1;
    }

    @NotNull
    public static final <T> H1<T> c() {
        a2 a2Var = a2.f99414a;
        kotlin.jvm.internal.G.n(a2Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        return a2Var;
    }
}
