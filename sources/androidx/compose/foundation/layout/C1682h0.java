package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.InterfaceC2183s;
import androidx.compose.ui.layout.InterfaceC2185u;
import k0.C4811b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1682h0 extends IntrinsicSizeModifier {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public IntrinsicSize f90919o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f90920p;

    public C1682h0(@NotNull IntrinsicSize intrinsicSize, boolean z10) {
        this.f90919o = intrinsicSize;
        this.f90920p = z10;
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.ui.node.C
    public int U(@NotNull InterfaceC2185u interfaceC2185u, @NotNull InterfaceC2183s interfaceC2183s, int i10) {
        return this.f90919o == IntrinsicSize.Min ? interfaceC2183s.w0(i10) : interfaceC2183s.z0(i10);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.ui.node.C
    public int X(@NotNull InterfaceC2185u interfaceC2185u, @NotNull InterfaceC2183s interfaceC2183s, int i10) {
        return this.f90919o == IntrinsicSize.Min ? interfaceC2183s.w0(i10) : interfaceC2183s.z0(i10);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    public long e3(@NotNull androidx.compose.ui.layout.V v10, @NotNull androidx.compose.ui.layout.O o10, long j10) {
        int iW0 = this.f90919o == IntrinsicSize.Min ? o10.w0(C4811b.n(j10)) : o10.z0(C4811b.n(j10));
        if (iW0 < 0) {
            iW0 = 0;
        }
        return C4811b.f214282b.e(iW0);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    public boolean f3() {
        return this.f90920p;
    }

    @NotNull
    public final IntrinsicSize g3() {
        return this.f90919o;
    }

    public void h3(boolean z10) {
        this.f90920p = z10;
    }

    public final void i3(@NotNull IntrinsicSize intrinsicSize) {
        this.f90919o = intrinsicSize;
    }
}
