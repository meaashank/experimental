package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Q2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.platform.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2246h0 {
    void A(float f10);

    float B();

    void C(int i10);

    float D();

    float E();

    void F(int i10);

    @NotNull
    C2249i0 G();

    boolean H();

    boolean I(boolean z10);

    void J(@NotNull Matrix matrix);

    void K(int i10);

    int L();

    void M(float f10);

    void N(float f10);

    void O(@Nullable Outline outline);

    void P(boolean z10);

    int Q();

    void R(@NotNull Matrix matrix);

    boolean S(int i10, int i11, int i12, int i13);

    int T();

    boolean U();

    int V();

    void W(@NotNull androidx.compose.ui.graphics.D0 d02, @Nullable Path path, @NotNull ed.l<? super androidx.compose.ui.graphics.C0, kotlin.L0> lVar);

    int X();

    void Y(int i10);

    void Z(int i10);

    boolean a();

    float a0();

    long b();

    int c();

    int d();

    void e();

    float f();

    void g(@NotNull Canvas canvas);

    int getHeight();

    int getWidth();

    void h(float f10);

    @Nullable
    Q2 i();

    void j(float f10);

    void k(boolean z10);

    float l();

    void m(float f10);

    void n(float f10);

    void o(float f10);

    void p(float f10);

    float q();

    float r();

    void s(float f10);

    float t();

    float u();

    void v(float f10);

    void w(@Nullable Q2 q22);

    float x();

    void y(float f10);

    float z();
}
