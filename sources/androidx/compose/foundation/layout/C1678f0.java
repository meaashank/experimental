package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.InterfaceC2183s;
import androidx.compose.ui.layout.InterfaceC2185u;
import k0.C4811b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1678f0 extends IntrinsicSizeModifier {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public IntrinsicSize f90915o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f90916p;

    public C1678f0(@NotNull IntrinsicSize intrinsicSize, boolean z10) {
        this.f90915o = intrinsicSize;
        this.f90916p = z10;
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.ui.node.C
    public int d0(@NotNull InterfaceC2185u interfaceC2185u, @NotNull InterfaceC2183s interfaceC2183s, int i10) {
        return this.f90915o == IntrinsicSize.Min ? interfaceC2183s.r0(i10) : interfaceC2183s.h0(i10);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    public long e3(@NotNull androidx.compose.ui.layout.V v10, @NotNull androidx.compose.ui.layout.O o10, long j10) {
        int iR0 = this.f90915o == IntrinsicSize.Min ? o10.r0(C4811b.o(j10)) : o10.h0(C4811b.o(j10));
        if (iR0 < 0) {
            iR0 = 0;
        }
        return C4811b.f214282b.d(iR0);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    public boolean f3() {
        return this.f90916p;
    }

    @NotNull
    public final IntrinsicSize g3() {
        return this.f90915o;
    }

    public void h3(boolean z10) {
        this.f90916p = z10;
    }

    public final void i3(@NotNull IntrinsicSize intrinsicSize) {
        this.f90915o = intrinsicSize;
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.ui.node.C
    public int k0(@NotNull InterfaceC2185u interfaceC2185u, @NotNull InterfaceC2183s interfaceC2183s, int i10) {
        return this.f90915o == IntrinsicSize.Min ? interfaceC2183s.r0(i10) : interfaceC2183s.h0(i10);
    }
}
