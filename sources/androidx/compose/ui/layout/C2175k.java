package androidx.compose.ui.layout;

import k0.C4811b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.layout.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C2175k implements O {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f102582d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC2183s f102583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IntrinsicMinMax f102584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final IntrinsicWidthHeight f102585c;

    public C2175k(@NotNull InterfaceC2183s interfaceC2183s, @NotNull IntrinsicMinMax intrinsicMinMax, @NotNull IntrinsicWidthHeight intrinsicWidthHeight) {
        this.f102583a = interfaceC2183s;
        this.f102584b = intrinsicMinMax;
        this.f102585c = intrinsicWidthHeight;
    }

    @Override // androidx.compose.ui.layout.O
    @NotNull
    public v0 B0(long j10) {
        if (this.f102585c == IntrinsicWidthHeight.Width) {
            return new C2179n(this.f102584b == IntrinsicMinMax.Max ? this.f102583a.z0(C4811b.n(j10)) : this.f102583a.w0(C4811b.n(j10)), C4811b.h(j10) ? C4811b.n(j10) : 32767);
        }
        return new C2179n(C4811b.i(j10) ? C4811b.o(j10) : 32767, this.f102584b == IntrinsicMinMax.Max ? this.f102583a.h0(C4811b.o(j10)) : this.f102583a.r0(C4811b.o(j10)));
    }

    @NotNull
    public final InterfaceC2183s a() {
        return this.f102583a;
    }

    @Override // androidx.compose.ui.layout.InterfaceC2183s
    @Nullable
    public Object g() {
        return this.f102583a.g();
    }

    @Override // androidx.compose.ui.layout.InterfaceC2183s
    public int h0(int i10) {
        return this.f102583a.h0(i10);
    }

    @Override // androidx.compose.ui.layout.InterfaceC2183s
    public int r0(int i10) {
        return this.f102583a.r0(i10);
    }

    @Override // androidx.compose.ui.layout.InterfaceC2183s
    public int w0(int i10) {
        return this.f102583a.w0(i10);
    }

    @Override // androidx.compose.ui.layout.InterfaceC2183s
    public int z0(int i10) {
        return this.f102583a.z0(i10);
    }
}
