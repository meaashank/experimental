package androidx.compose.ui.graphics;

import android.graphics.ComposePathEffect;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.PathDashPathEffect;
import android.graphics.PathEffect;
import androidx.compose.ui.graphics.e3;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nAndroidPathEffect.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPathEffect.android.kt\nandroidx/compose/ui/graphics/AndroidPathEffect_androidKt\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,67:1\n38#2,5:68\n*S KotlinDebug\n*F\n+ 1 AndroidPathEffect.android.kt\nandroidx/compose/ui/graphics/AndroidPathEffect_androidKt\n*L\n53#1:68,5\n*E\n"})
public final class C2006b0 {
    @NotNull
    public static final InterfaceC2121w2 a(@NotNull InterfaceC2121w2 interfaceC2121w2, @NotNull InterfaceC2121w2 interfaceC2121w22) {
        kotlin.jvm.internal.G.n(interfaceC2121w2, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidPathEffect");
        PathEffect pathEffect = ((C2002a0) interfaceC2121w2).f100929b;
        kotlin.jvm.internal.G.n(interfaceC2121w22, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidPathEffect");
        return new C2002a0(new ComposePathEffect(pathEffect, ((C2002a0) interfaceC2121w22).f100929b));
    }

    @NotNull
    public static final InterfaceC2121w2 b(float f10) {
        return new C2002a0(new CornerPathEffect(f10));
    }

    @NotNull
    public static final InterfaceC2121w2 c(@NotNull float[] fArr, float f10) {
        return new C2002a0(new DashPathEffect(fArr, f10));
    }

    @NotNull
    public static final InterfaceC2121w2 d(@NotNull Path path, float f10, float f11, int i10) {
        if (path instanceof Z) {
            return new C2002a0(new PathDashPathEffect(((Z) path).f100925b, f10, f11, f(i10)));
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @NotNull
    public static final PathEffect e(@NotNull InterfaceC2121w2 interfaceC2121w2) {
        kotlin.jvm.internal.G.n(interfaceC2121w2, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidPathEffect");
        return ((C2002a0) interfaceC2121w2).f100929b;
    }

    @NotNull
    public static final PathDashPathEffect.Style f(int i10) {
        e3.a aVar = e3.f101100b;
        aVar.getClass();
        if (i10 == e3.f101103e) {
            return PathDashPathEffect.Style.MORPH;
        }
        aVar.getClass();
        if (i10 == e3.f101102d) {
            return PathDashPathEffect.Style.ROTATE;
        }
        aVar.getClass();
        return i10 == e3.f101101c ? PathDashPathEffect.Style.TRANSLATE : PathDashPathEffect.Style.TRANSLATE;
    }

    @NotNull
    public static final InterfaceC2121w2 g(@NotNull PathEffect pathEffect) {
        return new C2002a0(pathEffect);
    }
}
