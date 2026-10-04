package androidx.compose.foundation.layout;

import androidx.compose.runtime.M1;
import androidx.compose.ui.unit.LayoutDirection;
import k0.InterfaceC4814e;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nWindowInsets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/MutableWindowInsets\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,748:1\n81#2:749\n107#2,2:750\n*S KotlinDebug\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/MutableWindowInsets\n*L\n83#1:749\n83#1:750,2\n*E\n"})
@E
@androidx.compose.runtime.internal.r(parameters = 1)
public final class C1690l0 implements P0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f90928c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.L0 f90929b;

    public C1690l0() {
        this(null, 1, null);
    }

    @Override // androidx.compose.foundation.layout.P0
    public int a(@NotNull InterfaceC4814e interfaceC4814e) {
        return e().a(interfaceC4814e);
    }

    @Override // androidx.compose.foundation.layout.P0
    public int b(@NotNull InterfaceC4814e interfaceC4814e, @NotNull LayoutDirection layoutDirection) {
        return e().b(interfaceC4814e, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.P0
    public int c(@NotNull InterfaceC4814e interfaceC4814e, @NotNull LayoutDirection layoutDirection) {
        return e().c(interfaceC4814e, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.P0
    public int d(@NotNull InterfaceC4814e interfaceC4814e) {
        return e().d(interfaceC4814e);
    }

    @NotNull
    public final P0 e() {
        return (P0) this.f90929b.getValue();
    }

    public final void f(@NotNull P0 p02) {
        this.f90929b.setValue(p02);
    }

    public C1690l0(@NotNull P0 p02) {
        this.f90929b = M1.g(p02, null, 2, null);
    }

    public C1690l0(P0 p02, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? new H(0, 0, 0, 0) : p02);
    }
}
