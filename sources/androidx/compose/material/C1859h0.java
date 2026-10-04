package androidx.compose.material;

import androidx.compose.foundation.layout.P0;
import androidx.compose.runtime.M1;
import androidx.compose.ui.unit.LayoutDirection;
import k0.InterfaceC4814e;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.material.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nMutableWindowInsets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableWindowInsets.kt\nandroidx/compose/material/MutableWindowInsets\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,49:1\n81#2:50\n107#2,2:51\n*S KotlinDebug\n*F\n+ 1 MutableWindowInsets.kt\nandroidx/compose/material/MutableWindowInsets\n*L\n40#1:50\n40#1:51,2\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 1)
public final class C1859h0 implements P0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f98557c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.L0 f98558b;

    public C1859h0() {
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
        return (P0) this.f98558b.getValue();
    }

    public final void f(@NotNull P0 p02) {
        this.f98558b.setValue(p02);
    }

    public C1859h0(@NotNull P0 p02) {
        this.f98558b = M1.g(p02, null, 2, null);
    }

    public C1859h0(P0 p02, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? new androidx.compose.foundation.layout.H(0, 0, 0, 0) : p02);
    }
}
