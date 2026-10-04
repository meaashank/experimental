package androidx.compose.foundation.layout;

import androidx.compose.runtime.M1;
import androidx.compose.runtime.T1;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@T1
@kotlin.jvm.internal.V({"SMAP\nWindowInsetsPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/InsetsConsumingModifier\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,490:1\n81#2:491\n107#2,2:492\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/InsetsConsumingModifier\n*L\n402#1:491\n402#1:492,2\n*E\n"})
public abstract class AbstractC1670b0 implements androidx.compose.ui.modifier.e, androidx.compose.ui.modifier.m<P0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.L0 f90871a;

    public /* synthetic */ AbstractC1670b0(C4969v c4969v) {
        this();
    }

    private final P0 b() {
        return (P0) this.f90871a.getValue();
    }

    private final void d(P0 p02) {
        this.f90871a.setValue(p02);
    }

    @Override // androidx.compose.ui.p.c, androidx.compose.ui.p
    public Object M(Object obj, ed.p pVar) {
        return pVar.invoke(this, obj);
    }

    @Override // androidx.compose.ui.p.c, androidx.compose.ui.p
    public /* synthetic */ boolean O(ed.l lVar) {
        return androidx.compose.ui.q.b(this, lVar);
    }

    @Override // androidx.compose.ui.p
    public /* synthetic */ androidx.compose.ui.p P0(androidx.compose.ui.p pVar) {
        return androidx.compose.ui.o.a(this, pVar);
    }

    @Override // androidx.compose.ui.p.c, androidx.compose.ui.p
    public /* synthetic */ boolean S(ed.l lVar) {
        return androidx.compose.ui.q.a(this, lVar);
    }

    @NotNull
    public abstract P0 a(@NotNull P0 p02);

    @Override // androidx.compose.ui.modifier.e
    public void a2(@NotNull androidx.compose.ui.modifier.n nVar) {
        d(a((P0) nVar.H(WindowInsetsPaddingKt.c())));
    }

    @Override // androidx.compose.ui.modifier.m
    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public P0 getValue() {
        return b();
    }

    @Override // androidx.compose.ui.modifier.m
    @NotNull
    public androidx.compose.ui.modifier.p<P0> getKey() {
        return WindowInsetsPaddingKt.c();
    }

    @Override // androidx.compose.ui.p.c, androidx.compose.ui.p
    public Object l0(Object obj, ed.p pVar) {
        return pVar.invoke(obj, this);
    }

    public AbstractC1670b0() {
        this.f90871a = M1.g(new H(0, 0, 0, 0), null, 2, null);
    }
}
