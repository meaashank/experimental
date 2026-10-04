package androidx.compose.ui.graphics.drawscope;

import androidx.compose.runtime.T1;
import androidx.compose.ui.graphics.AbstractC2131z0;
import androidx.compose.ui.graphics.C2099r0;
import androidx.compose.ui.graphics.InterfaceC2025e2;
import androidx.compose.ui.graphics.InterfaceC2121w2;
import androidx.compose.ui.graphics.L0;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.U1;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.LayoutDirection;
import e.InterfaceC4348w;
import java.util.List;
import k0.C4813d;
import k0.InterfaceC4814e;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@j
public interface h extends InterfaceC4814e {

    /* JADX INFO: renamed from: P2, reason: collision with root package name */
    @NotNull
    public static final a f101080P2 = a.f101081a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f101081a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f101082b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f101083c;

        static {
            C2099r0.f101402b.getClass();
            f101082b = C2099r0.f101406f;
            U1.f100844b.getClass();
            f101083c = U1.f100846d;
        }

        public final int a() {
            return f101082b;
        }

        public final int b() {
            return f101083c;
        }
    }

    public static final class b {
        @T1
        @Deprecated
        public static float A(@NotNull h hVar, long j10) {
            return k0.o.a(hVar, j10);
        }

        @T1
        @Deprecated
        public static float B(@NotNull h hVar, float f10) {
            return DrawScope$CC.m(hVar, f10);
        }

        @T1
        @Deprecated
        public static float C(@NotNull h hVar, int i10) {
            return C4813d.d(hVar, i10);
        }

        @T1
        @Deprecated
        public static long D(@NotNull h hVar, long j10) {
            return C4813d.e(hVar, j10);
        }

        @T1
        @Deprecated
        public static float E(@NotNull h hVar, long j10) {
            return C4813d.f(hVar, j10);
        }

        @T1
        @Deprecated
        public static float F(@NotNull h hVar, float f10) {
            return DrawScope$CC.q(hVar, f10);
        }

        @T1
        @Deprecated
        @NotNull
        public static P.j G(@NotNull h hVar, @NotNull k0.l lVar) {
            return C4813d.h(hVar, lVar);
        }

        @T1
        @Deprecated
        public static long H(@NotNull h hVar, long j10) {
            return C4813d.i(hVar, j10);
        }

        @T1
        @Deprecated
        public static long I(@NotNull h hVar, float f10) {
            return k0.o.b(hVar, f10);
        }

        @T1
        @Deprecated
        public static long J(@NotNull h hVar, float f10) {
            return C4813d.j(hVar, f10);
        }

        @T1
        @Deprecated
        public static long K(@NotNull h hVar, int i10) {
            return C4813d.k(hVar, i10);
        }

        @Deprecated
        public static void f(@NotNull h hVar, @NotNull InterfaceC2025e2 interfaceC2025e2, long j10, long j11, long j12, long j13, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f10, @NotNull k kVar, @Nullable L0 l02, int i10, int i11) {
            DrawScope$CC.a(hVar, interfaceC2025e2, j10, j11, j12, j13, f10, kVar, l02, i10, i11);
        }

        @Deprecated
        public static long u(@NotNull h hVar) {
            return DrawScope$CC.b(hVar);
        }

        @Deprecated
        public static long v(@NotNull h hVar) {
            return DrawScope$CC.c(hVar);
        }

        @Deprecated
        public static void w(@NotNull h hVar, @NotNull GraphicsLayer graphicsLayer, long j10, @NotNull ed.l<? super h, kotlin.L0> lVar) {
            DrawScope$CC.d(hVar, graphicsLayer, j10, lVar);
        }

        @T1
        @Deprecated
        public static int y(@NotNull h hVar, long j10) {
            return C4813d.a(hVar, j10);
        }

        @T1
        @Deprecated
        public static int z(@NotNull h hVar, float f10) {
            return C4813d.b(hVar, f10);
        }
    }

    void C1(@NotNull GraphicsLayer graphicsLayer, long j10, @NotNull ed.l<? super h, kotlin.L0> lVar);

    void D0(@NotNull Path path, @NotNull AbstractC2131z0 abstractC2131z0, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f10, @NotNull k kVar, @Nullable L0 l02, int i10);

    void K1(long j10, long j11, long j12, long j13, @NotNull k kVar, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f10, @Nullable L0 l02, int i10);

    void Q0(@NotNull InterfaceC2025e2 interfaceC2025e2, long j10, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f10, @NotNull k kVar, @Nullable L0 l02, int i10);

    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Prefer usage of drawImage that consumes an optional FilterQuality parameter", replaceWith = @InterfaceC4852c0(expression = "drawImage(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, FilterQuality.Low)", imports = {"androidx.compose.ui.graphics.drawscope", "androidx.compose.ui.graphics.FilterQuality"}))
    /* synthetic */ void R1(InterfaceC2025e2 interfaceC2025e2, long j10, long j11, long j12, long j13, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f10, k kVar, L0 l02, int i10);

    void S0(@NotNull AbstractC2131z0 abstractC2131z0, long j10, long j11, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f10, @NotNull k kVar, @Nullable L0 l02, int i10);

    void U0(long j10, long j11, long j12, float f10, int i10, @Nullable InterfaceC2121w2 interfaceC2121w2, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f11, @Nullable L0 l02, int i11);

    void V0(@NotNull AbstractC2131z0 abstractC2131z0, float f10, float f11, boolean z10, long j10, long j11, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f12, @NotNull k kVar, @Nullable L0 l02, int i10);

    void W0(@NotNull Path path, long j10, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f10, @NotNull k kVar, @Nullable L0 l02, int i10);

    long Y();

    void Y1(long j10, long j11, long j12, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f10, @NotNull k kVar, @Nullable L0 l02, int i10);

    void Z0(long j10, float f10, long j11, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f11, @NotNull k kVar, @Nullable L0 l02, int i10);

    void a1(long j10, long j11, long j12, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f10, @NotNull k kVar, @Nullable L0 l02, int i10);

    long e();

    void e1(long j10, float f10, float f11, boolean z10, long j11, long j12, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f12, @NotNull k kVar, @Nullable L0 l02, int i10);

    @NotNull
    LayoutDirection getLayoutDirection();

    void h2(@NotNull AbstractC2131z0 abstractC2131z0, long j10, long j11, long j12, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f10, @NotNull k kVar, @Nullable L0 l02, int i10);

    void k2(@NotNull AbstractC2131z0 abstractC2131z0, long j10, long j11, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f10, @NotNull k kVar, @Nullable L0 l02, int i10);

    @NotNull
    f l1();

    void n2(@NotNull List<P.g> list, int i10, long j10, float f10, int i11, @Nullable InterfaceC2121w2 interfaceC2121w2, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f11, @Nullable L0 l02, int i12);

    void o2(@NotNull AbstractC2131z0 abstractC2131z0, long j10, long j11, float f10, int i10, @Nullable InterfaceC2121w2 interfaceC2121w2, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f11, @Nullable L0 l02, int i11);

    void r2(@NotNull AbstractC2131z0 abstractC2131z0, float f10, long j10, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f11, @NotNull k kVar, @Nullable L0 l02, int i10);

    void s2(@NotNull InterfaceC2025e2 interfaceC2025e2, long j10, long j11, long j12, long j13, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f10, @NotNull k kVar, @Nullable L0 l02, int i10, int i11);

    void v0(@NotNull List<P.g> list, int i10, @NotNull AbstractC2131z0 abstractC2131z0, float f10, int i11, @Nullable InterfaceC2121w2 interfaceC2121w2, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f11, @Nullable L0 l02, int i12);
}
