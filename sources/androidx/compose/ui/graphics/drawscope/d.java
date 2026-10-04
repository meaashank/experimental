package androidx.compose.ui.graphics.drawscope;

import androidx.compose.runtime.T1;
import androidx.compose.ui.graphics.InterfaceC2025e2;
import androidx.compose.ui.graphics.L0;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import e.InterfaceC4348w;
import k0.C4813d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface d extends h {

    public static final class a {
        @Deprecated
        public static void a(@NotNull d dVar, @NotNull InterfaceC2025e2 interfaceC2025e2, long j10, long j11, long j12, long j13, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f10, @NotNull k kVar, @Nullable L0 l02, int i10, int i11) {
            DrawScope$CC.a(dVar, interfaceC2025e2, j10, j11, j12, j13, f10, kVar, l02, i10, i11);
        }

        @Deprecated
        public static long b(@NotNull d dVar) {
            return DrawScope$CC.b(dVar);
        }

        @Deprecated
        public static long c(@NotNull d dVar) {
            return DrawScope$CC.c(dVar);
        }

        @Deprecated
        public static void d(@NotNull d dVar, @NotNull GraphicsLayer graphicsLayer, long j10, @NotNull ed.l<? super h, kotlin.L0> lVar) {
            DrawScope$CC.d(dVar, graphicsLayer, j10, lVar);
        }

        @T1
        @Deprecated
        public static int e(@NotNull d dVar, long j10) {
            return C4813d.a(dVar, j10);
        }

        @T1
        @Deprecated
        public static int f(@NotNull d dVar, float f10) {
            return C4813d.b(dVar, f10);
        }

        @T1
        @Deprecated
        public static float g(@NotNull d dVar, long j10) {
            return k0.o.a(dVar, j10);
        }

        @T1
        @Deprecated
        public static float h(@NotNull d dVar, float f10) {
            return f10 / dVar.a();
        }

        @T1
        @Deprecated
        public static float i(@NotNull d dVar, int i10) {
            return C4813d.d(dVar, i10);
        }

        @T1
        @Deprecated
        public static long j(@NotNull d dVar, long j10) {
            return C4813d.e(dVar, j10);
        }

        @T1
        @Deprecated
        public static float k(@NotNull d dVar, long j10) {
            return C4813d.f(dVar, j10);
        }

        @T1
        @Deprecated
        public static float l(@NotNull d dVar, float f10) {
            return dVar.a() * f10;
        }

        @T1
        @Deprecated
        @NotNull
        public static P.j m(@NotNull d dVar, @NotNull k0.l lVar) {
            return C4813d.h(dVar, lVar);
        }

        @T1
        @Deprecated
        public static long n(@NotNull d dVar, long j10) {
            return C4813d.i(dVar, j10);
        }

        @T1
        @Deprecated
        public static long o(@NotNull d dVar, float f10) {
            return k0.o.b(dVar, f10);
        }

        @T1
        @Deprecated
        public static long p(@NotNull d dVar, float f10) {
            return C4813d.j(dVar, f10);
        }

        @T1
        @Deprecated
        public static long q(@NotNull d dVar, int i10) {
            return C4813d.k(dVar, i10);
        }
    }

    void s1();
}
