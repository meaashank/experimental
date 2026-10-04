package androidx.compose.ui.graphics;

import android.graphics.Paint;
import android.graphics.Shader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class X implements InterfaceC2105s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public Paint f100890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f100891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Shader f100892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public L0 f100893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public InterfaceC2121w2 f100894e;

    public X(@NotNull Paint paint) {
        this.f100890a = paint;
        C2099r0.f101402b.getClass();
        this.f100891b = C2099r0.f101406f;
    }

    @Override // androidx.compose.ui.graphics.InterfaceC2105s2
    public float A() {
        return this.f100890a.getStrokeMiter();
    }

    @Override // androidx.compose.ui.graphics.InterfaceC2105s2
    @NotNull
    public Paint B() {
        return this.f100890a;
    }

    @Override // androidx.compose.ui.graphics.InterfaceC2105s2
    @Nullable
    public Shader C() {
        return this.f100892c;
    }

    @Override // androidx.compose.ui.graphics.InterfaceC2105s2
    public void D(float f10) {
        this.f100890a.setStrokeMiter(f10);
    }

    @Override // androidx.compose.ui.graphics.InterfaceC2105s2
    public boolean E() {
        return this.f100890a.isAntiAlias();
    }

    @Override // androidx.compose.ui.graphics.InterfaceC2105s2
    public void F(int i10) {
        Y.y(this.f100890a, i10);
    }

    @Override // androidx.compose.ui.graphics.InterfaceC2105s2
    public void G(float f10) {
        this.f100890a.setStrokeWidth(f10);
    }

    @Override // androidx.compose.ui.graphics.InterfaceC2105s2
    public float H() {
        return this.f100890a.getStrokeWidth();
    }

    @Override // androidx.compose.ui.graphics.InterfaceC2105s2
    public int I() {
        return Y.k(this.f100890a);
    }

    @Override // androidx.compose.ui.graphics.InterfaceC2105s2
    public void J(@Nullable InterfaceC2121w2 interfaceC2121w2) {
        Y.s(this.f100890a, interfaceC2121w2);
        this.f100894e = interfaceC2121w2;
    }

    @Override // androidx.compose.ui.graphics.InterfaceC2105s2
    @Nullable
    public InterfaceC2121w2 K() {
        return this.f100894e;
    }

    @Override // androidx.compose.ui.graphics.InterfaceC2105s2
    public void L(@Nullable Shader shader) {
        this.f100892c = shader;
        this.f100890a.setShader(shader);
    }

    @Override // androidx.compose.ui.graphics.InterfaceC2105s2
    public int M() {
        return Y.f(this.f100890a);
    }

    @Override // androidx.compose.ui.graphics.InterfaceC2105s2
    public long a() {
        return Y.e(this.f100890a);
    }

    @Override // androidx.compose.ui.graphics.InterfaceC2105s2
    public void b(int i10) {
        if (this.f100891b == i10) {
            return;
        }
        this.f100891b = i10;
        Y.o(this.f100890a, i10);
    }

    @Override // androidx.compose.ui.graphics.InterfaceC2105s2
    @Nullable
    public L0 c() {
        return this.f100893d;
    }

    @Override // androidx.compose.ui.graphics.InterfaceC2105s2
    public float f() {
        return Y.c(this.f100890a);
    }

    @Override // androidx.compose.ui.graphics.InterfaceC2105s2
    public int g() {
        return this.f100891b;
    }

    @Override // androidx.compose.ui.graphics.InterfaceC2105s2
    public void h(float f10) {
        Y.m(this.f100890a, f10);
    }

    @Override // androidx.compose.ui.graphics.InterfaceC2105s2
    public void s(@Nullable L0 l02) {
        this.f100893d = l02;
        Y.q(this.f100890a, l02);
    }

    @Override // androidx.compose.ui.graphics.InterfaceC2105s2
    public void t(boolean z10) {
        this.f100890a.setAntiAlias(z10);
    }

    @Override // androidx.compose.ui.graphics.InterfaceC2105s2
    public void u(int i10) {
        Y.u(this.f100890a, i10);
    }

    @Override // androidx.compose.ui.graphics.InterfaceC2105s2
    public void v(int i10) {
        Y.r(this.f100890a, i10);
    }

    @Override // androidx.compose.ui.graphics.InterfaceC2105s2
    public int w() {
        return Y.g(this.f100890a);
    }

    @Override // androidx.compose.ui.graphics.InterfaceC2105s2
    public void x(int i10) {
        Y.v(this.f100890a, i10);
    }

    @Override // androidx.compose.ui.graphics.InterfaceC2105s2
    public void y(long j10) {
        Y.p(this.f100890a, j10);
    }

    @Override // androidx.compose.ui.graphics.InterfaceC2105s2
    public int z() {
        return Y.h(this.f100890a);
    }

    public X() {
        this(Y.l());
    }
}
