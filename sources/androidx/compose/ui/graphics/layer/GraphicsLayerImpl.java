package androidx.compose.ui.graphics.layer;

import android.graphics.Matrix;
import android.graphics.Outline;
import androidx.compose.ui.graphics.C0;
import androidx.compose.ui.graphics.K0;
import androidx.compose.ui.graphics.Q2;
import androidx.compose.ui.graphics.drawscope.DrawScope$CC;
import androidx.compose.ui.unit.LayoutDirection;
import k0.InterfaceC4814e;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface GraphicsLayerImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Companion f101248a = Companion.f101249a;

    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f101249a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final ed.l<androidx.compose.ui.graphics.drawscope.h, L0> f101250b = new ed.l<androidx.compose.ui.graphics.drawscope.h, L0>() { // from class: androidx.compose.ui.graphics.layer.GraphicsLayerImpl$Companion$DefaultDrawBlock$1
            public final void e(@NotNull androidx.compose.ui.graphics.drawscope.h hVar) {
                K0.f100733b.getClass();
                DrawScope$CC.M(hVar, K0.f100745n, 0L, 0L, 0.0f, null, null, 0, 126, null);
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ L0 invoke(androidx.compose.ui.graphics.drawscope.h hVar) {
                e(hVar);
                return L0.f217464a;
            }
        };

        @NotNull
        public final ed.l<androidx.compose.ui.graphics.drawscope.h, L0> a() {
            return f101250b;
        }
    }

    void A(float f10);

    float B();

    boolean C();

    @NotNull
    Matrix D();

    void E(@Nullable Outline outline, long j10);

    void F(@NotNull InterfaceC4814e interfaceC4814e, @NotNull LayoutDirection layoutDirection, @NotNull GraphicsLayer graphicsLayer, @NotNull ed.l<? super androidx.compose.ui.graphics.drawscope.h, L0> lVar);

    void G(@NotNull C0 c02);

    int H();

    void I(int i10, int i11, long j10);

    long J();

    long K();

    void L(boolean z10);

    void M(boolean z10);

    long N();

    void O(long j10);

    void P(float f10);

    void Q(int i10);

    boolean a();

    void b(int i10);

    float b0();

    @Nullable
    androidx.compose.ui.graphics.L0 c();

    boolean d();

    void e();

    long e0();

    float f();

    void f0(long j10);

    int g();

    void h(float f10);

    @Nullable
    Q2 i();

    void j(float f10);

    void j0(long j10);

    long k();

    float l();

    void m(float f10);

    void n(float f10);

    void o(float f10);

    void p(float f10);

    float q();

    float r();

    void s(@Nullable androidx.compose.ui.graphics.L0 l02);

    float t();

    float u();

    void v(float f10);

    void w(@Nullable Q2 q22);

    float x();

    void y(float f10);

    float z();
}
