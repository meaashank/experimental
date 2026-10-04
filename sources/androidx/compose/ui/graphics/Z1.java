package androidx.compose.ui.graphics;

import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class Z1 {
    @androidx.compose.runtime.T1
    @NotNull
    public static final androidx.compose.ui.p a(@NotNull androidx.compose.ui.p pVar, @NotNull ed.l<? super InterfaceC2008b2, kotlin.L0> lVar) {
        return pVar.P0(new BlockGraphicsLayerElement(lVar));
    }

    @androidx.compose.runtime.T1
    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Replace with graphicsLayer that consumes shadow color parameters", replaceWith = @InterfaceC4852c0(expression = "Modifier.graphicsLayer(scaleX, scaleY, alpha, translationX, translationY, shadowElevation, rotationX, rotationY, rotationZ, cameraDistance, transformOrigin, shape, clip, null, DefaultShadowColor, DefaultShadowColor)", imports = {"androidx.compose.ui.graphics"}))
    public static final androidx.compose.ui.p b(androidx.compose.ui.p pVar, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, c3 c3Var, boolean z10, Q2 q22) {
        long jB = C2012c2.b();
        long j11 = C2012c2.f100943b;
        Q1.f100795b.getClass();
        return d(pVar, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, c3Var, z10, q22, jB, j11, Q1.f100796c);
    }

    public static androidx.compose.ui.p c(androidx.compose.ui.p pVar, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, c3 c3Var, boolean z10, Q2 q22, int i10, Object obj) {
        long j11;
        float f20 = (i10 & 1) != 0 ? 1.0f : f10;
        float f21 = (i10 & 2) != 0 ? 1.0f : f11;
        float f22 = (i10 & 4) == 0 ? f12 : 1.0f;
        float f23 = (i10 & 8) != 0 ? 0.0f : f13;
        float f24 = (i10 & 16) != 0 ? 0.0f : f14;
        float f25 = (i10 & 32) != 0 ? 0.0f : f15;
        float f26 = (i10 & 64) != 0 ? 0.0f : f16;
        float f27 = (i10 & 128) != 0 ? 0.0f : f17;
        float f28 = (i10 & 256) == 0 ? f18 : 0.0f;
        float f29 = (i10 & 512) != 0 ? 8.0f : f19;
        if ((i10 & 1024) != 0) {
            k3.f101140b.getClass();
            j11 = k3.f101141c;
        } else {
            j11 = j10;
        }
        return b(pVar, f20, f21, f22, f23, f24, f25, f26, f27, f28, f29, j11, (i10 & 2048) != 0 ? P2.f100788a : c3Var, (i10 & 4096) != 0 ? false : z10, (i10 & 8192) != 0 ? null : q22);
    }

    @androidx.compose.runtime.T1
    @NotNull
    public static final androidx.compose.ui.p d(@NotNull androidx.compose.ui.p pVar, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, @NotNull c3 c3Var, boolean z10, @Nullable Q2 q22, long j11, long j12, int i10) {
        return pVar.P0(new GraphicsLayerElement(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, c3Var, z10, q22, j11, j12, i10));
    }

    public static androidx.compose.ui.p e(androidx.compose.ui.p pVar, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, c3 c3Var, boolean z10, Q2 q22, long j11, long j12, int i10, int i11, Object obj) {
        long j13;
        int i12;
        float f20 = (i11 & 1) != 0 ? 1.0f : f10;
        float f21 = (i11 & 2) != 0 ? 1.0f : f11;
        float f22 = (i11 & 4) == 0 ? f12 : 1.0f;
        float f23 = (i11 & 8) != 0 ? 0.0f : f13;
        float f24 = (i11 & 16) != 0 ? 0.0f : f14;
        float f25 = (i11 & 32) != 0 ? 0.0f : f15;
        float f26 = (i11 & 64) != 0 ? 0.0f : f16;
        float f27 = (i11 & 128) != 0 ? 0.0f : f17;
        float f28 = (i11 & 256) == 0 ? f18 : 0.0f;
        float f29 = (i11 & 512) != 0 ? 8.0f : f19;
        if ((i11 & 1024) != 0) {
            k3.f101140b.getClass();
            j13 = k3.f101141c;
        } else {
            j13 = j10;
        }
        c3 c3Var2 = (i11 & 2048) != 0 ? P2.f100788a : c3Var;
        boolean z11 = (i11 & 4096) != 0 ? false : z10;
        Q2 q23 = (i11 & 8192) != 0 ? null : q22;
        float f30 = f20;
        long jB = (i11 & 16384) != 0 ? C2012c2.b() : j11;
        long jB2 = (32768 & i11) != 0 ? C2012c2.b() : j12;
        if ((i11 & 65536) != 0) {
            Q1.f100795b.getClass();
            i12 = Q1.f100796c;
        } else {
            i12 = i10;
        }
        return d(pVar, f30, f21, f22, f23, f24, f25, f26, f27, f28, f29, j13, c3Var2, z11, q23, jB, jB2, i12);
    }

    @androidx.compose.runtime.T1
    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Replace with graphicsLayer that consumes a compositing strategy", replaceWith = @InterfaceC4852c0(expression = "Modifier.graphicsLayer(scaleX, scaleY, alpha, translationX, translationY, shadowElevation, rotationX, rotationY, rotationZ, cameraDistance, transformOrigin, shape, clip, null, DefaultShadowColor, DefaultShadowColor, CompositingStrategy.Auto)", imports = {"androidx.compose.ui.graphics"}))
    public static final androidx.compose.ui.p f(androidx.compose.ui.p pVar, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, c3 c3Var, boolean z10, Q2 q22, long j11, long j12) {
        Q1.f100795b.getClass();
        return d(pVar, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, c3Var, z10, q22, j11, j12, Q1.f100796c);
    }

    public static androidx.compose.ui.p g(androidx.compose.ui.p pVar, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, c3 c3Var, boolean z10, Q2 q22, long j11, long j12, int i10, Object obj) {
        long j13;
        float f20 = (i10 & 1) != 0 ? 1.0f : f10;
        float f21 = (i10 & 2) != 0 ? 1.0f : f11;
        float f22 = (i10 & 4) == 0 ? f12 : 1.0f;
        float f23 = (i10 & 8) != 0 ? 0.0f : f13;
        float f24 = (i10 & 16) != 0 ? 0.0f : f14;
        float f25 = (i10 & 32) != 0 ? 0.0f : f15;
        float f26 = (i10 & 64) != 0 ? 0.0f : f16;
        float f27 = (i10 & 128) != 0 ? 0.0f : f17;
        float f28 = (i10 & 256) == 0 ? f18 : 0.0f;
        float f29 = (i10 & 512) != 0 ? 8.0f : f19;
        if ((i10 & 1024) != 0) {
            k3.f101140b.getClass();
            j13 = k3.f101141c;
        } else {
            j13 = j10;
        }
        return f(pVar, f20, f21, f22, f23, f24, f25, f26, f27, f28, f29, j13, (i10 & 2048) != 0 ? P2.f100788a : c3Var, (i10 & 4096) != 0 ? false : z10, (i10 & 8192) != 0 ? null : q22, (i10 & 16384) != 0 ? C2012c2.b() : j11, (i10 & 32768) != 0 ? C2012c2.b() : j12);
    }

    @androidx.compose.runtime.T1
    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Replace with graphicsLayer that consumes an optional RenderEffect parameter and shadow color parameters", replaceWith = @InterfaceC4852c0(expression = "Modifier.graphicsLayer(scaleX, scaleY, alpha, translationX, translationY, shadowElevation, rotationX, rotationY, rotationZ, cameraDistance, transformOrigin, shape, clip, null, DefaultShadowColor, DefaultShadowColor)", imports = {"androidx.compose.ui.graphics"}))
    public static final /* synthetic */ androidx.compose.ui.p h(androidx.compose.ui.p pVar, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, c3 c3Var, boolean z10) {
        return e(pVar, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, c3Var, z10, null, 0L, 0L, 0, 114688, null);
    }

    public static androidx.compose.ui.p i(androidx.compose.ui.p pVar, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, c3 c3Var, boolean z10, int i10, Object obj) {
        long j11;
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        float f20 = (i10 & 2) != 0 ? 1.0f : f11;
        float f21 = (i10 & 4) == 0 ? f12 : 1.0f;
        float f22 = (i10 & 8) != 0 ? 0.0f : f13;
        float f23 = (i10 & 16) != 0 ? 0.0f : f14;
        float f24 = (i10 & 32) != 0 ? 0.0f : f15;
        float f25 = (i10 & 64) != 0 ? 0.0f : f16;
        float f26 = (i10 & 128) != 0 ? 0.0f : f17;
        float f27 = (i10 & 256) == 0 ? f18 : 0.0f;
        float f28 = (i10 & 512) != 0 ? 8.0f : f19;
        if ((i10 & 1024) != 0) {
            k3.f101140b.getClass();
            j11 = k3.f101141c;
        } else {
            j11 = j10;
        }
        return h(pVar, f10, f20, f21, f22, f23, f24, f25, f26, f27, f28, j11, (i10 & 2048) != 0 ? P2.f100788a : c3Var, (i10 & 4096) != 0 ? false : z10);
    }

    @androidx.compose.runtime.T1
    @NotNull
    public static final androidx.compose.ui.p j(@NotNull androidx.compose.ui.p pVar) {
        return InspectableValueKt.e() ? pVar.P0(e(androidx.compose.ui.p.f103112M2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null)) : pVar;
    }
}
